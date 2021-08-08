import ObjetosJava.Aritmetica;

import java.util.Date;

public class PasoPorReferencia {
    public static void main(String args[]){
        Aritmetica ari = new Aritmetica();
        cambiarValor(ari);
        System.out.println("ari.numero2 = " + ari.numero2);
        //Pasamos el objeto al metodo y se pueden cambiar sus valores adentro. Porque es un objeto.
        //Return es para devolver algo en un metodo.
        System.out.println(fechaActual());
    }

    private static void cambiarValor(Aritmetica ari) {
        ari.numero2 = 2;
    }
    private static Date fechaActual() {
        //Se pueden retornar referencias de objetos creados
        return new Date();
    }
}
