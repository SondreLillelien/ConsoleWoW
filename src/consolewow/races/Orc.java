package consolewow.races;

import consolewow.stats.*;

public class Orc implements AbstractRace {
    private static String race = "Orc";

    public Orc() {
        super();
    }

    public DefensiveStats getDefensiveBonuses(DefensiveStats stats) {

        // resist to stun chance
        double resist = 0.05;
        stats.setStunResistance(resist);

        return stats;
    }

    public MeleeStats getMeleeBonuses(MeleeStats stats) {

        // expertise with axes
        int bonus = 5;
        int total = stats.getExpertise() + bonus;
        stats.setExpertise(total);

        return stats;
    }

    public String getRace() {
        return Orc.race;
    }
}