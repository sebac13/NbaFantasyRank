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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author SCieslinski
 *
 * Mapping class for Table Teams
 *
 */

@Entity
@Table(name="TEAM")
@Access(value=AccessType.FIELD)
public class Team {
	
	@Id
	@Column(name="TEAM_ID", unique=true, nullable=false, insertable = false, updatable = false)
	private Long teamId;
	
	@Column(name="IS_NBA_TEAM")
	private Boolean isNbaTeam;

	@Column(name="TEAM_NAME")
	private String teamName;

	@Column(name="TEAM_NICKNAME")
	private String teamNickname;

	@Column(name="TEAM_CODE")
	private String teamCode;

	@Column(name="TEAM_ABBREV")
	private String teamAbbrev;

	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="TEAM_SHORT_NAME")
	private String teamShortName;
	
	@Column(name="CONFERENCE")
	private String conference;
	
	@Column(name="DIVISION_ID")
	private String divisionId;

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	@Override
	public String toString() {
		return "Teams [teamId=" + teamId + ", isNbaTeam=" + isNbaTeam + ", teamName=" + teamName + ", teamNickname="
				+ teamNickname + ", teamCode=" + teamCode + ", teamAbbrev=" + teamAbbrev + ", city=" + city + ", state="
				+ state + ", teamShortName=" + teamShortName + ", conference=" + conference + ", divisionId="
				+ divisionId + "]";
	}

	public Boolean getIsNbaTeam() {
		return isNbaTeam;
	}

	public void setIsNbaTeam(Boolean isNbaTeam) {
		this.isNbaTeam = isNbaTeam;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamNickname() {
		return teamNickname;
	}

	public void setTeamNickname(String teamNickname) {
		this.teamNickname = teamNickname;
	}

	public String getTeamCode() {
		return teamCode;
	}

	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}

	public String getTeamAbbrev() {
		return teamAbbrev;
	}

	public void setTeamAbbrev(String teamAbbrev) {
		this.teamAbbrev = teamAbbrev;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTeamShortName() {
		return teamShortName;
	}

	public void setTeamShortName(String teamShortName) {
		this.teamShortName = teamShortName;
	}

	public String getConference() {
		return conference;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}

	public String getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	
}
