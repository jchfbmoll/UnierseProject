import java.util.ArrayList;
import java.util.List;

public class Nebulose extends AstralObject{



    private int weight;
    private List<String> elements = new ArrayList<>();
    private final long initial_time;

    public Nebulose(String[] elements, int weight) {
        this.weight = weight;
        this.initial_time = System.currentTimeMillis();
        for (String element: elements){
            this.elements.add(element);
        }
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
        System.out.println("Aquesta nebulossa té una edat de "+ years + " anys, " + months + " mesos, " + days + " dies, " + hours +" hores, " + minutes + " minuts i " + seconds + " segoms");
    }
    @Override
    public int getWeight(){
        return this.weight;
    }
}
