import ObjetosJava.ClasePrivada;

public class Encapsulamiento {
    public static void main(String args[]){
        //Poner los objetos en estado oculto, en privado.
        ClasePrivada ejemplo = new ClasePrivada("samuel","1234");
        System.out.println("ejemplo.getContraseña() = " + ejemplo.getContraseña());
        System.out.println(ejemplo.toString());
    }
}
