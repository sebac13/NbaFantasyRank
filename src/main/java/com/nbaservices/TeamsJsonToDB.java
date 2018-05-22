package com.nbaservices;

import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nbadb.HibernateUtil;
import com.nbadb.entities.Teams;
import com.nbadb.json2pojo.nbaTeams.NbaTeams;
import com.nbadb.json2pojo.nbaTeams.Standard;

/**
 * 
 * @author SCieslinski
 * Class used for inserting JSON with 
 * teams data to DB
 * 
 */

public class TeamsJsonToDB {
	BufferedReader bufferedReader = null;
	NbaTeams nbaTeams;

	int year = Calendar.getInstance().get(Calendar.YEAR);
	int month = Calendar.getInstance().get(Calendar.MONTH);

	public void insertNBATeams() {
		Session session = null;
		Transaction tx = null;	
		List<Teams> allTeams = createListOfTeams();
		
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			try {
				tx = session.beginTransaction();
				for (Teams team : allTeams) {
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

	/*
	 * Helper method for creating a list o teams to insert
	 */
	private List<Teams> createListOfTeams() {
		
		List<Teams> allTeams = new ArrayList<Teams>();

		/*
		 * This condition is used for making application safe when 
		 * new NBA season will be started and JSON url address will change
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
					Teams teams = new Teams();
					
					teams.setTeamId(Long.parseLong(standard.getTeamId()));
					teams.setIsNbaTeam(standard.getIsNBAFranchise());
					teams.setTeamNickname(standard.getNickname());
					teams.setTeamName(standard.getFullName());
					teams.setTeamCode(standard.getTricode());
					teams.setTeamAbbrev(standard.getUrlName());
					teams.setCity(standard.getCity());
					teams.setDivisionId(standard.getDivName());
					teams.setConference(standard.getConfName());
					teams.setState("test");
					
					allTeams.add(teams);
				}
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return allTeams;
	}

}
