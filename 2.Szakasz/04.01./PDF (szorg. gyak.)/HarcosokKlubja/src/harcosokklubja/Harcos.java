package harcosokklubja;

public class Harcos {

    private int health;
    private int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Harcos(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Harcos vagyok az ütőerőm: " + damage + " és az életerőm: " + health;
    }

    public void megut(Harcos harcos){
        harcos.health -= this.damage;
        System.out.println("Az a harcos megütötte a b harcost!");
    }
}
