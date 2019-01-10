package Map;

public class Map { // Singleton

    private static Map map = new Map();

    public static Map getInstance() {
        return map;
    }

    private Map() {

    }

    private Room[][] rooms;
    private int mapSize;

    public int getMapSize() {
        return mapSize;
    }

    public void setMapSize(int mapSize) {
        this.mapSize = mapSize;
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }


}
