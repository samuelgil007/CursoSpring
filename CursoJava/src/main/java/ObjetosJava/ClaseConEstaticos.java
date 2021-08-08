package ObjetosJava;

public class ClaseConEstaticos {

    private String usuario;
    private int id;
    public static int contadorDeClases;

    public ClaseConEstaticos(){
        this.id = contadorDeClases++;
    }
    public ClaseConEstaticos(String usuario) {
        this.usuario = usuario;
        this.id = contadorDeClases++;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "ClaseConEstaticos{" +
                "usuario='" + usuario + '\'' +
                ", id=" + id +
                '}';
    }
}
