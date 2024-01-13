package persons;

import abstracts.RangedWarrior;
import interfaces.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Снайпер
//Не перемещается, наносит повреждения удаленным юнитам
//Стрелы заканчиваются(имеет определенный запас)
//Дополнительный параметр - скрытность
public class Archer extends RangedWarrior {

    public Archer(String name, int x, int y) {
        super("Лучник", name, 100, 15, 50, 0, new int[]{5, 10},100, 10, x, y);

    }


    @Override
    public String toString(){
        return super.toString();
    }


}
