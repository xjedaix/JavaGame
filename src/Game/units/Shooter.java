package Game.units;

import java.util.ArrayList;

public abstract class Shooter extends Person {

    protected int kolStrel;

    public Shooter(float hp, String name, int[] damage, int attack, int def, int x, int y, int nT, int kolStrel, int initiative) {
        super(hp, name, damage, attack, def, x, y, nT, initiative);
        this.kolStrel = kolStrel;
    }

    @Override
    public void step(ArrayList<Person> teamProtivnic, ArrayList<Person> team) {
        if (this.curHp == 0) return;
        if (this.kolStrel == 0) return;

        int k = super.findNearest(teamProtivnic);
        teamProtivnic.get(k).getDamage((this.damage[1]+this.damage[0])/2);


        for (int i = 0; i < team.size(); i++){
            if (team.get(i).getClass().getSimpleName().equals("Farmer") && team.get(i).status.equals("Stand")) {
                team.get(i).status = "busy";
                return;
            }
        }
        this.kolStrel -= 1;
    }

    @Override
    public String getInfo() {
        return String.format("%s \u27B3: %s",super.getInfo(),this.kolStrel);
    }
}
