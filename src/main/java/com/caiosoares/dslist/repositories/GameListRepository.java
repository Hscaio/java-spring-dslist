package com.caiosoares.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.caiosoares.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}