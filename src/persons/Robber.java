package persons;

import interfaces.*;

// Разбойник
//Перемещается на 1 клетку за 1 ход(только вперед, назад, влево, вправо)
//бьёт оружием ближнего боя, оружие неограниченно, ход не ограничен
public class Robber extends Hero implements AbleToTellTheName, AbleToScreamingBattleCry, AbleToAttack, AbleToWalk {
    int stepFront;
    int stepBack;
    int stepLeft;
    int stepRight;
    int force;         //сила
    int[] damage;        // Наносимый урон

    public Robber(String name, int x, int y) {
        super("Разбойник ", name, 100, 15, 50, 0, x, y);
        this.force = 10;
        this.stepFront = 1;
        this.stepBack = 1;
        this.stepLeft = 1;
        this.stepRight = 1;
        this.damage = new int[]{-20, -5};
    }

    Rangefinder position;

    @Override
    public void toGo() {

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
        System.out.println("Ну вы достали!!!");
    }

    public String toString() {
        return status + " " + name
                + ", Здоровье: " + health + ", Броня: " + armor
                + ", Боевой дух: " + fightingSpirit + ", Опыт: " + experience
                + ", Сила: " + force;
    }

}
