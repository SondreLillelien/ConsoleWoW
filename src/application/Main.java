package application;

import application.classes.*;
import application.races.*;

public class Main {

    public static void main(String[] args) {
        // Random rng = new Random();
        // int level = rng.nextInt(5) + 1;

        Warrior kreg = new Warrior("Kreg", new Troll());
        Priest fribol = new Priest("Fribol", 65, new Orc());

        System.out.println("Kreg: " + kreg);
        System.out.println("Fribol: " + fribol);
    }
}
