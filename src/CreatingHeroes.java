import persons.Hero;
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

    static List<Hero> generatingHeroesCommands(int n, int y) {
        List<Hero> commandHeroes = new ArrayList<>();
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = (int) (1 + Math.random() * 4) + n;
            switch (rand) {
                case 1:
                    commandHeroes.add(new Arbalester(getRandomName(), i, y));
                    break;
                case 2:
                    commandHeroes.add(new Monastic(getRandomName(), i, y));
                    break;
                case 3:
                    commandHeroes.add(new Robber(getRandomName(), i, y));
                    break;
                case 4:
                    commandHeroes.add(new Peasant(getRandomName(), i, y));
                    break;
                case 5:
                    commandHeroes.add(new Sniper(getRandomName(), i, y));
                    break;
                case 6:
                    commandHeroes.add(new Spearman(getRandomName(), i, y));
                    break;
                case 7:
                    commandHeroes.add(new Wizard(getRandomName(), i, y));
                    break;
            }
        }
        return commandHeroes;
    }
}
