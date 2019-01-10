package Controllers;

import Characters.EnemyFactory;
import Characters.IEnemy;
import Map.Map;
import Map.Room;

import java.util.Random;
import java.util.Scanner;

public class MapController {

    public void generateMap() {
        Random rand = new Random();
        EnemyFactory enemyFactory = new EnemyFactory();
        Scanner scn = new Scanner(System.in);
        Map map = Map.getInstance();
        System.out.println("Choose map size");
        int size = scn.nextInt();
        Room[][] rooms = new Room[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                int enemyType = rand.nextInt(3) + 1;
                IEnemy enemy = enemyFactory.getEnemy(enemyType);
                rooms[i][j] = new Room(enemy);
            }
        }
        IEnemy boss = enemyFactory.getEnemy(4);
        rooms[size - 1][size - 1] = new Room(boss);
        map.setRooms(rooms);
        map.setMapSize(size);
    }

}
