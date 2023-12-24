public abstract class Hero{
    String name;
    String status;
    int healthMax;       // Максимальное здоровье
    int armor;           // Броня
    int fightingSpirit;  // Боевой дух
    int experience;      // Опыт

    public Hero(String name, String status, int healthMax, int armor, int fightingSpirit, int experience) {
//       this.name = name;
//       this.status = status;
        this.healthMax = healthMax;
        this.armor = armor;
        this.fightingSpirit = fightingSpirit;
        this.experience = experience;
    }
}
