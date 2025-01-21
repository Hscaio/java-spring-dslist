package com.caiosoares.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiosoares.dslist.dto.GameMiniDTO;
import com.caiosoares.dslist.entities.Game;
import com.caiosoares.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;	
	
	public List<GameMiniDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMiniDTO(x)).toList();
	}
}