package persons;

import interfaces.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Арбалетчик
//Умеет стрелять, стрелы ограничены, не перемещается.
public class Arbalester extends Hero implements AbleToTellTheName, AbleToScreamingBattleCry, AbleToAttack {

    int[] damage;       // Наносимый урон
    int amountArrows;   // количество стрел


    public Arbalester(String name, int x, int y) {
        super("Арбалетчик", name, 100, 15, 50, 0, x, y);
        this.amountArrows = 10;
        this.damage = new int[]{-20, -15};
    }

    public void showDistanceToEnemies(List<Hero> enemies) {
        ArrayList<Float> listPositions = new ArrayList<>();
        enemies.forEach(n -> listPositions.add(position.rangeToEnemy(n.position)));
        float closeEnemy = Collections.min(listPositions);
        System.out.println(closeEnemy);
    }

    public String getName() {
        return name;
    }

    @Override
    public void toAttack() {

    }

    @Override
    public void SaysName() {
        System.out.println("Я есть " + name + " !!!");
    }

    @Override
    public void toScreamBattleCry() {
        System.out.println("Вот ты и попался!!!");
    }

    @Override
    public String toString() {
        return status;
    }

//    @Override
//    public String toString() {
//        return status + " " + name
//                + ", Здоровье: " + health + ", Броня: " + armor
//                + ", Боевой дух: " + fightingSpirit + ", Опыт: " + experience
//                + ", Количество стрел: " + amountArrows;
//    }

}
