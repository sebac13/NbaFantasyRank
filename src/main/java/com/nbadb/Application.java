package com.nbadb;


import java.util.List;

import com.nbadb.entities.Teams;
import com.nbaservices.DatabaseRetriver;
import com.nbaservices.TeamsJsonToDB;
/**
 * 
 * @author SCieslinski
 * This class is used for checking connection 
 * between Hibernate and DB. Also it was used for
 * inserting Teams data from JSON to DB
 *
 */

public class Application {

	public static void main(String[] args) {	
		
		TeamsJsonToDB teamsJsonToDB = new TeamsJsonToDB();
		
		teamsJsonToDB.insertNBATeams();
		
		List<Teams> allTeams = new DatabaseRetriver().getNBATeams();
		System.out.println(allTeams.get(0).getCity());
		for(Teams team: allTeams)
			System.out.println(team.getCity());
		
		
	}
}