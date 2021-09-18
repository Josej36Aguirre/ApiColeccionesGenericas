package test;

import java.util.*;
import javafx.beans.binding.StringBinding;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
       
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo");
//        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);
//        imprimir(miLista);
        Set<String> miset = new HashSet<String>();
        miset.add("Lunes");
        miset.add("Martes");
        miset.add("Miercoles");
        miset.add("Jueves");
        miset.add("Viernes");
        miset.add("Sabado");
        miset.add("Domingo");
        miset.add("Domingo");
        miset.add("domingo");
       
 
        
//        imprimir(miset);

    Map<String, String> miMapa = new HashMap();
    miMapa.put("valor1", "Jose");
    miMapa.put("valor2", "Neyda");
    miMapa.put("valor3", "Ana");
    miMapa.put("valor3", "Carlos");
    
    String elementoMapa = (String) miMapa.get("valor3");
//        System.out.println("elemento = " + elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> colection) {
        for (String eleObject : colection) {
            System.out.println("Dias forecha: " + eleObject);
        }
//        colection.forEach((eleObject) -> {
//            System.out.println("Dias forecha: " + eleObject);
//        });

    }
}
