package persons;

import abstracts.WarriorOfMagic;
import interfaces.*;

//Монах
//Лечит, не перемещается, есть манна для лечения и колдовства.
//Колдует на противников вызывая у них страх, чем снижает их боевой дух.
public class Monastic extends WarriorOfMagic {
    public Monastic(String name, int x, int y) {
        super("Маг", "Монах ", name, 10, 10, x, y);
    }
}
