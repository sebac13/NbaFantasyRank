package com.nbadb.json2pojo.NbaTeamsOld;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class SeasonMeta {

	@SerializedName("calendar_date")
	@Expose
	private Integer calendarDate;
	@SerializedName("season_year")
	@Expose
	private Integer seasonYear;
	@SerializedName("stats_season_year")
	@Expose
	private Integer statsSeasonYear;
	@SerializedName("stats_season_id")
	@Expose
	private Integer statsSeasonId;
	@SerializedName("stats_season_stage")
	@Expose
	private Integer statsSeasonStage;
	@SerializedName("roster_season_year")
	@Expose
	private Integer rosterSeasonYear;
	@SerializedName("schedule_season_year")
	@Expose
	private Integer scheduleSeasonYear;
	@SerializedName("standings_season_year")
	@Expose
	private Integer standingsSeasonYear;
	@SerializedName("season_id")
	@Expose
	private Integer seasonId;
	@SerializedName("display_year")
	@Expose
	private String displayYear;
	@SerializedName("display_season")
	@Expose
	private String displaySeason;
	@SerializedName("season_stage")
	@Expose
	private Integer seasonStage;

	public Integer getCalendarDate() {
		return calendarDate;
	}

	public void setCalendarDate(Integer calendarDate) {
		this.calendarDate = calendarDate;
	}

	public Integer getSeasonYear() {
		return seasonYear;
	}

	public void setSeasonYear(Integer seasonYear) {
		this.seasonYear = seasonYear;
	}

	public Integer getStatsSeasonYear() {
		return statsSeasonYear;
	}

	public void setStatsSeasonYear(Integer statsSeasonYear) {
		this.statsSeasonYear = statsSeasonYear;
	}

	public Integer getStatsSeasonId() {
		return statsSeasonId;
	}

	public void setStatsSeasonId(Integer statsSeasonId) {
		this.statsSeasonId = statsSeasonId;
	}

	public Integer getStatsSeasonStage() {
		return statsSeasonStage;
	}

	public void setStatsSeasonStage(Integer statsSeasonStage) {
		this.statsSeasonStage = statsSeasonStage;
	}

	public Integer getRosterSeasonYear() {
		return rosterSeasonYear;
	}

	public void setRosterSeasonYear(Integer rosterSeasonYear) {
		this.rosterSeasonYear = rosterSeasonYear;
	}

	public Integer getScheduleSeasonYear() {
		return scheduleSeasonYear;
	}

	public void setScheduleSeasonYear(Integer scheduleSeasonYear) {
		this.scheduleSeasonYear = scheduleSeasonYear;
	}

	public Integer getStandingsSeasonYear() {
		return standingsSeasonYear;
	}

	public void setStandingsSeasonYear(Integer standingsSeasonYear) {
		this.standingsSeasonYear = standingsSeasonYear;
	}

	public Integer getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(Integer seasonId) {
		this.seasonId = seasonId;
	}

	public String getDisplayYear() {
		return displayYear;
	}

	public void setDisplayYear(String displayYear) {
		this.displayYear = displayYear;
	}

	public String getDisplaySeason() {
		return displaySeason;
	}

	public void setDisplaySeason(String displaySeason) {
		this.displaySeason = displaySeason;
	}

	public Integer getSeasonStage() {
		return seasonStage;
	}

	public void setSeasonStage(Integer seasonStage) {
		this.seasonStage = seasonStage;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(calendarDate).append(standingsSeasonYear).append(statsSeasonId)
				.append(scheduleSeasonYear).append(rosterSeasonYear).append(displayYear).append(seasonStage)
				.append(displaySeason).append(statsSeasonYear).append(statsSeasonStage).append(seasonId)
				.append(seasonYear).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof SeasonMeta) == false) {
			return false;
		}
		SeasonMeta rhs = ((SeasonMeta) other);
		return new EqualsBuilder().append(calendarDate, rhs.calendarDate)
				.append(standingsSeasonYear, rhs.standingsSeasonYear).append(statsSeasonId, rhs.statsSeasonId)
				.append(scheduleSeasonYear, rhs.scheduleSeasonYear).append(rosterSeasonYear, rhs.rosterSeasonYear)
				.append(displayYear, rhs.displayYear).append(seasonStage, rhs.seasonStage)
				.append(displaySeason, rhs.displaySeason).append(statsSeasonYear, rhs.statsSeasonYear)
				.append(statsSeasonStage, rhs.statsSeasonStage).append(seasonId, rhs.seasonId)
				.append(seasonYear, rhs.seasonYear).isEquals();
	}

}
