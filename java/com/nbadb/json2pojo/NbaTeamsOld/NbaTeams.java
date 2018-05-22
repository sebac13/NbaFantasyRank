package com.nbadb.json2pojo.NbaTeamsOld;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class NbaTeams {

	@SerializedName("sports_content")
	@Expose
	private SportsContent sportsContent;

	public SportsContent getSportsContent() {
		return sportsContent;
	}

	public void setSportsContent(SportsContent sportsContent) {
		this.sportsContent = sportsContent;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(sportsContent).toHashCode();
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
		return new EqualsBuilder().append(sportsContent, rhs.sportsContent).isEquals();
	}

}