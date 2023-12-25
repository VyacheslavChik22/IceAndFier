package persons;

import interfaces.*;

//Снайпер
//Не перемещается, наносит повреждения удаленным юнитам
//Стрелы заканчиваются(имеет определенный запас)
//Дополнительный параметр - скрытность
public class Sniper extends Hero implements AbleToTellTheName, AbleToScreamingBattleCry, AbleToAttack, AbleToWalk, AbleToHiding {
    int[] damage;      // Наносимый урон
    int secretiveness; // скрытность
    int amountArrows;  // количество стрел

    public Sniper(String name, int x, int y) {
        super("Снайпер ", name, 100, 15, 50, 0, x, y);
        this.secretiveness = 1;
        this.amountArrows = 10;
        this.damage = new int[]{-25, 15};
    }

    Rangefinder position;

    @Override
    public void toHide() {

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
        System.out.println("Я не промахнусь!!!");
    }

    @Override
    public String toString() {
        return status + " " + name
                + ", Здоровье: " + health + ", Броня: " + armor
                + ", Боевой дух: " + fightingSpirit + ", Опыт: " + experience
                + ", Скрытность: " + secretiveness + ", Количество стрел: " + amountArrows;
    }
}
