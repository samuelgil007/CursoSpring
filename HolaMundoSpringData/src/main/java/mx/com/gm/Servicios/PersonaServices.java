package mx.com.gm.Servicios;

import mx.com.gm.Dao.PersonaDao;
import mx.com.gm.Dto.PersonaDTO;
import mx.com.gm.Dto.ReponseDTO;
import mx.com.gm.Modelos.Tables.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

//Decir que es un servicio para instanciar facilmente en el controller
@Service
public class PersonaServices {
    @Autowired
    private PersonaDao personaDao;

    /*Las transacciones realizan un  rollback en caso de error,
     para que los datos erroneos no se vayan a la base de datos.
     ReadOnly es solo para los metodos que no realizan cambios en la DB*/
    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<Persona> retornarPersonas(){
        return personaDao.findAll();
    }

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public Persona retornarPersona(int id){
        return personaDao.findByIdPersona(id);
    }

    @org.springframework.transaction.annotation.Transactional
    public PersonaDTO guardarPersona(PersonaDTO persona){
        Persona person = personaDao.save(Persona.builder()
                .idPersona(persona.getIdPersona())
                .nombre(persona.getNombre())
                .apellido(persona.getApellido())
                .telefono(persona.getTelefono())
                .build());

        return PersonaDTO.builder()
                .idPersona(person.getIdPersona())
                .nombre(person.getNombre())
                .apellido(person.getApellido())
                .telefono(person.getTelefono())
                .build();
    }

    @org.springframework.transaction.annotation.Transactional
    public PersonaDTO editarPersona(PersonaDTO persona){
        Persona person = personaDao.save(Persona.builder()
        .idPersona(persona.getIdPersona())
        .nombre(persona.getNombre())
        .apellido(persona.getApellido())
        .telefono(persona.getTelefono())
        .build());

        return PersonaDTO.builder()
                .idPersona(person.getIdPersona())
                .nombre(person.getNombre())
                .apellido(person.getApellido())
                .telefono(person.getTelefono())
                .build();
    }

    @org.springframework.transaction.annotation.Transactional
    public ReponseDTO eliminarPersona(int id){
        personaDao.deleteById(id);

        return ReponseDTO.builder()
                .status(200)
                .peticion("Eliminar persona")
                .detalle("Se eliminó la persona con exito")
                .timestamp(new Date())
                .build();
    }
}
