package com.nbadb.json2pojo.NbaTeamsOld;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class SportsMeta {

	@SerializedName("date_time")
	@Expose
	private String dateTime;
	@SerializedName("season_meta")
	@Expose
	private SeasonMeta seasonMeta;
	@SerializedName("next")
	@Expose
	private Next next;

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public SeasonMeta getSeasonMeta() {
		return seasonMeta;
	}

	public void setSeasonMeta(SeasonMeta seasonMeta) {
		this.seasonMeta = seasonMeta;
	}

	public Next getNext() {
		return next;
	}

	public void setNext(Next next) {
		this.next = next;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(seasonMeta).append(dateTime).append(next).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof SportsMeta) == false) {
			return false;
		}
		SportsMeta rhs = ((SportsMeta) other);
		return new EqualsBuilder().append(seasonMeta, rhs.seasonMeta).append(dateTime, rhs.dateTime)
				.append(next, rhs.next).isEquals();
	}

}