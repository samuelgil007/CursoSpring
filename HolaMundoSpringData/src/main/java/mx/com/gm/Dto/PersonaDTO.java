package mx.com.gm.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

//De la dependencia lombok, nos crea los geters, seters, contructores, y las demas cosas que tendria un pojo.
@Data
//Builder para poder crear instancias facilmente en otras clases
@Builder
//Decir que incluya json
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonaDTO {

    private int idPersona;

    //Validaciones para el DTO, algunas otras validaciones: min, max, pattern, required.
    //Not null para ver si es nulo y notempty para verificar cadenas vacias
    @NotNull(message = "EL nombre no puede ser null")
    @NotEmpty(message = "EL nombre no puede ser vacio")
    private String nombre;

    @NotNull(message = "El apellido no puede ser null")
    @NotEmpty(message = "EL apellido no puede ser vacio")
    private String apellido;

    @NotNull(message = "El telefono no puede ser null")
    @NotEmpty(message = "EL telefono no puede ser vacio")
    private String telefono;
}
