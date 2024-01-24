package persons;

import abstracts.WarriorOfMagic;
import interfaces.*;

//Монах
//Лечит, не перемещается, есть манна для лечения и колдовства.
//Колдует на противников вызывая у них страх, чем снижает их боевой дух.
public class Monastic extends WarriorOfMagic {
    public Monastic(String name, int x, int y) {
        super("Маг","Монах ", name, 15, 100, x, y);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
