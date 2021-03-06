package consolewow.stats.helpers;

public class MagicResistanceObject {
    private int fire, frost, shadow, nature;

    public MagicResistanceObject() {
        setFire(5);
        setFrost(5);
        setShadow(5);
        setNature(5);
    }

    public MagicResistanceObject(int fire, int frost, int shadow, int nature) {
        setFire(fire);
        setFrost(frost);
        setShadow(shadow);
        setNature(nature);
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public int getFrost() {
        return frost;
    }

    public void setFrost(int frost) {
        this.frost = frost;
    }

    public int getShadow() {
        return shadow;
    }

    public void setShadow(int shadow) {
        this.shadow = shadow;
    }

    public int getNature() {
        return nature;
    }

    public void setNature(int nature) {
        this.nature = nature;
    }

}