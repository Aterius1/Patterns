package Controllers;

import Characters.IEnemy;
import Characters.Player;

import java.util.Random;
import java.util.Scanner;

public class BattleController {
    Random rand = new Random();
    Scanner scn = new Scanner(System.in);
    PlayerController playerController = new PlayerController();

    public void initializeBattle(Player player, IEnemy enemy) {
        boolean end = false;
        System.out.println("You've encountered " + enemy.type() + "!");
        while(end == false) {
            System.out.println();
            System.out.println("Your turn:");
            System.out.println("Type 1 to attack");
            System.out.println("Type 2 to run");
            System.out.println("Type 3 to see your stats");
            System.out.println("Type 4 to see your enemy's stats");
            switch (scn.nextInt()) {
                case 1:
                    System.out.print("You deal ");
                    attack(player, enemy);
                    System.out.println(" damage to your enemy");
                    if(enemy.isDead()) {
                        player.setExperience(player.getExperience() + enemy.getMaxHealth());
                        if(player.getExperience() > 100) {
                            playerController.levelUp();
                        }
                        System.out.println("Enemy is dead");
                        end = true;
                    }
                    break;
                case 2:
                    end = true;
                    break;
                case 3:
                    player.printStats();
                    break;
                case 4:
                    enemy.printStats();
                    break;
            }
            System.out.println();
            System.out.println("Enemy's turn");
            System.out.print("Enemy deals ");
            attack(enemy, player);
            System.out.println(" damage");
            System.out.println();
        }
    }



    public void attack(Player attacker, IEnemy defender) {
        int val = attacker.getStrength() + (rand.nextInt(11) - 5) - defender.getDefence();
        System.out.print(val);
        defender.damage(val);
    }

    public void attack(IEnemy attacker, Player defender) {
        int val = attacker.getStrength() + (rand.nextInt(11) - 5) - defender.getDefence();
        System.out.print(val);
        defender.damage(val);
    }

}
