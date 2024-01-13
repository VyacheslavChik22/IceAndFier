package persons;

import abstracts.WarriorOfMagic;
import interfaces.*;

//Монах
//Лечит, не перемещается, есть манна для лечения и колдовства.
//Колдует на противников вызывая у них страх, чем снижает их боевой дух.
public class Monastic extends WarriorOfMagic {


    public Monastic(String name, int x, int y) {
        super("Монах ", name, 100, 15, 50, 5, 50, x, y);
    }


    @Override
    public String toString() {
        return super.toString();
    }

}
