package Characters;

public interface IEnemy {
     String type();

     void setPositionX(int positionX);

     void setPositionY(int positionY);

     int getHealth();

     int getMaxHealth();

     int getStrength();

     int getDefence();

     boolean isDead();

     boolean isPlayer();

     int getPositionX();

     int getPositionY();

     void printStats();

     void damage(int val);
}
