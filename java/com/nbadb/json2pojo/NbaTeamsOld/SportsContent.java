package com.nbadb.json2pojo.NbaTeamsOld;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class SportsContent {

	@SerializedName("sports_meta")
	@Expose
	private SportsMeta sportsMeta;
	@SerializedName("teams")
	@Expose
	private Teams teams;

	public SportsMeta getSportsMeta() {
		return sportsMeta;
	}

	public void setSportsMeta(SportsMeta sportsMeta) {
		this.sportsMeta = sportsMeta;
	}

	public Teams getTeams() {
		return teams;
	}

	public void setTeams(Teams teams) {
		this.teams = teams;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(teams).append(sportsMeta).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof SportsContent) == false) {
			return false;
		}
		SportsContent rhs = ((SportsContent) other);
		return new EqualsBuilder().append(teams, rhs.teams).append(sportsMeta, rhs.sportsMeta).isEquals();
	}

}
