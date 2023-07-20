package Game.units;

import java.util.ArrayList;

public class Farmer extends Person{
    public Farmer(String name, int x, int y, int nT){
        super(20, name, new int[]{-1,-3},5,2, x,y, nT,1 );
    }

    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {
        if (this.curHp == 0) return;
        status ="Stand";
    }
}
