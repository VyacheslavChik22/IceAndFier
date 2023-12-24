package persons;

import interfaces.*;

//Монах
//Лечит, не перемещается, манна не ограничена
//Повышает боевой дух
public class Monastic extends Hero implements AbleToTellTheName, AbleToScreamingBattleCry, AbleToHeal {
    int manna;

    public Monastic(String name) {
        super("Монах ", name, 100, 2, 10, 0);
        this.manna = 1000;
    }

    @Override
    public void toHeal() {

    }

    @Override
    public void SaysName() {
        System.out.println("Я есть " + name + " !!!");

    }

    @Override
    public void toScreamBattleCry() {
        System.out.println("И тебя вылечат!!!");
    }


    @Override
    public String toString() {
        return status + " " + name
                + ", Здоровье: " + health + ", Защита: " + armor
                + ", Боевой дух: " + fightingSpirit + ", Опыт: " + experience;
    }

}
