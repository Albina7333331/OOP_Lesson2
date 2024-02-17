package pers;

public class Peasant extends Pers {
    int strength;
    int agility;

    @Override
    public String toString() {
        return (this.name + " " + Peasant .class.getSimpleName());
    }

    public Peasant(int id, String name, int health, int stamina, String weapon, int strength, int agility) {
        super(id, name, health, stamina, weapon);
        this.strength = strength;
        this.agility = agility;
    }

    @Override
    public void attack(Pers target) {
        int damage = Pers.r.nextInt(5) + strength + agility;
        target.GetDamage(damage);
    }

    public void work(int hour) {
        stamina -= hour / 4;
    }
}

