package persons;

import abstracts.MeleeWarrior;

import java.util.ArrayList;

// Копейщик
//Перемещается на 1 клетку за 1 ход(только вперед, назад, влево, вправо)
//бьёт оружием ближнего боя, оружие неограниченно, ход не ограничен
public class Spearman extends MeleeWarrior {
    public Spearman(String name,  int x, int y) {
        super("Пехота","Гном", name, 10, 10, x, y);
    }
}
