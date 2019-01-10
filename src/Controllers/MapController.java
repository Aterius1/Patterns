package Controllers;

import Characters.EnemyFactory;
import Characters.IEnemy;
import Map.Map;
import Map.Room;

import java.util.Random;
import java.util.Scanner;

public class MapController {

    public Map generateMap() {
        Random rand = new Random();
        EnemyFactory enemyFactory = new EnemyFactory();
        Map map = new Map();
        Scanner scn = new Scanner(System.in);
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
        map.setRooms(rooms);
        map.setMapSize(size);
        return map;
    }

}
