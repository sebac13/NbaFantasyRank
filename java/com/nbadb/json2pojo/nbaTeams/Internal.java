package com.nbadb.json2pojo.nbaTeams;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Internal {

	@SerializedName("pubDateTime")
	@Expose
	private String pubDateTime;
	@SerializedName("xslt")
	@Expose
	private String xslt;
	@SerializedName("eventName")
	@Expose
	private String eventName;

	public String getPubDateTime() {
		return pubDateTime;
	}

	public void setPubDateTime(String pubDateTime) {
		this.pubDateTime = pubDateTime;
	}

	public String getXslt() {
		return xslt;
	}

	public void setXslt(String xslt) {
		this.xslt = xslt;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(xslt).append(pubDateTime).append(eventName).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Internal) == false) {
			return false;
		}
		Internal rhs = ((Internal) other);
		return new EqualsBuilder().append(xslt, rhs.xslt).append(pubDateTime, rhs.pubDateTime)
				.append(eventName, rhs.eventName).isEquals();
	}

}