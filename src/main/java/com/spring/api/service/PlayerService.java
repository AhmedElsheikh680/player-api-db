package com.spring.api.service;

import java.util.List;

import com.spring.api.model.Player;

public interface PlayerService {
	
	public List<Player> players();
	
	public Player getPlayer(int id);

	public void addPlayer(Player player);
	
	public int deletePlayer(int id);
}
