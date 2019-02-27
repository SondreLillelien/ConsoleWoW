package consolewow.classes;

import consolewow.races.AbstractRace;
import consolewow.stats.*;

public abstract class AbstractCharacter {
    // statics
    private static int _baseTotalHp = 2000;
    private static int _baseArmor = 15;
    private static double _baseStunResistance = 0.05;
    private static int _baseExpertise = 10;
    private static int _baseMeleeDamage = 10;
    private static int _baseAttackPower = 15;

    private DefensiveStats _defensiveStats = new DefensiveStats(_baseTotalHp, _baseArmor, _baseStunResistance);
    private MeleeStats _meleeStats = new MeleeStats(_baseMeleeDamage, _baseAttackPower, _baseExpertise);
    private AbstractRace _race;
    private int _level = 70;

    public AbstractCharacter(AbstractRace race) {
        this._race = race;
        this.handleStatUpdate(pipelineEnum.All);
    }

    public AbstractCharacter(int lvl, AbstractRace race) {
        this._race = race;
        this.setLevel(lvl);
        this.handleStatUpdate(pipelineEnum.All);
    }

    private static class pipelineEnum {
        public static String Defensive = "defensive";
        // public static String MagicDamage = "MagicDamage";
        public static String Melee = "Melee";
        public static String All = "All";
    }

    public void handleDamageTaken(int damageTaken) {
        int hp = this._defensiveStats.getHp() - damageTaken;
        this._defensiveStats.setHp(hp);
        this.handleStatUpdate(pipelineEnum.Defensive);
    }

    public void handleStatUpdate(String pipeline) {

        try {
            if (pipeline == pipelineEnum.All) {
                this.runDefensivePipeline();
                this.runMeleePipeline();
                // runMagicDamagePipeLine
            }
            if (pipeline == pipelineEnum.Defensive)
                this.runDefensivePipeline();
            if (pipeline == pipelineEnum.Melee)
                this.runMeleePipeline();
            // runMagicDamagePipeLine

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void runMeleePipeline() {
        MeleeStats meleeStats = this._meleeStats;
        int currentLevel = this._level;
        // racebonuses
        // MeleeStats asasd = this._race.getMeleeBonuses(meleeStats);
        // ap
        int damagePerAP = 1;
        int apGainPerLvl = 4;
        int ap = AbstractCharacter._baseMeleeDamage + (meleeStats.getAttackPower() * damagePerAP)
                + (apGainPerLvl * currentLevel);
        meleeStats.setAttackPower(ap);

        this._meleeStats = meleeStats;
    }

    private void runDefensivePipeline() {
        DefensiveStats defensiveStats = this._defensiveStats;
        int currentLevel = this._level;

        // armor
        // int armorPerlevel = 2;

        // stam gain per lvl
        int stamPerLevel = 2;
        int hpPerStamina = 10;
        int totalHp = AbstractCharacter._baseTotalHp + (stamPerLevel * currentLevel * hpPerStamina);
        defensiveStats.setTotalHp(totalHp);

        // race bonuses

        this._defensiveStats = defensiveStats;
    }

    @Override
    public String toString() {
        return "hi, I am a " + this._race.getRace().toString();
    }

    // GET og 1 SET-METHOD
    // public void setExpertise(int exp) {
    // this._meleeStats = exp;
    // this.handleStatUpdate(pipelineEnum.Melee);
    // }

    // public void setStunResistance(double _restistance) {
    // this._defensiveStats._stunResistance = _restistance;
    // this.handleStatUpdate(pipelineEnum.Defensive);
    // }

    public int getLevel() {
        return this._level;
    }

    public void setLevel(int level) {
        this._level = level;
        this.handleStatUpdate(pipelineEnum.All);
    }

    public int getHp() {
        return this._defensiveStats.getHp();
    }

    public double getStunResist() {
        return this._defensiveStats.getStunResistance();
    }

    public int getFireResist() {
        return this._defensiveStats.getFireResist();
    }

    public int getNatureResist() {
        return this._defensiveStats.getNatureResist();
    }

    public int getShadowResist() {
        return this._defensiveStats.getShadowResist();
    }

    public int getFrostResist() {
        return this._defensiveStats.getFrostResist();
    }

    public int getArmor() {
        return this._defensiveStats.getArmor();
    }

    public int getAttackPower() {
        return this._meleeStats.getAttackPower();
    }

    public int getMeleeDamage() {
        return this._meleeStats.getMeleeDamage();
    }

    public int getExpertise() {
        return this._meleeStats.getExpertise();
    }
}