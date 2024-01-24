package persons;

public class Rangefinder {
    //Дальномер
    public int x, y;

    public Rangefinder(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float rangeToEnemy(Rangefinder positionEnemy) {
        return (float) Math.sqrt(Math.pow(positionEnemy.x - x, 2) + Math.pow(positionEnemy.y - y, 2));
    }


    public Rangefinder getDeltas(Rangefinder positionEnemy) {
        return new Rangefinder(x - positionEnemy.x, y - positionEnemy.y);
    }

    public boolean balance(Rangefinder positionEnemy) {
        return x == positionEnemy.getX() && y == positionEnemy.getY();
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " : " + y;
    }
}
