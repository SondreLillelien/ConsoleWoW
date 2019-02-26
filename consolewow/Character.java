package consolewow;

import consolewow.helpers;

public class Character extends AbstractCharacter{

    private String name;
    public Character(String name){
        super();
        this.name = name;
    }
    public Character(String name,int lvl){
        super(lvl);
        this.name = name;
    }

    // OTHER METHODS
    private Boolean alive = true;
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
