package persons;

import abstracts.WarriorOfMagic;
import interfaces.*;

//Колдун
//Лечит, не перемещается, есть манна для лечения и колдовства.
//Колдует на противников вызывая у них страх, чем снижает их боевой дух.
public class Wizard extends WarriorOfMagic {

    public Wizard(String name, int x, int y) {
        super("Колдун ", name, 100,15, 50, 5, 50, x, y);

    }
    @Override
    public String toString() {
        return super.toString();
    }
}
