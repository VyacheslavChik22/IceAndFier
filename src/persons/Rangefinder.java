package persons;

public class Rangefinder {
    //Дальномер
    int x, y;

    public Rangefinder(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float rangeToEnemy(Rangefinder positionEnemy) {
        return (float) Math.sqrt(Math.pow(positionEnemy.x - x, 2) + Math.pow(positionEnemy.y - y, 2));
    }

    @Override
    public String toString() {
        return "Кординаты: " + x + " : " + y;

    }
}
