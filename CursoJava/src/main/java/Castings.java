import java.util.Scanner;

public class Castings {
    public static void main(String args[]){

        //String a int
        var numero = Integer.parseInt("2");
        //Double a int
        var numD = Double.parseDouble("3.1427");
        //String a char en una posicion
        var ch = "hola".charAt(0);
        //El escaner regresa siempre string, por eso tan importantes los castings
        Scanner escan = new Scanner(System.in);
        var variable = escan.nextLine();
        //Cualquier variable a string
        var palabra = String.valueOf(20);
    }

}
