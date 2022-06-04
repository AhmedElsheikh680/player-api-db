package com.spring.api.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.api.model.Player;

@Repository
public class PlayerDaoImpl implements PlayerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Player> players() {
		Session session =  sessionFactory.getCurrentSession();
		Query query =  session.createQuery("from Player order by name asc", Player.class);
		return query.getResultList();
	}

	@Override
	public Player getPlayer(int id) {
		Session session =  sessionFactory.getCurrentSession();
		return session.get(Player.class, id);
		
	}

	@Override
	public void addPlayer(Player player) {
		Session session =  sessionFactory.getCurrentSession();
		 session.saveOrUpdate(player);
	}

	@Override
	public int deletePlayer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query =  session.createQuery("delete from Player where id=?1");
		query.setInteger(1, id);
		return query.executeUpdate();
		
	}

}
