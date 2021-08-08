package mx.com.gm.Dao;

import mx.com.gm.Modelos.Tables.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Decir que es un repository para instanciar facilmente en el servicio
@Repository
public interface PersonaDao extends CrudRepository<Persona,Integer> {

    @Override
    List<Persona> findAll();
    Persona findByIdPersona(int id);
}
