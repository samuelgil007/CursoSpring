public class PasoPorValor {
    public static void main(String args[]){
        int x = 1;
        cambiarValor(x);
        System.out.println("x = " + x);
        //Solo pasamos el valor de x al metodo, pero no se cambia el valor de x. Porque es un primitivo.
    }

    private static void cambiarValor(int numero) {
        numero = 2;
    }
}
