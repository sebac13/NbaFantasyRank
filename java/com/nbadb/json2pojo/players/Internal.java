
package com.json2pojo.players;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public Internal withPubDateTime(String pubDateTime) {
        this.pubDateTime = pubDateTime;
        return this;
    }

    public String getXslt() {
        return xslt;
    }

    public void setXslt(String xslt) {
        this.xslt = xslt;
    }

    public Internal withXslt(String xslt) {
        this.xslt = xslt;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Internal withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

}
