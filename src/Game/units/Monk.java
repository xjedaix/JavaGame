package Game.units;

import java.util.ArrayList;

public class Monk extends magic{
    public Monk(String name, int x, int y, int nT) {
        super(10, name, new int[]{-5,-5},2,1, x, y, nT, 2);
    }

    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {

    }
}
