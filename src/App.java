import java.util.ArrayList;
import java.util.List;

import controllers.Controller;
import models.Persona;
import views.View;

public class App {
    public static void main(String[] args) throws Exception {
    
    
    List<Persona> personas = new ArrayList<>();
    View view = new View();
    Controller controlador = new Controller(personas, view);

    controlador.star();
    
    }
}
