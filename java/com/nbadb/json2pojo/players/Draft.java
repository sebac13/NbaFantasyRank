
package com.json2pojo.players;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Draft {

    @SerializedName("teamId")
    @Expose
    private String teamId;
    @SerializedName("pickNum")
    @Expose
    private String pickNum;
    @SerializedName("roundNum")
    @Expose
    private String roundNum;
    @SerializedName("seasonYear")
    @Expose
    private String seasonYear;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Draft withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getPickNum() {
        return pickNum;
    }

    public void setPickNum(String pickNum) {
        this.pickNum = pickNum;
    }

    public Draft withPickNum(String pickNum) {
        this.pickNum = pickNum;
        return this;
    }

    public String getRoundNum() {
        return roundNum;
    }

    public void setRoundNum(String roundNum) {
        this.roundNum = roundNum;
    }

    public Draft withRoundNum(String roundNum) {
        this.roundNum = roundNum;
        return this;
    }

    public String getSeasonYear() {
        return seasonYear;
    }

    public void setSeasonYear(String seasonYear) {
        this.seasonYear = seasonYear;
    }

    public Draft withSeasonYear(String seasonYear) {
        this.seasonYear = seasonYear;
        return this;
    }

}
