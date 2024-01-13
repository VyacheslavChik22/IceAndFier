package abstracts;

import persons.Hero;
import java.util.Arrays;

public abstract class MeleeWarrior extends Hero {
    int force;
    int[] damage;
    public MeleeWarrior(String status, String name, int health, int armor, int fightingSpirit, int experience,int force,int[] damage, int x, int y) {
        super(status, name, health, armor, fightingSpirit, experience, x, y);
        this.force = force;
        this.damage = damage;
        initiative = 2;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Урон: " + Arrays.toString(damage) + " " + ", Сила: " + force;
    }
}
