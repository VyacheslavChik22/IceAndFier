package persons;

import abstracts.RangedWarrior;
import interfaces.*;

import java.util.ArrayList;



//Арбалетчик
//Не перемещается, наносит повреждения удаленным юнитам
//Стрелы заканчиваются(имеет определенный запас)
public class Arbalester extends RangedWarrior {

    public Arbalester(String name, int x, int y) {
        super("Стреляющий","Арбалетчик", name, 10, 10, x, y);
    }

}
