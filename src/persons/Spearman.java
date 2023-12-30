package persons;

import interfaces.*;

// Копейщик
//Перемещается на 1 клетку за 1 ход(только вперед, назад, влево, вправо)
//бьёт оружием ближнего боя, оружие неограниченно
//Дополнительный параметр - сила(убывает)
public class Spearman extends Hero implements AbleToTellTheName, AbleToScreamingBattleCry, AbleToAttack, AbleToWalk {
    int stepFront;
    int stepBack;
    int stepLeft;
    int stepRight;
    int force;         //сила
    int[] damage;       // Наносимый урон

    public Spearman(String name, int x, int y) {
        super("Копейщик ", name, 100, 15, 50, 0, x, y);
        this.force = 10;
        this.stepFront = 1;
        this.stepBack = 1;
        this.stepLeft = 1;
        this.stepRight = 1;
        this.damage = new int[]{-20, -5};
    }


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
        System.out.println("Вот я тебе!!!");
    }

    public String toString() {
        return status + " " + name
                + ", Здоровье: " + health + ", Броня: " + armor
                + ", Боевой дух: " + fightingSpirit + ", Опыт: " + experience
                + ", Сила: " + force;
    }


}
