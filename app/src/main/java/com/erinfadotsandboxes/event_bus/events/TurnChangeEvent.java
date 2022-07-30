package com.erinfadotsandboxes.event_bus.events;


import com.erinfadotsandboxes.game.controllers.Game;

public class TurnChangeEvent {
        public final Game.Player nextPlayer;

    public TurnChangeEvent(Game.Player nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    @Override
    public String toString() {
        return "TurnChangeEvent{" +
                "nextPlayer=" + nextPlayer +
                '}';
    }
}
