package com.nbadb;


import com.nbaservices.JsonToDB;
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
		
		JsonToDB jsonToDB = new JsonToDB();
		
		//jsonToDB.insertNBATeams();
		
		jsonToDB.insertNBAPlayers();
		
		
		
	}
}