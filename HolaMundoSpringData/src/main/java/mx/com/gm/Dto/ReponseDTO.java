package mx.com.gm.Dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

//De la dependencia lombok, nos crea los geters, seters, contructores, y las demas cosas que tendria un pojo.
@Data
//Builder para poder crear instancias facilmente en otras clases
@Builder
public class ReponseDTO {

    private Date timestamp;
    private String peticion;
    private String detalle;
    private int status;

}
