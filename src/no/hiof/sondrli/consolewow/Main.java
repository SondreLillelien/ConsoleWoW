package no.hiof.sondrli.consolewow;

public class Main {

    public static void main(String[] args) {
        int level = 10;
        Warrior kreg = new Warrior("Kreg", 100, 20, 500, 15, level);
        Warrior per = new Warrior("Per", 100, 20, 500, 15, level);
        kreg.setHitChance(0.9);
        for (int x = 0; x < 1000; x++) {
            kreg.AutoAttack(per);
            System.out.println(per.getHp());
        }
    }
}
