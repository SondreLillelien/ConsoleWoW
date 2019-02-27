package application.stats;

public class MeleeStats {
    public MeleeStats(int _meleeDamage, int _attackPower, int _expertise) {
        super();
        setAttackPower(_attackPower);
        setMeleeDamage(_meleeDamage);
        setExpertise(_expertise);
    }

    private int _meleeDamage, _attackPower, _expertise;

    public int getExpertise() {
        return _expertise;
    }

    public void setExpertise(int _expertise) {
        this._expertise = _expertise;
    }

    public int getAttackPower() {
        return _attackPower;
    }

    public void setAttackPower(int _attackPower) {
        this._attackPower = _attackPower;
    }

    public int getMeleeDamage() {
        return _meleeDamage;
    }

    public void setMeleeDamage(int _meleeDamage) {
        this._meleeDamage = _meleeDamage;
    }

}