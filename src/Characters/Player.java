package Characters;

public class Player implements ICharacter{ // singleton

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

    private static Player player = new Player(50, 50, 20, 10, false, true, 0, 0, 1, 0);

    private Player(int health, int maxHealth, int strength, int defence, boolean isDead, boolean isPlayer, int positionX, int positionY, int level, int experience) {
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

    public static Player getInstance() {
        return player;
    }

    @Override
    public void printStats() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Health: " + health);
        System.out.println("Max Health: " + maxHealth);
        System.out.println("Strength: " + strength);
        System.out.println("Defence: " + defence);
        System.out.println("Exp: " + experience);
        System.out.println("Level: " + level);
        System.out.println("------------------------------------------------------------------------");
    }

    @Override
    public void damage(int val) {
        if(val < 0) {
            val = 0;
        }
        health -= val;
        if(health <= 0) {
            isDead = true;
        }
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
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

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }



}
