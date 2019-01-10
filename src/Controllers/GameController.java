package Controllers;

import Characters.IEnemy;
import Characters.Player;
import Map.Map;
import Map.Minimap;

public class GameController {
    private MapController mapController = new MapController();
    private PlayerController playerController = new PlayerController();
    private BattleController battleController = new BattleController();
    private Map map = Map.getInstance();
    private Minimap minimap;
    private Player player;

    public boolean endGameLose = false;
    public boolean endGameWin = false;


    public void newGame() {
        mapController.generateMap();
        map.getRooms()[0][0].setPlayerHere(true);
        minimap = new Minimap(map);
        player = Player.getInstance();
    }

    public void printMinimap() {
        minimap.printPlayerPosition(player);
    }

    public void movePlayer(String direction) {
        map.getRooms()[player.getPositionY()][player.getPositionX()].setPlayerHere(false);
        playerController.move(direction, map.getMapSize());
        map.getRooms()[player.getPositionY()][player.getPositionX()].setPlayerHere(true);
        IEnemy enemy = map.getRooms()[player.getPositionY()][player.getPositionX()].getEnemy();
        if(!(enemy.isDead())) {
            battleController.initializeBattle(player, enemy);
            if(player.isDead()) {
                endGameLose();
            }
            if(map.getRooms()[map.getMapSize() - 1][map.getMapSize() - 1].getEnemy().isDead()) {
                endGameWin();
            }
        }
        else {
            System.out.println("Room is empty");
        }
        printMinimap();
    }

    public void endGameLose() {
        System.out.println("You lost! Try again.");
        endGameLose = true;
    }

    public void endGameWin() {
        System.out.println("Congratulations! You've won!");
        endGameWin = true;
    }

    public Player getPlayer() {
        return player;
    }
}
