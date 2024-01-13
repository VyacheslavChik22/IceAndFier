package persons;

import interfaces.*;

import java.util.ArrayList;

//Крестьянин
//Подбрасывает стрелы снайперам и арбалетчикам
public class Peasant extends Hero {
    int amountArrows;   // количество стрел

    public Peasant(String name, int x, int y) {
        super("Крестьянин ", name, 10, 3, 3, 0, x, y);
        this.amountArrows = (int) (2 + Math.random() * 8);
        initiative = 0;
    }


    @Override
    public void stepOfAction(ArrayList<Hero> enemies) {
        System.out.print(" ");
    }

    @Override
    public String toString() {
        return status + " " + name
                + ", Здоровье: " + health + ", Защита: " + armor
                + ", Боевой дух: " + fightingSpirit + ", Опыт: " + experience
                + ", Количство стрел: " + amountArrows;
    }


}
