import Controllers.GameController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        GameController game = new GameController();
        game.newGame();
        game.printMinimap();
        while(true) {
            String command = scn.nextLine();

            if(command.equals("w")) {
                game.movePlayer("up");
            }
            else if(command.equals("s")) {
                game.movePlayer("down");
            }
            else if(command.equals("a")) {
                game.movePlayer("left");
            }
            else if(command.equals(("d"))) {
                game.movePlayer("right");
            }

            else if(command.equals("minimap")) {
                game.printMinimap();
            }



            else if(command.equals("exit")) {
                break;
            }
        }
    }
}
