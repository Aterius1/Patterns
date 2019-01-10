package Map;

import Characters.Player;

public class Minimap {

    private Map map;

    public Minimap(Map map) {
        this.map = map;
    }

    public void printMinimap() {
        for(int i = 0; i < map.getRooms().length; i++) {
            for(int j = 0; i < map.getRooms()[i].length; j++) {
                System.out.println("x");
            }
        }
    }

    public void printPlayerPosition(Player player) {
        for(int i = 0; i < map.getMapSize(); i++) {
            for(int j = 0; j < map.getMapSize(); j++) {
                if(map.getRooms()[i][j].isPlayerHere() == true) {
                    System.out.print("o");
                }
                else {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }

}
