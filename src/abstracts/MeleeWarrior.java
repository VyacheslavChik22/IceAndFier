package abstracts;

import persons.Hero;
import persons.Rangefinder;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class MeleeWarrior extends Hero {
    public MeleeWarrior(String shooting, String status, String name, int armor, int health, int x, int y) {
        super(shooting, status, name, armor, health, x, y);
        this.damage = (int) (1 +Math.random() * 5);
        initiative = 2;

    }

    @Override
    public void stepOfAction(ArrayList<Hero> enemy, ArrayList<Hero> friends) {
        if (this.getHealth() <= 0) return;
        Hero myEnemy = this.findCloseWarrior(enemy);
        if (this.position.rangeToEnemy(myEnemy.position) < 2) {
            if (myEnemy.getArmor() > 0) {
                myEnemy.setArmor(getArmor() - damage);
            } else {
                myEnemy.setArmor(0);
                if(myEnemy.getHealth()>0){
                myEnemy.setHealth(myEnemy.getHealth() - damage );
                }else{
                    myEnemy.setHealth(0);
                }
            }
        }
        Rangefinder tmp = new Rangefinder(position.getX(), position.getY());

        Rangefinder delta = this.position.getDeltas(myEnemy.position);
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