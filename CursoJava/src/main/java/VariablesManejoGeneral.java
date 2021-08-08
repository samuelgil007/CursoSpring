import java.util.Scanner;

public class VariablesManejoGeneral {
    public static void main(String args[]){

        //Manejo de variables
        System.out.println("Hola mundo");
        String hola = "hola";
        //Comparar cadenas de texto con equals, es un tipo primitivo no necesita instanciarse con new
        var numero = 2;
        /*
        Con var se pueden usar con tipos primitivos, parecido a let en js. Sin mencionar el tipo.

        Concatenar = unir variables: " " + variable .... etc.

        Las variables hacen lo primero que se encuentren en una concatenacion, si encuentra string concatena,
        si es numero hace operacion y concatena.

        Nueva linea : \n o aveces \r, tabulador: \t, retroceso (quitar espacios): \b
         */

        //Leer información de la consola
        Scanner escaner = new Scanner(System.in);
        var variable = escaner.nextLine();
        System.out.println(variable);
    }
}
