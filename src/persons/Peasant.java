package persons;

import interfaces.*;

import java.util.ArrayList;

//Крестьянин
//Подбрасывает стрелы снайперам и арбалетчикам
public class Peasant extends Hero {
    public Peasant(String name, int x, int y) {
        super("", "Холоп", name, 0, 10, x, y);
        this.amountArrows = (int) (2 + Math.random() * 8);
        initiative = 0;
    }

    public void giveAnArrow(ArrayList<Hero> mine) {
        if (getHealth() >= 0 && getAmountArrows() > 0) {
            for (Hero hero : mine) {
                if (hero.getShooting().equals("Стреляющий")) {
                    if (hero.getHealth() >= 0 && hero.getAmountArrows() == 0) { //если свой жив и без стрел
                        int suplly = (int) (1 + Math.random() * 4);
                        setAmountArrows(suplly);
                        hero.setAmountArrows(suplly);
                        break;
                    }
                }
            }
        }
        if (getHealth() >= 0 && getAmountArrows() == 0) {
            setAmountArrows((int) (4 + Math.random() * 1));
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

