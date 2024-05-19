import Universe.*;
import Menu.*;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static int pantalla;
    private static boolean end;
    private static Scanner sc;

    public static Universe crearUniverso(){
        System.out.println("Vamos a crear tu Universo");
        System.out.println("Dale un nombre a tu universo");
        String nombre = sc.nextLine();
        System.out.println("Introduce una cantidad de materia máxima para tu universo");
        int MAX_WEIGHT = sc.nextInt();
        Universe universo = new Universe(nombre, MAX_WEIGHT);
        System.out.println("Bienvenidos al " + universo.getName() + " Universe!!!");
        System.out.println("Aprete una tecla para continuar");
        sc.nextLine();
        return universo;
    }
    public static void main(String[] args) {

        end = false;
        pantalla = 0;
         sc = new Scanner(System.in);

        Universe universe = crearUniverso();

        Menu menu = new menuUniverso(sc, universe);

        while (!end){

            menu.mostrarMenu();
            int eleccion = menu.valorElegido();
            end = menu.opcionMenu(eleccion);

        }
    }
}