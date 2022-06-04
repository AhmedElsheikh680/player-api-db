package com.spring.api.dao;

import java.util.List;

import com.spring.api.model.Player;

public interface PlayerDao {
	
	public List<Player> players();
	
	public Player getPlayer(int id);
	
	public void addPlayer(Player player);
	
	public void deletePlayer(int id);

}
