
package com.json2pojo.players;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Standard {

    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("personId")
    @Expose
    private String personId;
    @SerializedName("teamId")
    @Expose
    private String teamId;
    @SerializedName("jersey")
    @Expose
    private String jersey;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("pos")
    @Expose
    private String pos;
    @SerializedName("heightFeet")
    @Expose
    private String heightFeet;
    @SerializedName("heightInches")
    @Expose
    private String heightInches;
    @SerializedName("heightMeters")
    @Expose
    private String heightMeters;
    @SerializedName("weightPounds")
    @Expose
    private String weightPounds;
    @SerializedName("weightKilograms")
    @Expose
    private String weightKilograms;
    @SerializedName("dateOfBirthUTC")
    @Expose
    private String dateOfBirthUTC;
    @SerializedName("teams")
    @Expose
    private List<Team> teams = null;
    @SerializedName("draft")
    @Expose
    private Draft draft;
    @SerializedName("nbaDebutYear")
    @Expose
    private String nbaDebutYear;
    @SerializedName("yearsPro")
    @Expose
    private String yearsPro;
    @SerializedName("collegeName")
    @Expose
    private String collegeName;
    @SerializedName("lastAffiliation")
    @Expose
    private String lastAffiliation;
    @SerializedName("country")
    @Expose
    private String country;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Standard withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Standard withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Standard withPersonId(String personId) {
        this.personId = personId;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Standard withTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getJersey() {
        return jersey;
    }

    public void setJersey(String jersey) {
        this.jersey = jersey;
    }

    public Standard withJersey(String jersey) {
        this.jersey = jersey;
        return this;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Standard withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Standard withPos(String pos) {
        this.pos = pos;
        return this;
    }

    public String getHeightFeet() {
        return heightFeet;
    }

    public void setHeightFeet(String heightFeet) {
        this.heightFeet = heightFeet;
    }

    public Standard withHeightFeet(String heightFeet) {
        this.heightFeet = heightFeet;
        return this;
    }

    public String getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(String heightInches) {
        this.heightInches = heightInches;
    }

    public Standard withHeightInches(String heightInches) {
        this.heightInches = heightInches;
        return this;
    }

    public String getHeightMeters() {
        return heightMeters;
    }

    public void setHeightMeters(String heightMeters) {
        this.heightMeters = heightMeters;
    }

    public Standard withHeightMeters(String heightMeters) {
        this.heightMeters = heightMeters;
        return this;
    }

    public String getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(String weightPounds) {
        this.weightPounds = weightPounds;
    }

    public Standard withWeightPounds(String weightPounds) {
        this.weightPounds = weightPounds;
        return this;
    }

    public String getWeightKilograms() {
        return weightKilograms;
    }

    public void setWeightKilograms(String weightKilograms) {
        this.weightKilograms = weightKilograms;
    }

    public Standard withWeightKilograms(String weightKilograms) {
        this.weightKilograms = weightKilograms;
        return this;
    }

    public String getDateOfBirthUTC() {
        return dateOfBirthUTC;
    }

    public void setDateOfBirthUTC(String dateOfBirthUTC) {
        this.dateOfBirthUTC = dateOfBirthUTC;
    }

    public Standard withDateOfBirthUTC(String dateOfBirthUTC) {
        this.dateOfBirthUTC = dateOfBirthUTC;
        return this;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Standard withTeams(List<Team> teams) {
        this.teams = teams;
        return this;
    }

    public Draft getDraft() {
        return draft;
    }

    public void setDraft(Draft draft) {
        this.draft = draft;
    }

    public Standard withDraft(Draft draft) {
        this.draft = draft;
        return this;
    }

    public String getNbaDebutYear() {
        return nbaDebutYear;
    }

    public void setNbaDebutYear(String nbaDebutYear) {
        this.nbaDebutYear = nbaDebutYear;
    }

    public Standard withNbaDebutYear(String nbaDebutYear) {
        this.nbaDebutYear = nbaDebutYear;
        return this;
    }

    public String getYearsPro() {
        return yearsPro;
    }

    public void setYearsPro(String yearsPro) {
        this.yearsPro = yearsPro;
    }

    public Standard withYearsPro(String yearsPro) {
        this.yearsPro = yearsPro;
        return this;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Standard withCollegeName(String collegeName) {
        this.collegeName = collegeName;
        return this;
    }

    public String getLastAffiliation() {
        return lastAffiliation;
    }

    public void setLastAffiliation(String lastAffiliation) {
        this.lastAffiliation = lastAffiliation;
    }

    public Standard withLastAffiliation(String lastAffiliation) {
        this.lastAffiliation = lastAffiliation;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Standard withCountry(String country) {
        this.country = country;
        return this;
    }

}
