package com.pavitlabs.workshop.teams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pavitlabs.workshop.teams.model.Team;
import com.pavitlabs.workshop.teams.repository.TeamRepository;

//@RestController
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;

	@RequestMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}

	@RequestMapping("/teams/{teamId}")
	public Team getTeamById(@PathVariable Long teamId) {
		return teamRepository.findOne(teamId);
	}
	
}
