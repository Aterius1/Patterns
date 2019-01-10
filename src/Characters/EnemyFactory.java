package Characters;

public class EnemyFactory { //factory
    public IEnemy getEnemy(int enemyType) {
        if(enemyType == 1) {
            return new Elf(30, 30, 10, 3, false, false);
        }
        else if(enemyType == 2) {
            return new Orc(40, 40, 3, 7, false, false);
        }
        else if(enemyType == 3) {
            return new Dwarf(50, 50, 1, 5, false, false);
        }
        else if(enemyType == 4) {
            return new Boss(100, 100, 20, 20, false, false);
        }
        return null;
    }
}
