package com.nbadb.json2pojo.nbaTeams;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author SCieslinski
 * One of POJO class used for mapping 
 * Teams JSON to Java object
 *
 */

public class League {

	@SerializedName("standard")
	@Expose
	private List<Standard> standard = null;

	public List<Standard> getStandard() {
		return standard;
	}

	public void setStandard(List<Standard> standard) {
		this.standard = standard;
	}

}