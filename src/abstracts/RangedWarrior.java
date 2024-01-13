package abstracts;

import persons.Hero;
import java.util.ArrayList;
import java.util.Collections;

public abstract class RangedWarrior extends Hero {
    protected int[] damage;
    protected int amountArrows;
    protected int secretiveness;

    public RangedWarrior(String status, String name, int health, int armor, int fightingSpirit, int experience, int[] damage,
                         int amountArrows, int secretiveness, int x, int y) {
        super(status, name, health, armor, fightingSpirit, experience, x, y);
        this.damage = damage;
        this.amountArrows = amountArrows;
        this.secretiveness = secretiveness;
        initiative = 3;
    }
    public void showDistanceToEnemies(ArrayList<Hero> enemies) {
        ArrayList<Float> listPositions = new ArrayList<>();
        enemies.forEach(n -> listPositions.add(position.rangeToEnemy(n.position)));
        float closeEnemy = Collections.min(listPositions);
        System.out.println(closeEnemy);
    }

    @Override
    public void stepOfAction(ArrayList<Hero> enemies) {
        showDistanceToEnemies(enemies);
    }
}
