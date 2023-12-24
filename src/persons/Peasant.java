package persons;

import interfaces.*;

//Крестьянин
//Подбрасывает стрелы снайперам и арбалетчикам
public class Peasant extends Hero implements AbleToTellTheName, AbleToScreamingBattleCry, AbleToGiveArrows {
    public Peasant(String name) {
        super("Крестьянин ", name, 10, 3, 3, 0);
    }

    @Override
    public void bringArrows() {

    }

    @Override
    public void SaysName() {
        System.out.println("Я есть " + name + " !!!");
    }

    @Override
    public void toScreamBattleCry() {
        System.out.println("Ховайся, колы бьють!");
    }

    @Override
    public String toString() {
        return status + " " + name
                + ", Здоровье: " + health + ", Защита: " + armor
                + ", Боевой дух: " + fightingSpirit + ", Опыт: " + experience;
    }


}
