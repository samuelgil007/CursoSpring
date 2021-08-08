public class VariablesPrimitivas {
    public static void main(String args[]){
    //Numeros enteros:
    //byte, short, int , long. De menor a mayor en tamaño.

        /*Se puede escribir numeros en una base diferente, hexadecimal por ejemplo, mientras coloquemos
        la base en la que esta en el nombre*/
        int numeroOctal = 012;
        System.out.println(numeroOctal);
        /* Los tipos flotantes son los que tienen decimales. float y double. Estan en orden de cuantos
        guardan más decimales.
         */

        /* Se pueden guardar chars con '' o con el unicode
         */
        Character ch = 'a';
        System.out.println(ch);

        /* Condiciones true o false, comparaciones, preguntar existencia en algun lugar,etc... */

        //Poner D en el numerador para que de decimal
        System.out.println("ojo con las divisiones:" + 3D/2);
        double este = 3/2;
        System.out.println("este esta malo = " + este);

        //Tambien ayuda poner L para los longs
    }
}
