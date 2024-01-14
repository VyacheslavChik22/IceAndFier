import persons.Arbalester;
import persons.Hero;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        CreatingHeroes.heroesFire = CreatingHeroes.generatingHeroesCommands(0, 0);
        CreatingHeroes.heroesIce = CreatingHeroes.generatingHeroesCommands(3, 9);


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


        for (Hero heroFire : CreatingHeroes.heroesFire) {
            if (heroFire.toString().split(" ")[0].equals("Арбалетчик")) {
                System.out.println("У арбалетчика " + ((Arbalester) heroFire).getName() + " ближайшая цель: ");
                heroFire.stepOfAction(CreatingHeroes.heroesIce);
            }
        }
    }
}
