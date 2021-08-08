import ObjetosJava.Aritmetica;
import ObjetosJava.Persona;

public class CreacionClases {
    public static void main(String args[]) {
        //New lo que hace es solicitar espacio de memoria para la creacion(instanciar) de un objeto.
        // declarar es lo de antes del igual.
        Persona nueva = new Persona();
        nueva.mostrarNombre();
        nueva.nombre = "diegonorrea";
        nueva.mostrarNombre();

        //Con constructor con parametros
        Aritmetica ari = new Aritmetica(1,2);
        System.out.println("suma desde parametros: "+ari.suma(6, 2));
        System.out.println("suma desde atributos: "+ari.sumaConLosAtributos());

        //No puede acceder a los datos, es basura en la memoria y si hacen un garbage colector lo eliminan.
        Aritmetica ari2 = null;

        //Variables en stack=corto (primitivos o solo declarados), variables en heap: largo(objeto).
        //Las variables primitivas o declaradas apuntan a un lugar del heap cuando se instancian.
    }
}
