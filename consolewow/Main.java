package consolewow;

import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // Random rng = new Random();
        // int level = rng.nextInt(5) + 1;

        Warrior kreg = new Warrior("Kreg");
        Priest fribol = new Priest("Fribol",65);

        System.out.println("Kreg's hp: " + kreg.getHp());
        System.out.println("Fribol's hp: " + fribol.getHp());
    }
}
