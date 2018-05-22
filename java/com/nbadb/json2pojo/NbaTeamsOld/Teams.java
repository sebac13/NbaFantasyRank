
package com.nbadb.json2pojo.NbaTeamsOld;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Teams {

	@SerializedName("season_year")
	@Expose
	private Integer seasonYear;
	@SerializedName("team")
	@Expose
	private List<Team> team = null;

	public Integer getSeasonYear() {
		return seasonYear;
	}

	public void setSeasonYear(Integer seasonYear) {
		this.seasonYear = seasonYear;
	}

	public List<Team> getTeam() {
		return team;
	}

	public void setTeam(List<Team> team) {
		this.team = team;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(seasonYear).append(team).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Teams) == false) {
			return false;
		}
		Teams rhs = ((Teams) other);
		return new EqualsBuilder().append(seasonYear, rhs.seasonYear).append(team, rhs.team).isEquals();
	}

}