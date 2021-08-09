import ObjetosJava.PolimorfismoHija;
import ObjetosJava.PolimorfismoPadre;

public class Polimorfismo {
    /*
    POLIMORFISMO:
    - Declarar con padre pero instanciar con hijo. Esto hace que se sobreescriba con lo del hijo..
    - Los metodos quedan con los del instanciado.
    - LAS INTANCIAS APUNTAN A UNA PARTE DE LA MEMORIA(HEAP), por lo que con lo que quede instanciado hara
    todos las cosas con eso siempre.
     */
    public static void main(String args[]){
        PolimorfismoPadre variable =  new PolimorfismoHija("nombreHija");
        variable.nombre = "padre";
        System.out.println("variable.getNombre() = " + variable.getNombre());

        /*
             instance of, para ver el tipo de variable u objeto que es.
        */
        //Pertenece a los dos objetos, ya que es hija.
        System.out.println("Es intancia de padre: "+ (variable instanceof PolimorfismoPadre));
        System.out.println("Es intancia de hija: "+ (variable instanceof PolimorfismoHija));

    }
    
}
