package Universe;

import java.util.ArrayList;
import java.util.List;

public class Universe {
    private int id;
    private String name;
    private List<Galaxy> galaxies = new ArrayList<>();
    private long MAX_WEIGHT;
    private long initial_time;

    public Universe(){
    }

    public Universe(String name, long MAX_WEIGHT){
        this.id = -1;
        this.name = name;
        this.MAX_WEIGHT = MAX_WEIGHT;
        this.initial_time = System.currentTimeMillis();
    }
    public long getInitial_time(){
        return initial_time;
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
        System.out.println("L'univers té una edat de "+ years + " anys, " + months + " mesos, " + days + " dies, " + hours +" hores, " + minutes + " minuts i " + seconds + " segons");
    }
    public void setID(int id){
        this.id = id;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWeight(long weight){
        this.MAX_WEIGHT = weight;
    }
    public long getWeight(){
        return MAX_WEIGHT;
    }
    public void setTime(long time){
        this.initial_time = time;
    }
    public void addGalaxy(Galaxy galaxy){
        galaxies.add(galaxy);
    }
    public Galaxy getGalaxy(int i){return galaxies.get(i);}

    public void removeGalaxy(int galaxy){
        galaxies.remove(galaxy);
    }

    public void galaxy_List(){
       if (galaxies.size() > 0) {
           for (int i = 0; i<galaxies.size();i++) {
               System.out.println((i+1)+ ". " +galaxies.get(i).getName());
           }
       } else {
           System.out.println("Encara no s'han creat Galàxies en aquest Univers");
       }
    }º
    public int sizeUniverse(){
        return galaxies.size();
    }

    public String toString(){
        String universeString = "prova to string";
        return universeString;
    }

    public void verUniverso(){
        String strUniverse = "Universo " + id + "{\nNom = " + name + ", Weight = " + MAX_WEIGHT +", Temps = ";
        System.out.print(strUniverse);
        getTime();
        System.out.println("}");
    }


}
