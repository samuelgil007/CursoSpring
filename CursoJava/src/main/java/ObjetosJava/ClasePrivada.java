package ObjetosJava;

public class ClasePrivada {

    //Solo la clase puede acceder directamente a los atributos privados, desde afuera solo getter y setter
    private String usuario;
    private String contraseña;

    public ClasePrivada(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    //Se crea el to string para imprimir el objeto completo
    @Override
    public String toString() {
        return "ClasePrivada{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
