package com.github.gplnature.pubgapi.model.match;

import com.github.gplnature.pubgapi.model.GameMode;
import com.github.gplnature.pubgapi.model.Map;
import com.github.gplnature.pubgapi.model.MatchType;
import com.github.gplnature.pubgapi.model.SeasonState;
import java.time.ZonedDateTime;

public class MatchAttributes {

    private ZonedDateTime createdAt;

    private Integer duration;

    private MatchType matchType;

    private GameMode gameMode;

    private String patchVersion;

    private SeasonState seasonState;

    private String shardId;

    private String titleId;

    private Map mapName;

    private Boolean isCustomMatch;

    public MatchAttributes() {
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public String getPatchVersion() {
        return patchVersion;
    }

    public void setPatchVersion(String patchVersion) {
        this.patchVersion = patchVersion;
    }

    public SeasonState getSeasonState() {
        return seasonState;
    }

    public void setSeasonState(SeasonState seasonState) {
        this.seasonState = seasonState;
    }

    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public Map getMapName() {
        return mapName;
    }

    public void setMapName(Map mapName) {
        this.mapName = mapName;
    }

    public Boolean getCustomMatch() {
        return isCustomMatch;
    }

    public void setCustomMatch(Boolean customMatch) {
        isCustomMatch = customMatch;
    }
}
