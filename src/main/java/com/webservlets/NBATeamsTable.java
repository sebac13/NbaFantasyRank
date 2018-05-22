package com.webservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nbadb.entities.Teams;
import com.nbaservices.DatabaseRetriver;

/**
 * 
 * @author SCieslinski
 * This servlet is used for creating 
 * Teams table on the browser using
 * data from database
 */

public class NBATeamsTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SessionFactory c = new Configuration().configure().buildSessionFactory();
	List<Teams> allTeams = new DatabaseRetriver().getNBATeams();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		/*
		 * Definition of table css
		 */
		out.print("<style>");
		out.print("table {sd font-family: arial, sans-serif; border-collapse: collapse; width: 100%; }");
		out.print("td, th { border: 1px solid #dddddd; text-align: left; padding: 8px; }");
		out.print("tr:nth-child(even) { background-color: #dddddd; }");
		out.print("</style>");
		
		/*
		 * v1.0 of Teams table
		 */
		out.print("<table>");
		for (Teams team : allTeams) {
			out.print("<tr>");
			out.print("<td>" + team.getCity() + "</td>");
			out.print("<td>" + team.getConference() + "</td>");
			out.print("<td>" + team.getDivisionId() + "</td>");
			out.print("<td>" + team.getState() + "</td>");
			out.print("<td>" + team.getTeamName() + "</td>");
			out.print("</tr>");
		}
		out.print("</table>");


	}
}
