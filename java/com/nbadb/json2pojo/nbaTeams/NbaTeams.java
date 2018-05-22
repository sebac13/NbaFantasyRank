package com.nbadb.json2pojo.nbaTeams;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class NbaTeams {

	@SerializedName("_internal")
	@Expose
	private Internal internal;
	@SerializedName("league")
	@Expose
	private League league;

	public Internal getInternal() {
		return internal;
	}

	public void setInternal(Internal internal) {
		this.internal = internal;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(league).append(internal).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof NbaTeams) == false) {
			return false;
		}
		NbaTeams rhs = ((NbaTeams) other);
		return new EqualsBuilder().append(league, rhs.league).append(internal, rhs.internal).isEquals();
	}

}