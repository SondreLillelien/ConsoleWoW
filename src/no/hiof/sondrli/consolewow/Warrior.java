package no.hiof.sondrli.consolewow;

public class Warrior extends Character {
    private int level;

    // CONSTRUCTORS.
    public Warrior(String name, int hp, int physDamage, int armor, int magicResist, int level) {
        super(name, hp, physDamage, armor, magicResist);
        this.level = level;
    }

    // OTHER METHODS
    public void dealPhysDamage(Character character) {
        character.takeDamage(this.getPhysDamage());
    }

    // GET AND SET-METHODS.
    public int getLevel() {
        return this.level;
    }

}
