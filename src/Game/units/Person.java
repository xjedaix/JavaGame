package Game.units;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Person implements InGameInterface, Serializable {

    protected float hp; // Здоровье
    protected float curHp; // Здоровье сейчас
    protected String name;

    protected int[] damage; //Урон
    protected int attack; //Сила удара
    protected int def;

    protected Coordinats coordinats;

    protected int numberTeam;

    public int initiative;

    protected String status;


    public Person(float hp, String name, int[] damage,int attack,int def, int x, int y, int nT, int initiative) {
        this.hp = this.curHp=hp;
        this.name = name;
        this.damage = damage;
        this.attack = attack;
        this.def = def;
        this.coordinats = new Coordinats(x,y);
        this.numberTeam = nT;
        this.initiative = initiative;
        this.status = "Stand";

      }

    public int findNearest(ArrayList<Person> teamProtivnic){
//        teamProtivnic.forEach(n->);

        double minR = coordinats.rastoynie(teamProtivnic.get(0).coordinats);
        int k = 0;

        for (int i = 0; i < 10; i++) {
            double R = coordinats.rastoynie(teamProtivnic.get(i).coordinats);
            if(R<minR && !daad()) {
                minR = R;
                k = i;
            }
        }

//        System.out.println(getClass().getName()+" "+name+"- "+teamProtivnic.get(k).name+" "+minR);
        return k;
    }



    @Override
    public String getInfo(){
        return String.format(" %s %s %s \u2764: %s \u2661: %s \u2694: %s In: %s",this.getClass().getSimpleName(),this.name,
                this.status, this.hp, this.curHp, Arrays.toString(this.damage), this.initiative);
    }

    protected void getDamage(float damage){
        this.curHp -= damage;
        if(this.curHp <= 0){
            this.status = "dead";
            this.curHp = 0;
        }

        if(this.curHp>this.hp) {
            this.curHp = this.hp;
        }
    }

    public int[] getCoords(){
        int[] coord = new int[2];
        coord[0] = this.coordinats.x;
        coord[1] = this.coordinats.y;

        return coord;
    }
    public float getHp(){
        return this.curHp;
    }

    public boolean daad(){
        return this.status.equals("dead");
    }



}