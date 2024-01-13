package persons;

import abstracts.RangedWarrior;
import interfaces.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Арбалетчик
//Не перемещается, наносит повреждения удаленным юнитам
//Стрелы заканчиваются(имеет определенный запас)
//Дополнительный параметр - скрытность
public class Arbalester extends RangedWarrior {
    public Arbalester(String name, int x, int y) {
        super("Арбалетчик", name, 100, 15, 50, 0, new int[]{5, 10},100, 10, x, y);

    }

    public String getName(){
        return name;
    }

    @Override
    public void stepOfAction(ArrayList<Hero> enemies) {
        super.stepOfAction(enemies);
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
