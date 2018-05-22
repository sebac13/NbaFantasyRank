package com.nbadb.json2pojo.nbaTeams;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * 
 * @author SCieslinski
 * One of POJO class used for mapping 
 * Teams JSON to Java object
 *
 */

public class Standard {

	@SerializedName("isNBAFranchise")
	@Expose
	private Boolean isNBAFranchise;
	@SerializedName("isAllStar")
	@Expose
	private Boolean isAllStar;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("altCityName")
	@Expose
	private String altCityName;
	@SerializedName("fullName")
	@Expose
	private String fullName;
	@SerializedName("tricode")
	@Expose
	private String tricode;
	@SerializedName("teamId")
	@Expose
	private String teamId;
	@SerializedName("nickname")
	@Expose
	private String nickname;
	@SerializedName("urlName")
	@Expose
	private String urlName;
	@SerializedName("confName")
	@Expose
	private String confName;
	@SerializedName("divName")
	@Expose
	private String divName;

	public Boolean getIsNBAFranchise() {
		return isNBAFranchise;
	}

	public void setIsNBAFranchise(Boolean isNBAFranchise) {
		this.isNBAFranchise = isNBAFranchise;
	}

	public Boolean getIsAllStar() {
		return isAllStar;
	}

	public void setIsAllStar(Boolean isAllStar) {
		this.isAllStar = isAllStar;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAltCityName() {
		return altCityName;
	}

	public void setAltCityName(String altCityName) {
		this.altCityName = altCityName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTricode() {
		return tricode;
	}

	public void setTricode(String tricode) {
		this.tricode = tricode;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	public String getConfName() {
		return confName;
	}

	public void setConfName(String confName) {
		this.confName = confName;
	}

	public String getDivName() {
		return divName;
	}

	public void setDivName(String divName) {
		this.divName = divName;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(altCityName).append(divName).append(isNBAFranchise).append(confName)
				.append(nickname).append(isAllStar).append(urlName).append(tricode).append(fullName).append(teamId)
				.append(city).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Standard) == false) {
			return false;
		}
		Standard rhs = ((Standard) other);
		return new EqualsBuilder().append(altCityName, rhs.altCityName).append(divName, rhs.divName)
				.append(isNBAFranchise, rhs.isNBAFranchise).append(confName, rhs.confName)
				.append(nickname, rhs.nickname).append(isAllStar, rhs.isAllStar).append(urlName, rhs.urlName)
				.append(tricode, rhs.tricode).append(fullName, rhs.fullName).append(teamId, rhs.teamId)
				.append(city, rhs.city).isEquals();
	}

}