package harcosokklubja;

public class Nagydarab extends Harcos{

    private int állóképesség;

    public int getÁllóképesség() {
        return állóképesség;
    }

    public void setÁllóképesség(int állóképesség) {
        this.állóképesség = állóképesség;
    }

    @Override
    public int getHealth() {
        return super.getHealth() + this.állóképesség;
    }

    public Nagydarab(int health, int damage, int állóképesség) {
        super(health, damage);
        this.állóképesség = állóképesség;
    }

    @Override
    public String toString() {
        return super.toString() + " + " +
                "állóképesség = " + állóképesség;
    }
}
