
package com.json2pojo.players;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Players {

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

    public Players withInternal(Internal internal) {
        this.internal = internal;
        return this;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Players withLeague(League league) {
        this.league = league;
        return this;
    }

}
