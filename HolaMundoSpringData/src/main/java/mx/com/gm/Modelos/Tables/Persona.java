package mx.com.gm.Modelos.Tables;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//De la dependencia lombok, nos crea los geters, seters, contructores, y las demas cosas que tendria un pojo.
@Data
//Convertir la ce en una una entidad
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Persona")
public class Persona{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;
    private String nombre;
    private String apellido;
    private String telefono;
}
