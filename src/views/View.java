package views;

import java.util.List;
import java.util.Scanner;

import models.Persona;

public class View {
    
    private Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\n-- Menú --");
        System.out.println("1 -> Agregar persona ");
        System.out.println("2 -> Agregar Personas ");
        System.out.println("3 -> Mostrar lista");
        System.out.println("4 -> Ordenar lista ");
        System.out.println("5 -> Buscar persona ");
        System.out.println("6 -> Salir");
        System.out.print("Seleccione la opción: ");

        int opcion = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 6)
                    break;
            } else {
                scanner.next();
            }
            System.out.println("Opción inválida, intente de nuevo:");
        }
        scanner.nextLine();
        return opcion;
    }

    public int inputNumero(){
        System.out.println("\nCuantas personas vas a ingresar");
        int edad = scanner.nextInt();
        scanner.nextLine();
        return edad;
    }

    public int inputAge(){
        System.out.println("Ingesa la edad: ");
        int edad =-1;
        while (true) {
            if (scanner.hasNextInt()) {
                edad = scanner.nextInt();
                if (edad >= 0)
                    break;
            } else {
                scanner.next();
            }
            System.out.println("Opción inválida, intente de nuevo:");
        }
        scanner.nextLine();
        return edad;
    }

    public String inputName(){
        System.out.println("Ingresa el nombre: ");
        String nombre = scanner.nextLine();
        return nombre;
    }
    
    public Persona inputPerson(){
        String nombre = inputName();
        int edad = inputAge();

        return new Persona(nombre, edad);
    }

    public int selectSortingMethod(){

        System.out.println("\n-- Seleciona el metodo de Ordenamiento --");
        System.out.println("1 -> Bubble por nombre");
        System.out.println("2 -> Insertion por nombre");
        System.out.println("3 -> Insertion por edad");
        System.out.println("4 -> Selection por nombre");
        System.out.print("Seleccione la opción: ");

        int opcion = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 4)
                    break;
            } else {
                scanner.next();
            }
            System.out.println("Opción inválida, intente de nuevo:");
        }
        return opcion;
    }

    public int selectSearchCriterion(){

        System.out.println("\n-- Seleciona el metodo de Busqueda --");
        System.out.println("1 -> Busqueda por edad");
        System.out.println("2 -> Busqueda por nombre");
        System.out.print("Seleccione la opción: ");

        int opcion = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 2)
                    break;
            } else {
                scanner.next();
            }
            System.out.println("Opción inválida, intente de nuevo:");
        }
        scanner.nextLine();
        return opcion;
    }

    public void displayPersons(List<Persona> personas){

        for (Persona person : personas) {
            System.out.println(person);
        }
    }

    public void displaySearchResult(List<Persona> personas, Integer resultado){
        if (resultado == null) {
            System.out.println("No se encontro la persona");
        }else{
            System.out.println("se encontro la persona " + personas.get(resultado) 
                        + " en la posición " + resultado);
        }

    }

    public int objetivoBusquedaEdad(){
        System.out.println("Ingrese la edad a buscar: ");
        int objetivo = scanner.nextInt();
        scanner.nextLine();
        return objetivo;
    }

    public String objetivoBusquedaNombre(){
        System.out.println("Ingrese el nombre a buscar: ");
        String objetivo = scanner.nextLine();
        return objetivo;
    }
}
