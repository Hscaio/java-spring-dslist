package com.caiosoares.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caiosoares.dslist.dto.GameDTO;
import com.caiosoares.dslist.dto.GameMiniDTO;
import com.caiosoares.dslist.entities.Game;
import com.caiosoares.dslist.projections.GameMiniProjection;
import com.caiosoares.dslist.repositories.GameRepository;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;	
	
	@Transactional(readOnly = true)
	public List<GameMiniDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMiniDTO(x)).toList();
	}	
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		return new GameDTO(gameRepository.findById(id).get());
	}
	
	@Transactional(readOnly = true)
	public List<GameMiniDTO> findByList(Long listId){
		List<GameMiniProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMiniDTO(x)).toList();
	}	
}