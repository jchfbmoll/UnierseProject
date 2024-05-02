//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Universe universe = new Universe(1000);
        Galaxy Andromeda = new Galaxy("Andromeda", "Espiral", 100);
        Galaxy Via_Lactea = new Galaxy("Vía Lactea", "Espiral Barrada", 75);

        universe.addGalaxy(Andromeda);
        universe.addGalaxy(Via_Lactea);

        universe.Galaxy_List();

        SolarSystem sistemaAndromeda1 = new SolarSystem("Sistema 1", 10);

    }
}