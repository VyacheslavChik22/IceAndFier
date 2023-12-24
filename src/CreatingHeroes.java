import enums.Names;
import persons.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreatingHeroes {
    static List<Hero> heroesIce = new ArrayList<>();
    static List<Hero> heroesFire = new ArrayList<>();

    static String getRandomName() {
        return Names.values()[new Random().nextInt(Names.values().length - 1)].name();
    }

    static List<Hero> generatingHeroesCommands(int n) {
        List<Hero> commandHeroes = new ArrayList<>();
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = (int) (1 + Math.random() * 4) + n;
            switch (rand) {
                case 1:
                    commandHeroes.add(new Arbalester(getRandomName()));
                    break;
                case 2:
                    commandHeroes.add(new Monastic(getRandomName()));
                    break;
                case 3:
                    commandHeroes.add(new Robber(getRandomName()));
                    break;
                case 4:
                    commandHeroes.add(new Peasant(getRandomName()));
                    break;
                case 5:
                    commandHeroes.add(new Sniper(getRandomName()));
                    break;
                case 6:
                    commandHeroes.add(new Spearman(getRandomName()));
                    break;
                case 7:
                    commandHeroes.add(new Wizard(getRandomName()));
                    break;
            }
        }
        return commandHeroes;
    }
}
