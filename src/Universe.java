import java.util.ArrayList;
import java.util.List;

public class Universe {
    private List<Galaxy> galaxies = new ArrayList<>();
    private final long MAX_WEIGHT;
    private final long initial_time;

    public Universe(long MAX_WEIGHT){
        this.MAX_WEIGHT = MAX_WEIGHT;
        this.initial_time = System.currentTimeMillis();
    }

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
        System.out.println("L'univers té una edat de "+ years + " anys, " + months + " mesos, " + days + " dies, " + hours +" hores, " + minutes + " minuts i " + seconds + " segoms");
    }

    public void addGalaxy(Galaxy galaxy){
        galaxies.add(galaxy);
    }

    public void removeGalaxy(Galaxy galaxy){
        galaxies.remove(galaxy);
    }

    public void Galaxy_List(){
        System.out.println("Aquest univers conté les següents galàxies");
        for (Galaxy galaxy: galaxies){
            System.out.println(galaxy.getName());
        }
    }
    public int sizeUniverse(){
        return galaxies.size();
    }

    public String toString(){
        String universeString = "prova to string";
        return universeString;
    }
}
