package com.pavitlabs.workshop.teams.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Player Resource
 */
@Entity
public class Player {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String position;
	
	@ManyToOne
	private Team team;
	
	public Player() {
		// Intentionally left blank
	}
	
	public Player(String name, String position) {
		this.name = name;
		this.position = position;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
