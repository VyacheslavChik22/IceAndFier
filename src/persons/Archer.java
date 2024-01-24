package persons;

import abstracts.RangedWarrior;
import interfaces.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Снайпер
//Не перемещается, наносит повреждения удаленным юнитам
//Стрелы заканчиваются(имеет определенный запас)
public class Archer extends RangedWarrior {
    public Archer(String name, int x, int y) {
        super("Стрелок","Лучник", name, 15, 100, x, y);
    }

//    public Archer(String name, int x, int y) {
//        super(, name, 100, 15, 50, 0, 100, x, y);
//
//    }

    public String getName(){
        return name;
    }

}
 ход пехоты