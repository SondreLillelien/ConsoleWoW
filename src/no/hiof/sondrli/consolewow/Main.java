package no.hiof.sondrli.consolewow;

import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random rng = new Random();
        int level = rng.nextInt(5) + 1;
        Warrior kreg = new Warrior("Kreg", 100, 20, 500, 15, level);
        Warrior per = new Warrior ("Per", 100, 20, 500, 15, level);

        System.out.println(per.getHp());

        kreg.dealPhysDamage(per);

        System.out.println(per.getHp());
    }
}
