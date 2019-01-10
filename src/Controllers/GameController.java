package Controllers;

import Characters.EnemyFactory;
import Characters.IEnemy;
import Characters.Player;
import Map.Map;
import Map.Minimap;

public class GameController {
    private MapController mapController = new MapController();
    private PlayerController playerController = new PlayerController();
    private BattleController battleController = new BattleController();
    private EnemyFactory enemyFactory = new EnemyFactory();
    private Map map;
    private Minimap minimap;
    private Player player;


    public void newGame() {
        map = mapController.generateMap();
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
        }
        printMinimap();
    }

    public Player getPlayer() {
        return player;
    }
}
