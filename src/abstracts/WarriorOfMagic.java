package abstracts;

import persons.Hero;

import java.util.ArrayList;

public class WarriorOfMagic extends Hero {
    private final int HELP = 10;

    public WarriorOfMagic(String shooting, String status, String name, int armor, int health, int x, int y) {
        super(shooting, status, name, armor, health, x, y);
        this.manna = 50;
        initiative = 1;
    }

    @Override
    public void stepOfAction(ArrayList<Hero> enemies, ArrayList<Hero> friends) {
        if (getHealth() > 0) {
            for (Hero friend : friends) {
                if (getManna() >= 10) {
                    if (friend.getHealth() <= 5) {
                        friend.setHealth(friend.getHealth() + HELP);
                        setManna(getManna() - HELP);
                    }
                }else{
                    setManna((int)(1+Math.random()*4));
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Манна: " + manna;
    }

}
