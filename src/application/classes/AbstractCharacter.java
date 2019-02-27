package application.classes;

import application.helpers.MagicResistanceObject;
import application.races.AbstractRace;
import application.stats.*;

public abstract class AbstractCharacter {
    // statics
    private static int _baseHp = 200;
    private static int _baseArmor = 15;
    private static double _baseStunResistance = 0.05;
    private static int _baseExpertise = 10;
    private static int _baseMeleeDamage = 10;
    private static int _baseAttackPower = 15;
    private static MagicResistanceObject _baseRestistance = new MagicResistanceObject(0, 0, 0, 0);

    private DefensiveStats _defensiveStats = new DefensiveStats(_baseHp, _baseArmor, _baseStunResistance);
    private MeleeStats _meleeStats = new MeleeStats(_baseMeleeDamage, _baseAttackPower, _baseExpertise);
    private AbstractRace _race;
    private int _level = 70;

    public AbstractCharacter(AbstractRace race) {
        this._race = race;
    }

    public AbstractCharacter(int lvl, AbstractRace race) {
        this._race = race;
        this.setLevel(lvl);
    }

    private static class pipelineEnum {
        public static String Defensive = "defensive";
        public static String MagicDamage = "MagicDamage";
        public static String Melee = "Melee";
        public static String All = "All";
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
        int ap = this._baseMeleeDamage + (meleeStats.getAttackPower() * damagePerAP) + (apGainPerLvl * currentLevel);
        meleeStats.setAttackPower(ap);

        this._meleeStats = meleeStats;
    }

    private void runDefensivePipeline() {
        DefensiveStats defensiveStats = this._defensiveStats;
        int currentLevel = this._level;
        // armor
        int armorPerlevel = 2;
        defensiveStats.setArmor(this._baseArmor + (armorPerlevel * currentLevel));
        // stam gain per lvl
        int stamPerLevel = 2;
        int hpPerStamina = 10;
        int hp = this._baseHp + (stamPerLevel * currentLevel * hpPerStamina);
        defensiveStats.setHp(hp);

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
}