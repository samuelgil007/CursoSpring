import ObjetosJava.Persona;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Matrices {
    public static void main(String args[]){
        //Declaración de matrices
        int [][] casillasAjedrez = new int[8][8];
        Persona [][] personas = new Persona[1][1];

        //Para inicializar serían 2 fors anidados.
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {

            }
        }

        //Con dos diferentes tipos de datos, generalmente usado para crar jsons
        Map<Integer, String> array = new HashMap<Integer, String>();
        array.put(1, "hola");
        System.out.println("array = " + array);

        Map<Integer,Persona> array2 = new HashMap<>();
        array2.put(1,new Persona());
        System.out.println("array2 = " + array2);
    }
}
