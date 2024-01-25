package persons;

import interfaces.*;

import java.util.ArrayList;

//Крестьянин
//Подбрасывает стрелы снайперам и арбалетчикам
public class Peasant extends Hero {
    public Peasant(String name, int x, int y) {
        super("", "Крестьянин", name, 0, 10, x, y);
        this.amountArrows = (int) (2 + Math.random() * 8);
        initiative = 0;
    }

    public void giveAnArrow(ArrayList<Hero> mine) {
        for (int i = 0; i < mine.size(); i++) {
            if (mine.get(i).getShooting().equals("Стреляющий")) {
                if (mine.get(i).getHealth() >= 0 && mine.get(i).getAmountArrows() == 0) { //если свой жив и без стрел
                    setAmountArrows(getAmountArrows() - 1);
                    mine.get(i).setAmountArrows(mine.get(i).getAmountArrows() + 1);
                    break;
                }
            }
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", Количество стрел: " + amountArrows;
    }

    @Override
    public void stepOfAction(ArrayList<Hero> enemies, ArrayList<Hero> friends) {
        if (getHealth() > 0) {                       // если я жив
            if (getAmountArrows() > 0) {              // если есть стрелы
                giveAnArrow(friends);

            }
        }
    }
}

