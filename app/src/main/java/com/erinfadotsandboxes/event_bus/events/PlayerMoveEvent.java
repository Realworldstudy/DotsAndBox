package com.erinfadotsandboxes.event_bus.events;


import com.erinfadotsandboxes.game.models.Edge;



public class PlayerMoveEvent {

    public final Edge playerMove;

    public PlayerMoveEvent(Edge playerMove) {
        this.playerMove = playerMove;
    }

    @Override
    public String toString() {
        return "PlayerMoveEvent{" +
                "playerMove=" + playerMove +
                '}';
    }
}
