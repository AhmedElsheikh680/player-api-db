package com.spring.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.api.exception.PlayerException;
import com.spring.api.model.Player;
import com.spring.api.service.PlayerService;

@RestController
@RequestMapping("/api/v1")
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;

	// http://localhost:8085/player-api-db/api/v1/players
	@GetMapping("/players")
	public List<Player> players(){
		return playerService.players();
	}
	
	@GetMapping("/player/{id}")
	public Player getPlayer(@PathVariable("id") int id) {
		Player player = playerService.getPlayer(id);
		if(player == null) {
			throw new PlayerException("Player Not Found ID: " + id);
		}
		return player;
	}
	
	@GetMapping("/player")
	public Player getPlayerById(@RequestParam int id) {
		Player player = playerService.getPlayer(id);
		if(player == null) {
			throw new PlayerException("Player Not Found ID: " + id);
		}
		return player;
	}
	
	@PostMapping("/player")
	public Player addPlayer(@RequestBody Player player) {
		 playerService.addPlayer(player);
		 return player;
	}
	
	@PutMapping("/player")
	public Player editPlayer(@RequestBody Player player) {
		playerService.addPlayer(player);
		return player;
	}
	
	@DeleteMapping("/player/{id}")
	public String deletePlayer(@PathVariable("id") int id) {
		int result = playerService.deletePlayer(id);
		if(result == 0) { // (1)means id exist (0)id not exist
			throw new PlayerException("Player Not Found: " +id);
		}
		
		return "Deleted Successfully!!";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
