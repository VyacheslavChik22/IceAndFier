import persons.Arbalester;
import persons.Hero;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CreatingHeroes.generatingHeroesFireCommand(0, 1);
        CreatingHeroes.generatingHeroesIceCommand(3, 10);
        CreatingHeroes.generatAll();



        Scanner input = new Scanner(System.in);
        while (true) {
            View.view();
            input.nextLine();
            for (Hero hero : CreatingHeroes.commandHeroes) {
                if (CreatingHeroes.heroesFire.contains(hero)) {
                    hero.stepOfAction(CreatingHeroes.heroesIce,CreatingHeroes.heroesFire);
                } else {
                    hero.stepOfAction(CreatingHeroes.heroesFire,CreatingHeroes.heroesIce);
                }

            }

        }

    }
}
