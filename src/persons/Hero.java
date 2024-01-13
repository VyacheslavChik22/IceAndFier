package persons;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero {
    protected String status;
    protected String name;
    protected int health;          // Здоровье
    protected int armor;           // Броня
    protected int fightingSpirit;  // Боевой дух
    protected int experience;      // Опыт
    protected int initiative;
    public Rangefinder position;

    public Hero(String status, String name, int health, int armor, int fightingSpirit, int experience, int x, int y) {
        this.status = status;
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.fightingSpirit = fightingSpirit;
        this.experience = experience;
        this.position = new Rangefinder(x, y);

    }

    public int getInitiative() {
        return initiative;
    }
    @Override
    public String toString() {
        return status + " " + name
                + ", Здоровье: " + health + ", Броня: " + armor
                + ", Боевой дух: " + fightingSpirit + ", Опыт: " + experience
                + ", Позиция: " + position;
    }
    public void stepOfAction(ArrayList<Hero> enemies) {
        System.out.println("");
    }
}
