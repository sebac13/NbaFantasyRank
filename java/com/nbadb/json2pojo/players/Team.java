
package com.json2pojo.players;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team {

    @SerializedName("teamId")
    @Expose
    private String teamId;
    @SerializedName("seasonStart")
    @Expose
    private String seasonStart;
    @SerializedName("seasonEnd")
    @Expose
    private String seasonEnd;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Team withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getSeasonStart() {
        return seasonStart;
    }

    public void setSeasonStart(String seasonStart) {
        this.seasonStart = seasonStart;
    }

    public Team withSeasonStart(String seasonStart) {
        this.seasonStart = seasonStart;
        return this;
    }

    public String getSeasonEnd() {
        return seasonEnd;
    }

    public void setSeasonEnd(String seasonEnd) {
        this.seasonEnd = seasonEnd;
    }

    public Team withSeasonEnd(String seasonEnd) {
        this.seasonEnd = seasonEnd;
        return this;
    }

}
