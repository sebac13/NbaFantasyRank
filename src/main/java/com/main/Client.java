package com.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nbadb.json2pojo.nbaTeams.NbaTeams;
import com.nbadb.json2pojo.players.NbaPlayers;
/**
 * 
 * @author SCieslinski
 * 
 * This Client class has been created for testing 
 * how reading GSON libary is behaiving and how
 * It should be used
 * 
 */

public class Client {

	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		NbaPlayers nbaPlayers;
		NbaTeams nbaTeams;

		try {
			URL urlTeams = new URL("http://data.nba.net/data/10s/prod/v1/2017/teams.json");
			URL urlPlayers = new URL("http://data.nba.net/data/10s/prod/v1/2017/players.json");
			
			bufferedReader = new BufferedReader(new InputStreamReader(urlPlayers.openStream()));
			
			Gson gson = new GsonBuilder().create();
			String s = bufferedReader.lines().collect(Collectors.joining());
			nbaPlayers = gson.fromJson(s, NbaPlayers.class);
			System.out.println(nbaPlayers.getLeague().getStandard().get(0).getTeamId());

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null)
				try {
					bufferedReader.close();
					System.out.println("kasdjla");
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
