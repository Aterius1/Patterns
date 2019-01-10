package Characters;

public class Boss implements ICharacter, IEnemy {

    private int health;
    private int maxHealth;
    private int strength;
    private int defence;
    private boolean isDead;
    private boolean isPlayer;
    private int positionX;
    private int positionY;

    public Boss(int health, int maxHealth, int strength, int defence, boolean isDead, boolean isPlayer) {
        this.health = health;
        this.maxHealth = maxHealth;
        this.strength = strength;
        this.defence = defence;
        this.isDead = isDead;
        this.isPlayer = isPlayer;
    }

    public String type() {
        return "the boss";
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

    @Override
    public void printStats() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Health: " + health);
        System.out.println("Max Health: " + maxHealth);
        System.out.println("Strength: " + strength);
        System.out.println("Defence: " + defence);
        System.out.println("------------------------------------------------------------------------");
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


}
