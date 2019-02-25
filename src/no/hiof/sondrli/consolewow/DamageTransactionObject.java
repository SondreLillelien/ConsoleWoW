package no.hiof.sondrli.consolewow;

public class DamageTransactionObject {

    public double getDamage() {
        return damage;
    }

    public double getHitChance() {
        return hitChance;
    }

    private double damage;

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setHitChance(double hitChance) {
        this.hitChance = hitChance;
    }

    private double hitChance;

    public DamageTransactionObject(double damage, double hitChance) {
        this.damage = damage;
        this.hitChance = hitChance;
    }
}
