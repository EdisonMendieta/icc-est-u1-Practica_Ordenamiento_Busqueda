package controllers;

import java.util.List;

import models.Persona;

public class SortingMethods {

    public void sortByNameWithBubble(List<Persona> personas){

        for (int i = 1; i < personas.size() - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < personas.size() - i - 1; j++) {
                if (personas.get(j).getName().compareTo(personas.get(j +1).getName()) > 0) {
                    Persona aux = personas.get(j);
                    personas.set(j,personas.get(j + 1));
                    personas.set(j + 1, aux);

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
   
        }     
    }
    
    public void sortByNameWithSelectionDes(List<Persona> personas){
        for (int i = 0; i < personas.size() - 1; i++) {
            int menor_i = i;
            for (int j = i + 1; j < personas.size() ; j++) {
                if (personas.get(j).getName().compareTo(personas.get(menor_i).getName()) < 0) {
                    menor_i = j;
                }
                
            }
            if (i != menor_i) {
                Persona aux = personas.get(menor_i);
                personas.set(menor_i,personas.get(i));
                personas.set(i, aux);
                
            }
        }
    }

    public void sortByAgeWithInsertion(List<Persona> personas){

        for (int i = 1; i < personas.size(); i++) {
            Persona key = personas.get(i);
            int j = i - 1 ;
            while (j >= 0 && personas.get(j).getAge() > key.getAge()) {
                personas.set(j + 1,personas.get(j));
                j -= 1;
                
            } 
            personas.set(j+1,key);
            
        }
    }

    public void sortByNameWithInsertion(List<Persona> personas){

        for (int i = 1; i < personas.size(); i++) {
            Persona key = personas.get(i);
            int j = i - 1 ;
            while (j >= 0 && personas.get(j).getName().compareTo(key.getName()) > 0) {
                personas.set(j + 1,personas.get(j));
                j -= 1;
                
            } 
            personas.set(j+1,key);
            
        }
    }
}
