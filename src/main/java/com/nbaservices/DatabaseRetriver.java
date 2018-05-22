package com.nbaservices;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.nbadb.HibernateUtil;
import com.nbadb.entities.Teams;


/**
 * 
 * @author SCieslinski
 * This class is used for retriving data from
 * Teams table and converting it to List of objects
 * of Teams class. 
 * It could be expanded in later development
 *
 */

public class DatabaseRetriver {
	private SessionFactory sessionFactory;
	private Session session;
	private org.hibernate.Transaction tx;

	public List<Teams> getNBATeams(){
		
		List<Teams> allTeams = null;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			Query query = session.createQuery("select t from Teams t");
			allTeams = query.list();

			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
			sessionFactory.close();
		}
		
		return allTeams;
	}


}
