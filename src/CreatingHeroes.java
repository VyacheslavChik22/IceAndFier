import persons.Hero;
import enums.Names;
import persons.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreatingHeroes {
    public static ArrayList<Hero> heroesIce = new ArrayList<>();
    public static ArrayList<Hero> heroesFire = new ArrayList<>();
    public static ArrayList<Hero> commandHeroes = new ArrayList<>();

    static String getRandomName() {
        return Names.values()[new Random().nextInt(Names.values().length - 1)].name();
    }


    static void generatingHeroesFireCommand(int n, int y) {

        int rand;
        for (int i = 1; i < 11; i++) {
            rand = (int) (1 + Math.random() * 4) + n;
            switch (rand) {
                case 1:
                    heroesFire.add(new Arbalester(getRandomName(), i, y));
                    break;
                case 2:
                    heroesFire.add(new Monastic(getRandomName(), i, y));
                    break;
                case 3:
                    heroesFire.add(new Robber(getRandomName(), i, y));
                    break;
                case 4:
                    heroesFire.add(new Peasant(getRandomName(), i, y));
                    break;
                case 5:
                    heroesFire.add(new Archer(getRandomName(), i, y));
                    break;
                case 6:
                    heroesFire.add(new Spearman(getRandomName(), i, y));
                    break;
                case 7:
                    heroesFire.add(new Wizard(getRandomName(), i, y));
                    break;
            }
        }
    }

    static void generatingHeroesIceCommand(int n, int y) {

        int rand;
        for (int i = 1; i < 11; i++) {
            rand = (int) (1 + Math.random() * 4) + n;
            switch (rand) {
                case 1:
                    heroesIce.add(new Arbalester(getRandomName(), i, y));
                    break;
                case 2:
                    heroesIce.add(new Monastic(getRandomName(), i, y));
                    break;
                case 3:
                    heroesIce.add(new Robber(getRandomName(), i, y));
                    break;
                case 4:
                    heroesIce.add(new Peasant(getRandomName(), i, y));
                    break;
                case 5:
                    heroesIce.add(new Archer(getRandomName(), i, y));
                    break;
                case 6:
                    heroesIce.add(new Spearman(getRandomName(), i, y));
                    break;
                case 7:
                    heroesIce.add(new Wizard(getRandomName(), i, y));
                    break;
            }
        }
    }

    static void generatAll(){
        commandHeroes.addAll(heroesIce);
        commandHeroes.addAll(heroesFire);
        commandHeroes.sort((i1,i2)-> i1.getInitiative() - i2.getInitiative());
    }
}
