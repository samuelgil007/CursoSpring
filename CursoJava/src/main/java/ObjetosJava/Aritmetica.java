package ObjetosJava;

public class Aritmetica {

    //Esto es declarar un objeto-
    public int numero1, numero2;

    //Constructor, instanciar objetos desde la cracion de una clase.
    public Aritmetica(){ }

    public Aritmetica(int numero1,int numero2){
        //This se refiere a señalar la actual clase(objeto), asi de diferencian los atributos de otros.
        //Se puede usar solo this, ya que es el objeto actual.
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Estructura de un metodo, publico/privado variableQueDevuelve nombre parametros
    public int suma(int numero1, int numero2){
        //Estas variables solo tienen el alcance de este metodo
        return numero1 + numero2;
    }
    public int sumaConLosAtributos(){
        return this.numero1 + this.numero2;
    }
}

