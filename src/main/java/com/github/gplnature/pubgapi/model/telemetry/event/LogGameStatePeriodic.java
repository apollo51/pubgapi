package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.GameState;
import com.google.gson.annotations.SerializedName;

public class LogGameStatePeriodic extends TelemetryEvent {

    @SerializedName("gameState")
    private GameState gameState;

    public LogGameStatePeriodic() {
        super();
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
