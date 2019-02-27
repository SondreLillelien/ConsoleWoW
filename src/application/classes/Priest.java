package application.classes;

import application.races.AbstractRace;

public class Priest extends Character {
    public Priest(String name, AbstractRace race) {
        super(name, race);
    }

    public Priest(String name, int lvl, AbstractRace race) {
        super(name, lvl, race);
    }
}