package abstracts;

import persons.Hero;

import java.util.ArrayList;

public class WarriorOfMagic extends Hero {
    public WarriorOfMagic(String shooting, String status, String name, int armor, int health, int x, int y) {
        super(shooting, status, name, armor, health, x, y);
        this.manna = 30;
        initiative = 1;
    }

    @Override
    public String toString() {
        return super.toString() + ", Манна: " + manna;
    }

    @Override
    public void stepOfAction(ArrayList<Hero> enemies, ArrayList<Hero> friends) {

    }
}
