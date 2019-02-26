package consolewow;

import consolewow.helpers.MagicResistanceObject;

public abstract class AbstractCharacter
{   //statics  
    private static int _baseHp = 200;
    private static int _basePhysicalDamage = 10;
    private static int _baseArmor = 15;
    private static int _baseAttackPower = 15;
    private static MagicResistanceObject _baseRestistance = new MagicResistanceObject(0,0,0,0); 

    private int level = 70;  

    public AbstractCharacter(){
        //empty hvis lvl 70 er greit som default lvl
    }
    public AbstractCharacter(int lvl){
        this.level = lvl;
    }

    // GET og 1 SET-METHOD
    public int getHp() {
        int stamPerLevel = 2;
        int hpPerStamina = 10;
        int hp = this._baseHp + (stamPerLevel * this.level * hpPerStamina);
        return hp;
    }

    public int getAttackPower(){
        int attackPowerPerLvl = 4;
        return this._baseAttackPower + (attackPowerPerLvl * this.level);
    }

    public double getPhysicalDamage() {
        int damagePerAP = 1;
        int apGainPerLvl = 4;
        double physicalDamage = this._basePhysicalDamage + (this.getAttackPower() * damagePerAP) + (apGainPerLvl * this.level);
        return physicalDamage;
    }

    public int getArmor() {
        int armorPerlevel = 2;
        return this._baseArmor + (armorPerlevel * this.level);
    }

    public int getFireResist() {
        return this._baseRestistance.getFire();
    }

    public int getFrostResist() {
        return this._baseRestistance.getFrost();
    }

    public int getShadowResist() {
        return this._baseRestistance.getShadow();
    }

    public int getNatureResist() {
        return this._baseRestistance.getNature();
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}