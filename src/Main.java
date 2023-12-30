import persons.Arbalester;
import persons.Archer;
import persons.Hero;

public class Main {
    public static void main(String[] args) {

        CreatingHeroes.heroesFire = CreatingHeroes.generatingHeroesCommands(0, 0);
        CreatingHeroes.heroesIce = CreatingHeroes.generatingHeroesCommands(3, 9);

//        System.out.println("\tВоины огня:");
//        CreatingHeroes.heroesFire.forEach(n -> System.out.println(n.toString()));
//        System.out.println("\tВоины льда:");
//        CreatingHeroes.heroesIce.forEach(n -> System.out.println(n.toString()));

        System.out.println();
        for (Hero heroFire : CreatingHeroes.heroesFire) {
            if (heroFire.toString().equals("Арбалетчик")) {
                System.out.print("У арбалетчика " + ((Arbalester) heroFire).getName() + " ближайшая цель: ");
                ((Arbalester) heroFire).showDistanceToEnemies(CreatingHeroes.heroesIce);
            }
        }
        for (Hero heroIce : CreatingHeroes.heroesIce) {
            if (heroIce.toString().equals("Лучник")) {
                System.out.print("У лучника " + ((Archer) heroIce).getName() + " ближайшая цель: ");
                ((Archer) heroIce).showDistanceToEnemies(CreatingHeroes.heroesFire);
            }
        }

    }
}
