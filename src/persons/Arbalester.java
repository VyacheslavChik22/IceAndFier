package persons;

import abstracts.RangedWarrior;
import interfaces.*;

import java.util.ArrayList;



//Арбалетчик
//Не перемещается, наносит повреждения удаленным юнитам
//Стрелы заканчиваются(имеет определенный запас)
public class Arbalester extends RangedWarrior {

    public Arbalester(String name, int x, int y) {
        super("Стреляющий","Арбалетчик", name, 15, 100, x, y);
    }

    public String getName(){
        return name;
    }

}
