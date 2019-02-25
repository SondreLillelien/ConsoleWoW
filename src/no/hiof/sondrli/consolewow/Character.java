package no.hiof.sondrli.consolewow;

import java.util.Random;

public abstract class Character {
    private String name;
    private int hp, physDamage, armor, magicResist;
    private boolean alive = true;
    private double hitChance;
    private double parryChance;
    private double dodgeChance;
    private double blockChance;

    // CONSTRUCTORS
    public Character(String name, int hp, int physDamage, int armor, int magicResist) {
        this.name = name;
        this.hp = hp;
        this.physDamage = physDamage;
        this.armor = armor;
        this.magicResist = magicResist;
    }


    // OTHER METHODS
    private void die() {
        if (alive) {
            alive = false;
        }
    }

    public void ressurect() {
        alive = true;
    }


    public void takeDamage(DamageTransactionObject transObj) {
        Random rng = new Random();


        var hitChance = transObj.getHitChance();
        var parry = 0.7;// should be this.parry
        var block = 0.9;// should be this.block
        var dodge = 0.9; // should be this.dodgeChance
        var combined = (hitChance * parry * block * dodge) * 100;
        var successfullHit = rng.nextInt(100) < combined;


        if (!successfullHit) {
            System.out.println("player missed the attack");
            return;
        }

        var damage = transObj.getDamage();

        if (damage >= hp) {
            this.die();
            hp = 0;
        } else {
            hp -= damage;
        }
    }


    // GET AND SET-METHODS
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPhysDamage() {
        return physDamage;
    }

    public void setPhysDamage(int physDamage) {
        this.physDamage = physDamage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMagicResist() {
        return magicResist;
    }

    public void setMagicResist(int magicResist) {
        this.magicResist = magicResist;
    }

    public boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getParryChance() {
        return parryChance;
    }

    public void setParryChance(double parryChance) {
        this.parryChance = parryChance;
    }

    public double getDodgeChance() {
        return dodgeChance;
    }

    public void setDodgeChance(double dodgeChance) {
        this.dodgeChance = dodgeChance;
    }

    public double getBlockChance() {
        return blockChance;
    }

    public void setBlockChance(double blockChance) {
        this.blockChance = blockChance;
    }

    public double getHitChance() {
        return hitChance;
    }

    public void setHitChance(double r) {
        this.hitChance = r;
    }
}
