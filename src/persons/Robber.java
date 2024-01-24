package persons;

import abstracts.MeleeWarrior;

import java.util.ArrayList;

// Разбойник
//Перемещается на 1 клетку за 1 ход(только вперед, назад, влево, вправо)
//бьёт оружием ближнего боя, оружие неограниченно, ход не ограничен
//доп.параметр сила (возможен критический удар)
public class Robber extends MeleeWarrior {

    public Robber(String name, int x, int y) {
        super("Пехота","Разбойник", name, 15, 100, x, y);
    }

}
