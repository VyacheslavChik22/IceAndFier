package abstracts;

import persons.Hero;
public class WarriorOfMagic extends Hero {
    int manna;

    public WarriorOfMagic(String status, String name, int health, int armor, int fightingSpirit, int experience, int manna, int x, int y) {
        super(status, name, health, armor, fightingSpirit, experience, x, y);
        this.manna = manna;
        initiative = 1;
    }
}
