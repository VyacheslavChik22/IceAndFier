package abstracts;

import persons.Hero;

import java.util.ArrayList;

public class WarriorOfMagic extends Hero {
    private final int HELP = 5;

    public WarriorOfMagic(String shooting, String status, String name, int armor, int health, int x, int y) {
        super(shooting, status, name, armor, health, x, y);
        this.manna = 30;
        initiative = 1;
    }

    @Override
    public void stepOfAction(ArrayList<Hero> enemies, ArrayList<Hero> friends) {
        for (Hero friend : friends) {
            if (manna > 0) {
                if (friend.getHealth() < 5) {
                    friend.setHealth(friend.getHealth() + HELP);
                }
                return;
            }
        }

    }

    @Override
    public String toString() {
        return super.toString() + ", Манна: " + manna;
    }

}
