package Universe;

import java.util.ArrayList;
import java.util.List;
public class Galaxy {
    private final String name;
    private final String type;
    private List<AstralObject> astralObjects = new ArrayList<>();
    private int weight;
    private final long initial_time;


    public Galaxy(String name, String type, int weight){
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.initial_time = System.currentTimeMillis();
    }

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public void getAstralObjects(){
        if (astralObjects.size() > 0) {
            for (int i = 0; i<astralObjects.size();i++) {
                System.out.println((i+1)+ ". " +astralObjects.get(i).getName());
            }
        } else {
            System.out.println("Aquesta Galàxia està Buïda!!!");
        }
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
        System.out.println("Aquesta galàxia té una edat de "+ years + " anys, " + months + " mesos, " + days + " dies, " + hours +" hores, " + minutes + " minuts i " + seconds + " segoms");
    }
    public void addAstralObject(AstralObject astralObject){
        astralObjects.add(astralObject);
    }

    public void removeAstralObject(int index){
        astralObjects.remove(index);
    }
    public int sizeGalaxy(){
        return astralObjects.size();
    }
}
