package Game.units;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class magic extends Person {
    public magic(float hp, String name, int[] damage, int attack, int def, int x, int y, int nT, int initiative) {
        super(hp, name, damage, attack, def, x, y, nT, initiative);
    }

    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {
        team.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int) ((o1.hp- o1.curHp)-(o2.hp- o2.curHp));
            }
        });
        team.get(0).getDamage(damage[0]);
    }
}
