package persons;

import interfaces.Interaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Hero implements Interaction {
    protected String status;
    protected String name;
    protected int manna;
    protected int damage;
    protected int health;          // Здоровье
    protected int armor;           // Броня
    protected int amountArrows;    // количество стрел
    protected int initiative;
    protected String shooting;
    public Rangefinder position;


    public Hero(String shooting, String status, String name, int armor, int health, int x, int y) {
        this.shooting = shooting;
        this.status = status;
        this.name = name;
        this.armor = armor;
        this.health = health;
        this.position = new Rangefinder(x, y);

    }

    public Hero findCloseWarrior(ArrayList<Hero> enemies) {
        Hero isEnemy = null;
        ArrayList<Float> listPositions = new ArrayList<>();
        enemies.forEach(n -> listPositions.add(position.rangeToEnemy(n.position)));
        float closeEnemies = Collections.min(listPositions);
        for (int i = 0; i < enemies.size(); i++) {
            if (closeEnemies == position.rangeToEnemy(enemies.get(i).position)) {
                isEnemy = enemies.get(i);
            }
        }
        return isEnemy;
    }

    public int[] getCoords() {
        return new int[]{position.x, position.y};
    }

    public String getShooting() {
        return shooting;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
            this.armor = armor;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getAmountArrows() {
        return amountArrows;
    }

    public void setAmountArrows(int amountArrows) {
        this.amountArrows = amountArrows;
    }

    public int getManna() {
        return manna;
    }

    public void setManna(int manna) {
        this.manna = manna;
    }

    @Override
    public String toString() {
        return status + " " + name
                + ", Броня: " + armor + ", Здоровье: " + health
                + ", Позиция: " + position;
    }

}
