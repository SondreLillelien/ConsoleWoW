package application.classes;

import application.races.AbstractRace;

public class Character extends AbstractCharacter {

    private String name;
    private Boolean alive = true;
    public Character target = this;

    public Character(String name, AbstractRace race) {
        super(race);
        this.name = name;
    }

    public Character(String name, int lvl, AbstractRace race) {
        super(lvl, race);
        this.name = name;
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
        int hp = this.getHp();

        this.handleDamageTaken(damage);
        System.out.println(this.name + " taking damage: " + damage);

        if (damage >= hp) {
            this.die();
            System.out.println(this.name + " died...");
        }
    }

    public void target(Character c) {
        this.target = c;
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
