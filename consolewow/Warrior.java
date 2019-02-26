package consolewow;

public class Warrior extends Character {

    // CONSTRUCTORS.
    public Warrior(String name) {
        super(name);
    }
    public Warrior(String name, int lvl) {
        super(name,lvl);
    }

    // OTHER METHODS
    public void dealPhysDamage(Character character) {
        character.takeDamage(this.getPhysDamage());
    }

}
