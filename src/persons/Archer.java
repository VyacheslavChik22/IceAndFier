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
        super("Стреляющий","Лучник", name, 10, 10, x, y);
    }

}
