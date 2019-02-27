package consolewow.classes;

import consolewow.races.AbstractRace;

public class Priest extends Character {
    public Priest(String name, AbstractRace race) {
        super(name, race);
    }

    public Priest(String name, int lvl, AbstractRace race) {
        super(name, lvl, race);
    }

    public void mindBlast() {
        if (this.target == null) {
            System.out.println("I need a target..");
            return;
        }
        if (this.target == this) {
            System.out.println("I need a target..");
            return;
        }

        // calculate damage
        int mindBlastDamage = 250;

        // handle spell power
        // handle crit
        // handle everything

        // handle resistance
        // double resist = this.target.getShadowResist();
        // todo insert rng on resist chance
        System.out.println("Mindblasting " + this.target.getName());
        this.target.takeDamage(mindBlastDamage);
    }
}