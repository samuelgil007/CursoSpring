import ObjetosJava.HijaHerencia;
import org.w3c.dom.ls.LSOutput;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static Metodos.Imprimir.imprimir;

public class Varios {

    //forEach
    {
        List <Integer> array = null;
        array.forEach((id) ->{
        });
    }
    public static void main(String args[]){
        //Ejemplo de importar un metodo statico de otra clase
        imprimir("hola");
    }

    /*Palabra final
    En variables: Que nunca cambia
    En metodos: evita que las subclases lo editen
    En clases: Evita que se cree una subclase
    */
    final double numeroPi = 3.1416;

    //Argumentos variables, puede ser un int o un arreglo de los que sea
    //El argumento variable tiene que ser el ultimo
    public int sumaNumeros(int... num){
        int suma = 0;
        for (int ç = 0; ç < num.length; ç++) {
            suma+= num[ç];
        }
        //Otro forma
        for (int numero: num) {
        }
        return suma;
    }

    //Enumerar constantes, parecido a un json
    public enum dias {
        lunes(1),
        martes(2),
        miercoles(3);

        private final int dia;

        dias(int day){
            this.dia = day;
        }

        public int getDia() {
            return dia;
        }
    }

    //Bloque de codigo, se inicia y se pone antes del cosntructor
    //static {} bloque para objetos o variables estaticas
    {
        System.out.println("Bloque para inicializar codigo");
    }

    //Autoboxing y unboxing. Pasar un primitivo a objeto y viceversa en ese orden.
    //Normalmente los objetos primitivos empiezan por minuscula. La ventaja de los objetos es que tienen metodos.
    //puse static para usar un bloque de codigo
    static Integer intObj = 10;
    static int num = intObj;
    static{
        System.out.println(intObj.toString());
    }

    /*
    Modificadores de acceso:
    public: todas las demas clases tienen acceso al elemento
    protected: restringe el acceso menos a las clases hijas y las clases del mismo paquete.
    default: restringe el acceso menos a las clases del mismo paquete.
    private: solo los elementos de la misma clase pueden acceder a él.
     */

    /*
    Override: reescribir algo de una clase padre, normalmente metodos.
    Tienen el mismo modificador de acceso que el padre.
     */

    /*
    ABSTRACTAS: Tiene atributos y metodos pero estos no tienen comportamiento.
    - Las clases abstractas no se pueden instanciar.
    - La clase y los metodos son abstract.
        VER EJEMPLO EN LA CLASE ABSTRACTA CREADA.
     */
    /*
    INTERFACES: Define un comportamiento similar, pero no como la abstracta. Cualquier clase
    puede extenderse de una interface para tener el comportamiento.
    Sus variables son en mayuscula.
     */

    /*
    JAVABEAN: UN POJO PERO EXTENDIDO DE SERIALIABLE. ES UNA CLASE COMO PARA DTO.
    https://www.generacodice.com/es/articolo/79997/diferencia-entre-dto-vo-pojo-javabeans
     */

}
