import java.util.ArrayList;
import java.util.List;

import controllers.Controller;
import controllers.SearchMethods;
import controllers.SortingMethods;
import models.Persona;
import views.View;

public class App {
    public static void main(String[] args) throws Exception {
    
    //SearchMethods busca = new SearchMethods();
    //SortingMethods ordena = new SortingMethods();
    List<Persona> personas = new ArrayList<>();
    View view = new View();
    Controller controlador = new Controller(personas, view);

    controlador.star();
    /*personas.add(new Persona("Jahir", 22));
    personas.add(new Persona("Mike", 23));
    personas.add(new Persona("Derlys", 17));
    for (Persona persona : personas) {
        System.out.println(persona);
    }
    ordena.sortByNameWithBubble(personas);
    for (Persona persona : personas) {
        System.out.println(persona);
    }*/
    } 
}
   