package abstracts;

import persons.Hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//дальний бой
public abstract class RangedWarrior extends Hero {
    public RangedWarrior(String shooting, String status, String name, int armor, int health, int x, int y) {
        super(shooting, status, name, armor, health, x, y);
        this.damage = (int) (1 + Math.random() * 5);
        this.amountArrows = 10;
        initiative = 3;
    }

    public void assault(ArrayList<Hero> enemies) {
        Hero myEnemy = findCloseWarrior(enemies);
        if (myEnemy.getArmor() > 0) {
            myEnemy.setArmor(getArmor() - damage);
        } else {
            myEnemy.setArmor(0);
            if (myEnemy.getHealth() > 0) {
                myEnemy.setHealth(myEnemy.getHealth() - damage);
            }else {
                myEnemy.setHealth(0);
            }
        }
    }

    @Override
    public void stepOfAction(ArrayList<Hero> enemies, ArrayList<Hero> friends) {
        if (getHealth() >= 0) {
            if (getAmountArrows() > 0) {
                assault(enemies);
                setAmountArrows(getAmountArrows() - 1);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Урон: " + damage + ", Количество стрел: " + amountArrows;
    }
}
