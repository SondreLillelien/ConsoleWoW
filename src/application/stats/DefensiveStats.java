package application.stats;

import application.helpers.MagicResistanceObject;

public class DefensiveStats {
    public DefensiveStats(int _hp, int _armor, double _stunResistance) {
        super();
        setHp(_hp);
        setArmor(_armor);
        setStunResistance(_stunResistance);
    }

    private int _hp, _armor;
    private double _stunResistance;
    private MagicResistanceObject _restistance = new MagicResistanceObject();

    public double getStunResistance() {
        return this._stunResistance;
    }

    public void setStunResistance(double _stunResistance) {
        this._stunResistance = _stunResistance;
    }

    public int getHp() {
        return this._hp;
    }

    public void setHp(int hp) {
        this._hp = hp;
    }

    public int getArmor() {
        return _armor;
    }

    public void setArmor(int armor) {
        this._armor = armor;
    }

    public int getFireResist() {
        return this._restistance.getFire();
    }

    public void setFire(int fire) {
        this._restistance.setFire(fire);
    }

    public int getFrostResist() {
        return this._restistance.getFrost();
    }

    public void setFrost(int frost) {
        this._restistance.setFrost(frost);
    }

    public int getShadowResist() {
        return this._restistance.getShadow();
    }

    public void setShadow(int s) {
        this._restistance.setShadow(s);
    }

    public int getNatureResist() {
        return this._restistance.getNature();
    }

    public void setNature(int d) {
        this._restistance.setNature(d);
    }
}