package com.spring.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.api.model.Player;
import com.spring.api.service.PlayerService;

@RestController
@RequestMapping("/api/v1")
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;

	@GetMapping("/players")
	public List<Player> players(){
		return playerService.players();
	}
	
	@GetMapping("/player/{id}")
	public Player getPlayer(@PathVariable("id") int id) {
		return playerService.getPlayer(id);
	}
	
	@GetMapping("/player")
	public Player getPlayerById(@RequestParam int id) {
		return playerService.getPlayer(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
