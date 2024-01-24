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


//        System.out.println("\tВоины огня:");
//        CreatingHeroes.heroesFire.forEach(n -> System.out.println(n.toString()));
//        System.out.println("\tВоины льда:");
//        CreatingHeroes.heroesIce.forEach(n -> System.out.println(n.toString()));

//        ArrayList<Hero> heroesList = new ArrayList<>();
//        heroesList.addAll(CreatingHeroes.heroesFire);
//        heroesList.addAll(CreatingHeroes.heroesIce);
//        heroesList.sort(new Comparator<Hero>() {
//            @Override
//            public int compare(Hero o1, Hero o2) {
//                return o2.getInitiative() - o1.getInitiative();
//            }
//        });
//        heroesList.forEach(n -> System.out.println(n.getInitiative()));


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


//        for (Hero heroFire : CreatingHeroes.heroesFire) {
//            if (heroFire.toString().split(" ")[0].equals("Арбалетчик")) {
//                System.out.println("У арбалетчика " + ((Arbalester) heroFire).getName() + " Стрел: " + ((Arbalester) heroFire).getAmountArrows() + ", ближайшая цель: ");
//                heroFire.stepOfAction(CreatingHeroes.heroesIce);
//                System.out.println("У арбалетчика " + ((Arbalester) heroFire).getName() + " осталось стрел: " + ((Arbalester) heroFire).getAmountArrows());
//                System.out.println();
//            }
//        }
    }
}
