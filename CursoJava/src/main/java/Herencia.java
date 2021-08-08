import ObjetosJava.HijaHerencia;

public class Herencia {
    public static void main(String args[]){
        /* Herencia, las hijas tiene cosas en común con el  padre
        (atributos publicos, metodos publicos) pero tamebin tiene sus propias caracteristicas
        SE USA CON EXTENDS
        CLASE PADRE: SUPERCLASE*/

        HijaHerencia hija = new HijaHerencia("Samuel","AtributoHija", 24);
        System.out.println("hija = " + hija);

        HijaHerencia hija2 = new HijaHerencia("Samuel2","AtributoHija2", 242);
        System.out.println("hija2 = " + hija2);

        //SOBRECARGA DE CONSTRUCTORES = OFRECER VARIOS CONSTRUCTORES
        //Si se usa this(); en un constructor, sirve para llamar a un constructor vacío
        //Por lo anterior puede haber constructores privados

        //SOBRECARGA DE METODOS SIGUE LA MISMA LOGICA QUE LA SOBRECARGA DE CONSTRUCTORES
        //Diferentes parametros o tipos de parametros = otro metodo.
    }
}
