package entities;

public class Attributes {
    private double life;
    private double mana;

    public Attributes(double life, double mana) {
        this.life = life;
        this.mana = mana;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }
}
