import java.util.ArrayList;
import java.util.List;

public class SolarSystem extends AstralObject{
    private final String name;
    private final int weight;
    private List<SolarObject> solarObject = new ArrayList<>();
    private final long initial_time;

    public SolarSystem(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.initial_time = System.currentTimeMillis();
    }

    public String getName(){
        return name;
    }
    @Override
    public void getTime(){
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
    @Override
    public int getWeight(){
        return this.weight;
    }
}
