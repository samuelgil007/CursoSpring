package ObjetosJava;

public class Herencia {
    public String nombre;
    public int edad;
    public int id;
    public static int contador;

    public Herencia(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }
    public Herencia(){
        this.id = contador++;
    }

    @Override
    public String toString() {
        return "Herencia{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", id=" + id +
                '}';
    }
}

