package Memento;

public class PlayerState {
    private int health;
    private int maxHealth;
    private int strength;
    private int defence;
    private boolean isDead;
    private boolean isPlayer;
    private int positionX;
    private int positionY;
    private int level;
    private int experience;

    public PlayerState(int health, int maxHealth, int strength, int defence, boolean isDead, boolean isPlayer, int positionX, int positionY, int level, int experience) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.strength = strength;
        this.defence = defence;
        this.isDead = isDead;
        this.isPlayer = isPlayer;
        this.positionX = positionX;
        this.positionY = positionY;
        this.level = level;
        this.experience = experience;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefence() {
        return defence;
    }

    public boolean isDead() {
        return isDead;
    }

    public boolean isPlayer() {
        return isPlayer;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }
}
