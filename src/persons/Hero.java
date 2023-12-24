package persons;

public abstract class Hero {
    String status;
    String name;
    int health;          // Здоровье
    int armor;           // Броня
    int fightingSpirit;  // Боевой дух
    int experience;      // Опыт

    public Hero(String status, String name, int health, int armor, int fightingSpirit, int experience) {
        this.status = status;
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.fightingSpirit = fightingSpirit;
        this.experience = experience;
    }

}
