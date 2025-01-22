package com.rios.dslist_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rios.dslist_backend.dto.GameListDTO;
import com.rios.dslist_backend.dto.GameMinDTO;
import com.rios.dslist_backend.services.GameListService;
import com.rios.dslist_backend.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll() {

		List<GameListDTO> result = gameListService.findAll();
		return result;

	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {

		List<GameMinDTO> result = gameService.findByList(listId);
		return result;

	}

}
