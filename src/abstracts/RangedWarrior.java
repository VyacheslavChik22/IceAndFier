package abstracts;

import persons.Hero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//дальний бой
public abstract class RangedWarrior extends Hero {
    protected int[] damage;       // Наносимый урон
    protected int amountArrows;   // количество стрел
    protected int secretiveness; // скрытность

    public RangedWarrior(String status, String name, int health, int armor, int fightingSpirit, int experience, int[]
            damage, int amountArrows, int secretiveness, int x, int y) {
        super(status, name, health, armor, fightingSpirit, experience, x, y);
        this.damage = damage;
        this.amountArrows = amountArrows;
        this.secretiveness = secretiveness;
        initiative = 3;
    }


    public Hero findCloseEnemies(ArrayList<Hero> enemies) {
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

    public int getAmountArrows() {
        return amountArrows;
    }

    public void assault(ArrayList<Hero> enemies) {
        Hero myEnemy = findCloseEnemies(enemies);
        if (myEnemy.getArmor() > 0) {
            myEnemy.setArmor(getArmor() - 1);
        } else {
            myEnemy.setHealth(myEnemy.getHealth() - 1);
        }
        System.out.println(myEnemy.getStatus() + " " + myEnemy.getName() + ": Брони осталось: " + myEnemy.getArmor()+ ", Здоровья осталось: " + myEnemy.getHealth() );
    }
    public void stepOfAction(ArrayList<Hero>enemies) {
        System.out.println(findCloseEnemies(enemies)); // ближайший противник найден!
        if (getHealth() >= 0) {                         // если жив
            if (getAmountArrows() > 0) {
                System.out.println("Противник атакован!");// если есть стрелы
                assault(enemies);
            }
        } else {
            System.out.println("Я убит, играйте без меня");
        }
    }


    @Override
    public String toString () {
        return super.toString() + ", Урон: " + Arrays.toString(damage) + " " + ", Скрытность: " + secretiveness + ", Количество стрел: " + amountArrows;
    }

}
