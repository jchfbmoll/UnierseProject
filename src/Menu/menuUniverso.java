package Menu;

import Universe.Universe;
import Universe.Galaxy;
import UniverseDB.UniverseDBConnector;

import java.sql.SQLException;
import java.util.Scanner;

public class menuUniverso implements Menu{

    Scanner sc;
    Universe universe;
    private final int min = 0;
    private final int max = 6;
    public menuUniverso(){

    }
    public menuUniverso(Scanner sc, Universe universe){

        this.sc = sc;
        this.universe = universe;
    }
        @Override
    public void mostrarMenu() {
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Crear una Galaxia");
        System.out.println("2. Eliminar una Galaxia");
        System.out.println("3. Mostrar lista de Galaxias");
        System.out.println("4. Cargar galaxia");
        System.out.println("5. Cargar Universo");
        System.out.println("6. Guardar Universo");
        System.out.println("0. Salir");
    }

//    int eleccion = valorElegido(0, 4);
//    opcionMenuUniverso(universe, );
//        return eleccion;

    public boolean opcionMenu(int opcion){
        int ngalaxia;
        switch (opcion){
            case 1:
                crearGalaxia();
                break;
            case 2:
                System.out.println("¿Qué galaxia desea eliminar?");
                universe.galaxy_List();
                ngalaxia = sc.nextInt();
                universe.removeGalaxy(ngalaxia-1);
                break;
            case 3:
                universe.galaxy_List();
                break;
            case 4:
                System.out.println("¿Qué galaxia quiere cargar?");
                universe.galaxy_List();
                ngalaxia = sc.nextInt();
                Menu menugalaxia = new MenuGalaxia(universe.getGalaxy(ngalaxia-1), sc);
                boolean endgalaxia = false;
                while (!endgalaxia){
                    menugalaxia.mostrarMenu();
                    int eleccion = menugalaxia.valorElegido();
                    endgalaxia = menugalaxia.opcionMenu(eleccion);
                }
                break;
            case 5:
                System.out.println("Probando db");
                UniverseDBConnector dbConnector = new UniverseDBConnector();
                try {

                    UniverseDBConnector.openDatabaseConnection();
                    UniverseDBConnector.closeDatabaseConnection();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            case 6:
                System.out.println("Probando db");
            case 0:
                return true;

        }
        return false;
    }
    @Override
    public int valorElegido(){
        boolean valorCorrecto = false;
        int eleccion = -1;
        while (!valorCorrecto && (eleccion< min || eleccion > max)) {
            try {

                eleccion = sc.nextInt();
                if (eleccion>=min && eleccion <= max) {
                    valorCorrecto = true;
                } else {
                    System.out.println("Por favor introduce un valor válido");
                }
            } catch (Exception e) {
                System.out.println("Por favor introduce un valor válido");
            }
        }
        return eleccion;

    }
    private void crearGalaxia(){
        System.out.println("Vamos a crear una Galaxia");
        System.out.println("Dale un nombre");
        String nombre = sc.next();
        System.out.println("Introduce un tipo");
        String tipo = sc.next();
        System.out.println("Introduce una cantidad de materia máxima para la galaxia");
        int MAX_WEIGHT = sc.nextInt();
        Galaxy galaxia = new Galaxy(nombre, tipo, MAX_WEIGHT);
        universe.addGalaxy(galaxia);
        sc.nextLine();
    }
}
