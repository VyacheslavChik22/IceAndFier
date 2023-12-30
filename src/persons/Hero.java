package persons;

import java.util.List;

public abstract class Hero {
    String status;
    String name;
    int health;          // Здоровье
    int armor;           // Броня
    int fightingSpirit;  // Боевой дух
    int experience;      // Опыт
    Rangefinder position;

    public Hero(String status, String name, int health, int armor, int fightingSpirit, int experience, int x, int y) {
        this.status = status;
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.fightingSpirit = fightingSpirit;
        this.experience = experience;
        this.position = new Rangefinder(x, y);

    }
}
