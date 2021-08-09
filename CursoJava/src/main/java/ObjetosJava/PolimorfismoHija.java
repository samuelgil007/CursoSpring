package ObjetosJava;

public class PolimorfismoHija extends PolimorfismoPadre{
        public String nombreHija;

        public PolimorfismoHija(String nombreHija){
            this.nombreHija = nombreHija;
        }
        @Override
        public String getNombre(){
            return super.getNombre() + " " + nombreHija;
        }

}
