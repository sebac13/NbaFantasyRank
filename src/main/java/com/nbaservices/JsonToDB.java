package com.nbaservices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nbadb.HibernateUtil;
import com.nbadb.entities.Player;
import com.nbadb.entities.Team;
import com.nbadb.json2pojo.nbaTeams.NbaTeams;
import com.nbadb.json2pojo.nbaTeams.Standard;
import com.nbadb.json2pojo.players.NbaPlayers;

/**
 * 
 * @author SCieslinski Class used for inserting JSON with teams data to DB
 * 
 */

public class JsonToDB {
	BufferedReader bufferedReader = null;
	NbaTeams nbaTeams;
	NbaPlayers players;

	int year = Calendar.getInstance().get(Calendar.YEAR);
	int month = Calendar.getInstance().get(Calendar.MONTH);

	public void insertNBATeams() {
		Session session = null;
		Transaction tx = null;
		List<Team> allTeams = createListOfTeams();

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			try {
				tx = session.beginTransaction();
				for (Team team : allTeams) {
					session.saveOrUpdate(team);
				}
				tx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
			}
		} finally {
			session.close();
		}

	}

	public void insertNBAPlayers() {
		Session session = null;
		Transaction tx = null;
		List<Player> allPlayers = createListOfPlayers();
		Team team = new Team();

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			try {
				tx = session.beginTransaction();
				for (Player player : allPlayers) {
					Query query = null;
					try {
						query = session.createQuery("FROM Team where team_id = '" + player.getTeamId() + "'");
						team = (Team) query.getSingleResult();
						player.setTeams(team);
						session.saveOrUpdate(player);
					} catch (NoResultException e) {
						team = null;
						session.saveOrUpdate(player);
					}
					
				}
				tx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
			}
		} finally {
			session.close();
		}

	}

	/*
	 * Helper method for creating a list o teams to insert
	 */
	private List<Team> createListOfTeams() {

		List<Team> allTeams = new ArrayList<Team>();

		/*
		 * This condition is used for making application safe when new NBA
		 * season will be started and JSON url address will change
		 */
		if (month < 11) {
			year = year - 1;
		}
		try {
			URL urlTeams = new URL("http://data.nba.net/data/10s/prod/v1/" + year + "/teams.json");
			bufferedReader = new BufferedReader(new InputStreamReader(urlTeams.openStream()));
			Gson gson = new GsonBuilder().create();

			nbaTeams = gson.fromJson(bufferedReader, NbaTeams.class);

			for (Standard standard : nbaTeams.getLeague().getStandard()) {
				if (standard.getIsNBAFranchise() == true) {
					Team team = new Team();

					team.setTeamId(Long.parseLong(standard.getTeamId()));
					team.setIsNbaTeam(standard.getIsNBAFranchise());
					team.setTeamNickname(standard.getNickname());
					team.setTeamName(standard.getFullName());
					team.setTeamCode(standard.getTricode());
					team.setTeamAbbrev(standard.getUrlName());
					team.setCity(standard.getCity());
					team.setDivisionId(standard.getDivName());
					team.setConference(standard.getConfName());
					team.setState("test");

					allTeams.add(team);
				}
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return allTeams;
	}

	private List<Player> createListOfPlayers() {
		List<Player> allPlayers = new ArrayList<Player>();

		if (month < 11) {
			year = year - 1;
		}
		try {
			URL urlPlayers = new URL("http://data.nba.net/data/10s/prod/v1/" + year + "/players.json");

			bufferedReader = new BufferedReader(new InputStreamReader(urlPlayers.openStream()));
			Gson gson = new GsonBuilder().create();

			players = gson.fromJson(bufferedReader, NbaPlayers.class);

			for (com.nbadb.json2pojo.players.Standard standard : players.getLeague().getStandard()) {
				Player player = new Player();
				Team team = new Team();
				if (!standard.getTeamId().equals("")) {
					player.setPlayerId(Long.parseLong(standard.getPersonId()));
					player.setFirstName(standard.getFirstName());
					player.setLastName(standard.getLastName());
					player.setJersey(standard.getJersey());
					player.setActive(standard.getIsActive());
					player.setPostion(standard.getPos());
					player.setHeightFeet(standard.getHeightFeet());
					player.setHeightInches(standard.getHeightInches());
					player.setHeightMeters(standard.getHeightMeters());
					player.setWeightKilograms(standard.getWeightKilograms());
					player.setWeightPunds(standard.getWeightPounds());
					player.setDateOfBirthUTC(standard.getDateOfBirthUTC());
					player.setTeamId(Long.parseLong(standard.getTeamId()));
					allPlayers.add(player);
				}
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return allPlayers;
	}

}
