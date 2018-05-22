package com.nbadb.json2pojo.NbaTeamsOld;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Team {

	@SerializedName("is_nba_team")
	@Expose
	private Boolean isNbaTeam;
	@SerializedName("team_name")
	@Expose
	private String teamName;
	@SerializedName("team_nickname")
	@Expose
	private String teamNickname;
	@SerializedName("team_code")
	@Expose
	private String teamCode;
	@SerializedName("team_abbrev")
	@Expose
	private String teamAbbrev;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("state")
	@Expose
	private String state;
	@SerializedName("team_short_name")
	@Expose
	private String teamShortName;
	@SerializedName("team_id")
	@Expose
	private Integer teamId;
	@SerializedName("conference")
	@Expose
	private String conference;
	@SerializedName("division_id")
	@Expose
	private String divisionId;

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

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
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

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(teamShortName).append(teamName).append(teamAbbrev).append(teamNickname)
				.append(divisionId).append(teamCode).append(state).append(isNbaTeam).append(conference).append(teamId)
				.append(city).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Team) == false) {
			return false;
		}
		Team rhs = ((Team) other);
		return new EqualsBuilder().append(teamShortName, rhs.teamShortName).append(teamName, rhs.teamName)
				.append(teamAbbrev, rhs.teamAbbrev).append(teamNickname, rhs.teamNickname)
				.append(divisionId, rhs.divisionId).append(teamCode, rhs.teamCode).append(state, rhs.state)
				.append(isNbaTeam, rhs.isNbaTeam).append(conference, rhs.conference).append(teamId, rhs.teamId)
				.append(city, rhs.city).isEquals();
	}

}