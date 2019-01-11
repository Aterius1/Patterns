package Memento;

public class Originator {
    private PlayerState state;

    public void setState (PlayerState state) {
        this.state = state;
    }

    public PlayerState getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
