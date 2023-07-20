package Game.units;

import java.util.ArrayList;

public abstract class Infantry extends Person {
    public Infantry(float hp, String name, int[] damage, int attack, int def, int x, int y, int nT, int initiative) {
        super(hp, name, damage, attack, def, x, y, nT, initiative);
    }

    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {
           if (this.curHp == 0) return;
           int k = super.findNearest(teamProtivnic);
           int[] coordStep = coordinats.coordStep(teamProtivnic.get(k).coordinats);
           for (int i = 0; i < team.size(); i++){
                if (team.get(i).coordinats.x == coordStep[0] && team.get(i).coordinats.y == coordStep[1]) {
                      return;
                }
           }
        if (teamProtivnic.get(k).coordinats.x == coordStep[0] && teamProtivnic.get(k).coordinats.y == coordStep[1]) {
            teamProtivnic.get(k).getDamage((this.damage[1]+this.damage[0])/2);

//            if (teamProtivnic.get(k).curHp == 0)
                return;
        }

           this.coordinats.x = coordStep[0];
           this.coordinats.y = coordStep[1];

    }
}
