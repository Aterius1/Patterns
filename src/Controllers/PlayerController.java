package Controllers;

import Characters.Player;

public class PlayerController {
    Player player = Player.getInstance();

    public void initializePlayer() {

    }

    public void move(String direction, int mapSize) {
        switch (direction) {
            case "up":
                if(player.getPositionY() > 0)
                    player.setPositionY(player.getPositionY() - 1);
                break;
            case "down":
                if(player.getPositionY() < mapSize - 1)
                    player.setPositionY(player.getPositionY() + 1);
                break;
            case "left":
                if(player.getPositionX() > 0)
                    player.setPositionX(player.getPositionX() - 1);
                break;
            case "right":
                if(player.getPositionX() < mapSize - 1)
                    player.setPositionX(player.getPositionX() + 1);
                break;
        }
    }


    public void levelUp() {
        System.out.println("Level up!");
        player.setMaxHealth(player.getMaxHealth() + 10);
        player.setHealth(player.getMaxHealth());
        player.setStrength(player.getStrength() + 1);
        player.setDefence(player.getDefence() + 1);
        player.setExperience(player.getExperience() - 100);
        player.setLevel(player.getLevel() + 1);
    }
}
