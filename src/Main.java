
public class Main {
    public static void main(String[] args) {

        CreatingHeroes.heroesFire = CreatingHeroes.generatingHeroesCommands(0, 0);
        CreatingHeroes.heroesIce = CreatingHeroes.generatingHeroesCommands(3, 9);
        System.out.println("\tВоины огня:");
        CreatingHeroes.heroesFire.forEach(n -> System.out.println(n.toString()));
        System.out.println("\tВоины льда:");
        CreatingHeroes.heroesIce.forEach(n -> System.out.println(n.toString()));
        System.out.println();
       // CreatingHeroes.heroesIce.forEach(n -> n.showDistanceToEnemies(CreatingHeroes.heroesFire));


    }
}
