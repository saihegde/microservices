package com.pavitlabs.workshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pavitlabs.workshop.teams.model.Player;
import com.pavitlabs.workshop.teams.model.Team;
import com.pavitlabs.workshop.teams.repository.TeamRepository;

@SpringBootApplication
public class TeamServiceApplication {

	@Autowired
	private TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(TeamServiceApplication.class, args);
	}

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		list.add(team);
		Player sai = new Player("Sai", "Defence");
		team.setPlayers(new HashSet<Player>(Arrays.asList(sai)));

		team = new Team();
		team.setLocation("Washington");
		team.setName("Generals");
		list.add(team);

		teamRepository.save(list);
	}
}
