package Map;

import Characters.IEnemy;

public class Room {

    private boolean playerHere;
    IEnemy enemy;


    public Room(IEnemy enemy) {
        this.enemy = enemy;
        playerHere = false;
    }

    public boolean isPlayerHere() {
        return playerHere;
    }

    public void setPlayerHere(boolean playerHere) {
        this.playerHere = playerHere;
    }

    public IEnemy getEnemy() {
        return enemy;
    }
}
