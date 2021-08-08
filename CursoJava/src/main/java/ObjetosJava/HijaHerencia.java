package ObjetosJava;

public class HijaHerencia extends Herencia {

    private String atributoHija;

    public HijaHerencia(String nombre, String atributoHija, int edad) {
        super(nombre, edad);
        this.atributoHija = atributoHija;
    }
    private HijaHerencia(){
        //Invoca el constructor vacio super
        super();
    }

    public HijaHerencia(String atributoHija) {
        //Invoca el constructor vacio
        this();
        this.atributoHija = atributoHija;
    }
    //Override: Sobrescribir un metodo de un objeto superior.

    @Override
    public String toString() {
        return "HijaHerencia{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", id=" + id +
                ", atributoHija='" + atributoHija + '\'' +
                '}';
    }


    //Si se escribe super, se hace referencia al padre.
}
