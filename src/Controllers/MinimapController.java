//package Controllers;
//
//import Characters.Player;
//import Map.Map;
//import Map.Minimap;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MinimapController {
//
//    public Minimap generateMinimap(Map map) {
//        Minimap minimap = new Minimap();
//        StringBuilder row = new StringBuilder();
//        List<String> rows = new ArrayList<>();
//        int size = map.getRooms().length;
//        for(int i = 0; i < size; i++) {
//            row.append("x");
//        }
//        for(int i = 0; i < size; i++) {
//            rows.add(row.toString());
//        }
//        minimap.setMinimap(rows);
//        return minimap;
//    }
//
//    public void printPlayerPosition(Minimap minimap, Player player) {
//        for(int i = 0; i < minimap.getMinimap().size(); i++) {
//            for(int j = 0; j < minimap.getMinimap().size(); j++) {
//                if(i == player.getPositionY() && j == player.getPositionX()) {
//                    System.out.print("o");
//                }
//                else {
//                    System.out.print("x");
//                }
//            }
//            System.out.println();
//        }
//    }
//
//}
