package com.rios.dslist_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rios.dslist_backend.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
