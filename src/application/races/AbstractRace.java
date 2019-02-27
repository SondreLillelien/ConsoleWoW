package application.races;

import application.stats.*;

public interface AbstractRace {

    public String getRace();

    public DefensiveStats getDefensiveBonuses(DefensiveStats stats);

    public MeleeStats getMeleeBonuses(MeleeStats stats);

    // public void getMagicBonuses();
}