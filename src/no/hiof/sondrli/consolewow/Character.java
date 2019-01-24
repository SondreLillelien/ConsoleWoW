package no.hiof.sondrli.consolewow;

public class Character {
    private String name;
    private int hp, physDamage, armor, magicResist;
    private Boolean alive = true;

    // CONSTRUCTORS
    public Character(String name, int hp, int physDamage, int armor, int magicResist){
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

    public void takeDamage(int damage) {
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

    public Boolean getAlive() {
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
}
