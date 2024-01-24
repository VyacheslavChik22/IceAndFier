package abstracts;

import persons.Hero;
import persons.Rangefinder;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class MeleeWarrior extends Hero {
    public MeleeWarrior(String shooting, String status, String name, int armor, int health, int x, int y) {
        super(shooting, status, name, armor, health, x, y);
        this.damage = (int) (Math.random() * 2);
        initiative = 2;

    }

    @Override
    public void stepOfAction(ArrayList<Hero> enemy, ArrayList<Hero> friends) {
        if(this.gethealth() <= 0)return;
        Hero hero = this.findCloseWarrior(enemy);
        if (this.position.rangeToEnemy(hero.position) < 2) {
//ehjy
            return;
        }
        Rangefinder tmp = new Rangefinder(position.getX(), position.getY());

        Rangefinder delta = this.position.getDeltas(hero.position);
        if (Math.abs(delta.getX()) > Math.abs(delta.getY())) {
            if (delta.getX() > 0) {
                tmp.setX(position.getX() - 1);

            } else {
                tmp.setX(position.getX() + 1);
            }

        } else {
            if (delta.getY() > 0) {
                tmp.setY(position.getY() - 1);
            } else {
                tmp.setY(position.getY() + 1);
            }
        }
        for (Hero friend : friends) {
            if (friend.position.balance(tmp)) return;
        }
        position = tmp;
    }

    @Override
    public String toString() {
        return super.toString() + ", Урон: " + damage;
    }
}