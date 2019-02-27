package consolewow.races;

import consolewow.stats.*;

public interface AbstractRace {

    public String getRace();

    public DefensiveStats getDefensiveBonuses(DefensiveStats stats);

    public MeleeStats getMeleeBonuses(MeleeStats stats);

    // public void getMagicBonuses();
}