package application;

import application.classes.*;
import application.races.*;

public class Main {

    public static void main(String[] args) {

        Warrior kreg = new Warrior("Kreg", new Troll());
        Priest fribol = new Priest("Fribol", 65, new Orc());

        System.out.println("Fribol: " + fribol.getExpertise());
        fribol.setLevel(70);
        System.out.println("Fribol: after pipeline " + fribol.getExpertise());

        System.out.println("Kreg: " + kreg.getHp());
        fribol.target(kreg);
        fribol.mindBlast();
        System.out.println("Kreg: " + kreg.getHp());
    }
}
