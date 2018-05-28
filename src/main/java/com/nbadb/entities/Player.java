package com.nbadb.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author SCieslinski
 *
 * Mapping class for Table Players
 *
 */

@Entity
@Table(name="player")
@Access(value=AccessType.FIELD)
public class Player {
	
	@Id
	@Column(name="PLAYER_ID", unique=true, nullable=false, insertable = false, updatable = false)
	private Long playerId;

	

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="TEAM_ID", unique=true, nullable=false, insertable = false, updatable = false)
	private long teamId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="TEAM_ID")
	private Team team;

	@Column(name="JERSEY")
	private String jersey;

	@Column(name="isActive")
	private boolean isActive;
	
	@Column(name="Position")
	private String postion;

	@Column(name="heightFeet")
	private String heightFeet;
	
	@Column(name="heightInches")
	private String heightInches;
	
	@Column(name="heightMeters")
	private String heightMeters;
	
	@Column(name="weightPounds")
	private String weightPunds;
	
	@Column(name="weightKilograms")
	private String weightKilograms;
	
	@Column(name="dateOfBirthUTC")
	private String dateOfBirthUTC;

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public Team getTeams() {
		return team;
	}

	public void setTeams(Team team) {
		this.team = team;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	public String getJersey() {
		return jersey;
	}

	public void setJersey(String jersey) {
		this.jersey = jersey;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getHeightFeet() {
		return heightFeet;
	}

	public void setHeightFeet(String heightFeet) {
		this.heightFeet = heightFeet;
	}

	public String getHeightInches() {
		return heightInches;
	}

	public void setHeightInches(String heightInches) {
		this.heightInches = heightInches;
	}

	public String getHeightMeters() {
		return heightMeters;
	}

	public void setHeightMeters(String heightMeters) {
		this.heightMeters = heightMeters;
	}

	public String getWeightPunds() {
		return weightPunds;
	}

	public void setWeightPunds(String weightPunds) {
		this.weightPunds = weightPunds;
	}

	public String getWeightKilograms() {
		return weightKilograms;
	}

	public void setWeightKilograms(String weightKilograms) {
		this.weightKilograms = weightKilograms;
	}

	public String getDateOfBirthUTC() {
		return dateOfBirthUTC;
	}

	public void setDateOfBirthUTC(String dateOfBirthUTC) {
		this.dateOfBirthUTC = dateOfBirthUTC;
	}
	
	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}
	
	
	
}
