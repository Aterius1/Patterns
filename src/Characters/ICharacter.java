package Characters;

public interface ICharacter {
     void damage(int val);

     void printStats();

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
}
