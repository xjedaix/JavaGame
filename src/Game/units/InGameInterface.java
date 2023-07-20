package Game.units;

import java.util.ArrayList;

public interface InGameInterface {
    void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team);
    String getInfo();
    /* boolean isDied(); */
}
