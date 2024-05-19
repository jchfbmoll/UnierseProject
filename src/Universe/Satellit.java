package Universe;

import java.util.ArrayList;
import java.util.List;

public class Satellit {
    private int weight;
    private final long initial_time;

    public Satellit(int weight){
        this.weight = weight;
        this.initial_time = System.currentTimeMillis();
    }
    public void getTime() {
        long now = System.currentTimeMillis();
        long edat = now - initial_time;
        edat/=1000;
        long seconds = edat%60;
        edat/=60;
        long minutes = edat%60;
        edat/=60;
        long hours = edat%24;
        edat/=24;
        long days = edat%30;
        edat/=30;
        long months = edat%12;
        long years = edat/12;
        System.out.println("Aquesta sistema solar té una edat de "+ years + " anys, " + months + " mesos, " + days + " dies, " + hours +" hores, " + minutes + " minuts i " + seconds + " segoms");
    }

    public int getWeight() {
        return this.weight;
    }
}
