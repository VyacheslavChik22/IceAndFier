package persons;

import abstracts.WarriorOfMagic;
import interfaces.*;

import java.util.ArrayList;

//Колдун
//Лечит, не перемещается, есть манна для лечения и колдовства.
//Колдует на противников вызывая у них страх, чем снижает их боевой дух.
public class Wizard extends WarriorOfMagic {


    public Wizard(String name, int x, int y) {
        super("Маг", "Колдун", name, 10, 10, x, y);
    }

}
