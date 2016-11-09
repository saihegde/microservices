package com.pavitlabs.workshop.teams.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.pavitlabs.workshop.teams.model.Player;

@RestResource(path="players", rel="player") 
public interface PlayerRepository extends CrudRepository<Player, Long>{

}
