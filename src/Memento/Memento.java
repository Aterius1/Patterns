package Memento;

public class Memento {
    PlayerState state;

    public Memento(PlayerState state) {
        this.state = state;
    }

    public PlayerState getState() {
        return state;
    }
}
