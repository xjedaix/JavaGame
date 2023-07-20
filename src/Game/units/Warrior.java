package Game.units;

public abstract class Warrior extends Person{

    public Warrior(float hp, String name, int[] damage, int attack, int def, int x, int y, int nT, int initiative) {

        super(hp, name, damage, attack, def, x, y, nT, initiative);
    }


}
