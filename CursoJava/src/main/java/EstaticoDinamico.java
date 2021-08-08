import ObjetosJava.ClaseConEstaticos;

public class EstaticoDinamico {
    public static void main(String args[]){
        //Las estaticas se cargan primero que las dinamicas y en este se cargan las clases.
        //Si definimos algo como estatico decimos que pertenece a la clase y no al objeto.
        //Se puede invocar un estatico sin instanciar objeto.

        ClaseConEstaticos  primera = new ClaseConEstaticos();
        System.out.println("primera = " + primera);

        ClaseConEstaticos  segunda = new ClaseConEstaticos();
        System.out.println("segunda = " + segunda);

        //Se puede acceder porque es estatico, se accede desde la clase.
        System.out.println("Clases: "+ ClaseConEstaticos.contadorDeClases);
        //Las dinamicas se cargan despues y carga los objetos.
        /* this.toString(); */ //Marca error porque static se instancia primero
    }
}
