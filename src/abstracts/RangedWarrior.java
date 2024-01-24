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
        this.amountArrows = 50;
        initiative = 3;
    }


    public void assault(ArrayList<Hero> enemies) {
        Hero myEnemy = findCloseWarrior(enemies);
        if (myEnemy.getArmor() > 0) {
            myEnemy.setArmor(getArmor() - damage);
        } else {
            myEnemy.setHealth(myEnemy.getHealth() - (damage + (int) (1 + Math.random() * 10)));
        }
        System.out.println(myEnemy.getStatus() + " " + myEnemy.getName() + ": Брони осталось: " + myEnemy.getArmor() + ", Здоровья осталось: " + myEnemy.getHealth());
    }

   @Override
   public void stepOfAction(ArrayList<Hero> enemies,ArrayList<Hero> friends) {
        System.out.println(findCloseWarrior(enemies)); // ближайший противник найден!
        if (getHealth() >= 0) {                         // если жив
            if (getAmountArrows() > 0) {
                System.out.println("Противник атакован!");// если есть стрелы
                assault(enemies);
                setAmountArrows(getAmountArrows()-1);
            } else {
                System.out.println("Стрелы, стрелы давай!");
            }
        } else {
            setHealth(0);
            System.out.println("Я убит, играйте без меня");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Урон: " + damage + ", Количество стрел: " + amountArrows;
    }
}
