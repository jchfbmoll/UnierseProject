package Menu;

import Universe.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuGalaxia implements Menu{
    Galaxy galaxy;
    Scanner sc;
    private final int min = 0;
    private final int max = 4;
    public MenuGalaxia(){

    }
    public MenuGalaxia(Galaxy galaxy, Scanner sc){
        this.galaxy = galaxy;
        this.sc = sc;
    }
    @Override
    public void mostrarMenu() {
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Crear un Objeto Astral");
        System.out.println("2. Eliminar un Objeto Astral");
        System.out.println("3. Mostrar lista de Objetos Astrales");
        System.out.println("4. Cargar Objeto Astral");
        System.out.println("0. Salir de la Galaxia");
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

    @Override
    public boolean opcionMenu(int opcion) {
        int nAstralObject;
        switch (opcion){
            case 1:
                crearObjeto();
                break;
            case 2:
                System.out.println("¿Qué Objeto Astral quiere eliminar?");
                galaxy.getAstralObjects();
                nAstralObject = sc.nextInt();
                galaxy.removeAstralObject(nAstralObject-1);
                break;
            case 3:
                galaxy.getAstralObjects();
                break;
            case 4:
                System.out.println("¿Qué galaxia quiere cargar?");
                galaxy.getAstralObjects();
                nAstralObject = sc.nextInt();
//              Menu menuastral = new MenuAstral(nAstralObject.getGalaxy(ngalaxia), sc);
                break;
            case 0:
                return true;

        }
        return false;
    }

    private void crearObjeto(){
        System.out.println("Que tipo de Objeto Astral quieres crear");
        System.out.println("1. Agujero Negro");
        System.out.println("2. Nebulosa");
        System.out.println("3. Sistema Solar");

        int opcion = 0;
        while (opcion < 1 || opcion > 3){
            System.out.println("Introduzca un valor entre 1 y 3");
            try{
                opcion = sc.nextInt();
            } catch (Exception e){
                System.out.println("Valor Incorrecto. Introduzca un valor válido");
            }
        }
        System.out.println("Dale un nombre");
        String nombre = sc.next();
        if(opcion==1){
            System.out.println("Agujero Negro Creado");
            AstralObject blackhole = new BlackHole(nombre);
            galaxy.addAstralObject(blackhole);
        } else if (opcion==2){
            System.out.println("¿Cuántos elementos va a tener la Nebulosa");
            int nelem = sc.nextInt();
            System.out.println("Introduzca los elementos");
            List<String> elementos = new ArrayList<String>();
            for(int i = 0; i<nelem; i++){
                System.out.println("Introduzca el elemento " + i);
                String elemento = sc.next();
                elementos.add(elemento);
            }
            System.out.println("Introduce el peso de la Nebulosa");
            int MAX_WEIGHT = sc.nextInt();
            AstralObject nebulosa = new Nebulose(nombre, elementos, MAX_WEIGHT);
            System.out.println("Nebulosa Creada");
            galaxy.addAstralObject(nebulosa);

        } else if (opcion == 3){

            System.out.println("Introduce el peso del Sistema Solar");
            int MAX_WEIGHT = sc.nextInt();
            AstralObject sistemaSolar = new SolarSystem(nombre, MAX_WEIGHT);
            System.out.println("Sistema Solar Creado");
            galaxy.addAstralObject(sistemaSolar);
        }
    }
}
