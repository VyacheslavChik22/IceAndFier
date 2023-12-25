package persons;

import interfaces.*;

//Колдун
//Лечит, не перемещается, манна не ограничена
//Колдует на противников вызывая у них страх
public class Wizard extends Hero implements AbleToTellTheName, AbleToScreamingBattleCry, AbleToHeal, AbleToCauseFear {
    int manna;

    public Wizard(String name, int x, int y) {
        super("Колдун ", name, 80, 5, 5, 0, x, y);
        this.manna = 1000;
    }

    Rangefinder position;

    @Override
    public String toString() {
        return status + " " + name
                + ", Здоровье: " + health + ", Защита: " + armor
                + ", Боевой дух: " + fightingSpirit + ", Опыт: " + experience;
    }

    @Override
    public void toCauseFear() {

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
        System.out.println("Ты не пройдешь!!!");
    }
}
