package controllers;

import java.util.List;

import models.Persona;
import views.View;

public class Controller {
    
    private List<Persona> personas;
    private View view = new View();
    private SearchMethods busca = new SearchMethods();
    private SortingMethods ordena = new SortingMethods();

    public Controller(List<Persona> personas, View view) {
        this.personas = personas;
        this.view = view;
    }
    //Metodos
    public void star(){
        do {
            int opcion = view.showMenu();
            switch (opcion) {
                case 1:
                    addPersons();
                    break;
                case 2:
                    inputPersons();

                    break;
                case 3:
                    view.displayPersons(personas);

                    break;
                case 4:
                    int opcion1 = view.selectSortingMethod();
                    switch (opcion1) {
                        case 1:
                            ordena.sortByNameWithBubble(personas);
                            break;
                        case 2:
                            ordena.sortByNameWithInsertion(personas);
                            break;
                        case 3:
                            ordena.sortByAgeWithInsertion(personas);
                            break;
                        case 4:
                            ordena.sortByNameWithSelectionDes(personas);
                            break;

                        default:
                            break;
                    }
                    break;
                case 5:
                    int opcion2 = view.selectSearchCriterion();
                    switch (opcion2) {
                        case 1:
                            if(!busca.isSortedByAge(personas)){
                                System.out.println("");
                                System.out.println("no esta ordenado por edad," 
                                                + " se ordenara de forma automatica");
                                ordena.sortByAgeWithInsertion(personas);
                            }
                            int objetivo = view.objetivoBusquedaEdad();
                            Integer resultado = busca.binarySearchByAge(personas, objetivo);
                            view.displaySearchResult(personas, resultado);
                            break;
                        case 2:
                            if(!busca.isSortedByName(personas)){
                                System.out.println("");
                                System.out.println("no esta ordenado por Nombre," 
                                                + " se ordenara de forma automatica");
                                ordena.sortByNameWithBubble(personas);
                            }
                            String objetivo1 = view.objetivoBusquedaNombre();
                            Integer resultado1 = busca.binarySearchByName(personas, objetivo1);
                            view.displaySearchResult(personas, resultado1);
                            break;
                        default:
                            break;
                    }
                    break;
                case 6:
                    System.exit(0);

                    break;                    
                default:
                    System.out.println("Opcion fuera de rango:");
                    break;
            }
        } while (true);

    }

    public void addPersons(){
        personas.add(view.inputPerson());
    }

    public void inputPersons(){
        
        int contador = view.inputNumero();

        for (int i = 0; i < contador; i++) {
            personas.add(view.inputPerson());    
        }
    }

}
