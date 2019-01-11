package Controllers;

import Characters.IEnemy;
import Characters.Player;
import Map.Map;
import Map.Minimap;
import Memento.Caretaker;
import Memento.Originator;
import Memento.PlayerState;

public class GameController {
    private MapController mapController = new MapController();
    private PlayerController playerController = new PlayerController();
    private BattleController battleController = new BattleController();
    private Map map = Map.getInstance();
    private Minimap minimap;
    private Player player = Player.getInstance();
    private PlayerState playerState;

    private Originator originator = new Originator();
    private Caretaker caretaker = new Caretaker();

    public boolean endGameLose = false;
    public boolean endGameWin = false;

    public void saveGame() {
        playerState = new PlayerState(player.getHealth(), player.getMaxHealth(), player.getStrength(),
                player.getDefence(), player.isDead(), player.isPlayer(), player.getPositionX(), player.getPositionY(), player.getLevel(), player.getExperience());
        originator.setState(playerState);
        caretaker.add(originator.saveStateToMemento());
    }

    public void loadGame() {
        originator.getStateFromMemento(caretaker.get(0));
        PlayerState state = originator.getState();
        playerController.initializePlayer(state);
    }

    public void newGame() {
        mapController.generateMap();
        map.getRooms()[0][0].setPlayerHere(true);
        minimap = new Minimap(map);
        PlayerState state = new PlayerState(50, 50, 20, 10, false, true, 0, 0, 1, 0);
        playerController.initializePlayer(state);
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
