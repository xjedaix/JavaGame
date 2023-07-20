package Game.units;

public  class Coordinats {
    int x;
    int y;

    public Coordinats(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: "+x+" y: "+y;
    }

    public double rastoynie(Coordinats coord){
        return Math.sqrt(Math.pow(coord.x-x,2)+Math.pow(coord.y-y,2));

    }

    public  int[] coordStep(Coordinats coordP) {

        int[] coordStep = {x,y};
//        if(Math.abs(this.x-coordP.x) > Math.abs(this.y-coordP.y)){
        if(coordP.x == this.x){
            if (coordP.y > this.y) coordStep[1] += 1;
            else coordStep[1] -= 1;
        }
        else {
            if (coordP.x > this.x) coordStep[0] += 1;
            else coordStep[0] -= 1;
        }

        return coordStep;
    }

}