public class Operaciones {
    public static void main(String args[]){
        //Los de siempre, son igual que en javascript: &&, ||, <=, <, -- , ++, etc...
        // % modulo, si num % 2 == 0, es par.

        // como se puede aumentar con +=, se puede con *=, %= y cualquier otro operador basico.

        //Soutv para imprimir con variable

        //Invertir enteros = -+, invertir booleanos: ! ,

        //Incremento y postincremento -> --i reduce la variable y asigna. i-- asigna y reduce la variable.
        int num2 = 2;
        int num1 = num2--;
        System.out.println("num1 = " + num1);

        //Java tambien tiene la simplificacion de los ifs.
        var bol = 2 > 3? true: "false";
        System.out.println("bol = " + bol);

        /*Orden de prioridad al asginar varibles:
        1. (), ++, --, -
        2. *, / ,%
        3. +, -
        Tambien se hace de izquierda a derecha, pero por legibilidad hay que añadirle parentesis a todo
        * */

    }
}
