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


public class Client {

	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		NbaTeams nbaTeams;

		try {

			URL urlTeams = new URL("http://data.nba.net/data/10s/prod/v1/2017/teams.json");

			//bufferedReader = new BufferedReader(new FileReader("nba_teams.json"));
			bufferedReader = new BufferedReader(new InputStreamReader(urlTeams.openStream()));
			Gson gson = new GsonBuilder().create();
			//System.out.println(bufferedReader);
			String s = bufferedReader.lines().collect(Collectors.joining());
			
			nbaTeams = gson.fromJson(s, NbaTeams.class);

			System.out.println(nbaTeams.getLeague().getStandard().get(0).getAltCityName());

		} catch (FileNotFoundException e) {
			System.out.println("NIE MA PLIKU");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bufferedReader != null)
				try {
					bufferedReader.close();
					System.out.println("kasdjla");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
