package com.spring.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.api.dao.PlayerDao;
import com.spring.api.model.Player;

@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	private PlayerDao playerDao;

	@Transactional
	@Override
	public List<Player> players() {
		return playerDao.players();
		
	}

	@Transactional
	@Override
	public Player getPlayer(int id) {
		
		return playerDao.getPlayer(id);
	}

	@Transactional
	@Override
	public void addPlayer(Player player) {
		 playerDao.addPlayer(player);
	}

	@Transactional
	@Override
	public int deletePlayer(int id) {
		return playerDao.deletePlayer(id);
		
	}
	
	

}
