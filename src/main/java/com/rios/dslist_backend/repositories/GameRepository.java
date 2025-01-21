package com.rios.dslist_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rios.dslist_backend.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
