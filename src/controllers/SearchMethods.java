package controllers;

import java.util.List;

import models.Persona;

public class SearchMethods {

    //devuelve posición
    public Integer binarySearchByAge(List<Persona> personas, int objetivo){
        int izquierda = 0;
        int derecha = personas.size() -1 ;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (personas.get(medio).getAge() == objetivo) {
                return medio;
            }

            if (personas.get(medio).getAge() < objetivo) {
                izquierda = medio + 1;
            }else{
                derecha = medio - 1;
            }
        }

        return null;
    }

    public Integer binarySearchByName(List<Persona> personas, String objetivo){
        int izquierda = 0;
        int derecha = personas.size() -1 ;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (personas.get(medio).getName().equals(objetivo)) {
                return medio;
            }

            if (personas.get(medio).getName().compareTo(objetivo) < 0) {
                izquierda = medio + 1;
            }else{
                derecha = medio - 1;
            }
        }

        return null;
    }

    public boolean isSortedByName(List<Persona> personas) {
        for (int i = 0; i < personas.size() - 1; i++) {
            String actual = personas.get(i).getName();
            String siguiente = personas.get(i + 1).getName();

            if (actual.compareTo(siguiente) > 0) {
                return false;
            }
        }
        return true;
    }


    public boolean isSortedByAge(List<Persona> personas) {
        for (int i = 0; i < personas.size() - 1; i++) {
            int actual = personas.get(i).getAge();
            int siguiente = personas.get(i + 1).getAge();

            //si el actual es mayor que el siguiete 3 > 1 no esta ordenado Ascendente
            if (actual > siguiente) {
                return false;
            }
        }
    return true;
    }    
}
