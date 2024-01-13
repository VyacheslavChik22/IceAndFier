package persons;

import abstracts.MeleeWarrior;

import java.util.ArrayList;

// Разбойник
//Перемещается на 1 клетку за 1 ход(только вперед, назад, влево, вправо)
//бьёт оружием ближнего боя, оружие неограниченно, ход не ограничен
//доп.параметр сила (возможен критический удар)
public class Robber extends MeleeWarrior {

    public Robber(String name, int x, int y) {
        super("Разбойник", name, 100, 15, 50, 0, 10, new int[]{-20, -5}, x, y);
    }
    @Override
    public void stepOfAction(ArrayList<Hero> enemies) {
        System.out.println(" ");
    }
    public String toString() {
        return super.toString();
    }
}
