package Memento;

public class State {
    PlayerState player;

    public PlayerState getPlayer() {
        return player;
    }


    public State(PlayerState player) {
        this.player = player;
    }
}
