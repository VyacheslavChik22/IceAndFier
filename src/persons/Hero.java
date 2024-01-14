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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getFightingSpirit() {
        return fightingSpirit;
    }

    public void setFightingSpirit(int fightingSpirit) {
        this.fightingSpirit = fightingSpirit;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public Rangefinder getPosition() {
        return position;
    }

    public void setPosition(Rangefinder position) {
        this.position = position;
    }

    public int getInitiative() {
        return initiative;
    }

    @Override
    public String toString() {
        return status + " " + name
                + ", Броня: " + armor + ", Здоровье: " + health
                + ", Боевой дух: " + fightingSpirit + ", Опыт: " + experience
                + ", Позиция: " + position;
    }

    public void stepOfAction(ArrayList<Hero> enemies) {
        System.out.println("");
    }


}
