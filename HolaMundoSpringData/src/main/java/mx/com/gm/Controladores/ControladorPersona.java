package mx.com.gm.Controladores;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.Dto.PersonaDTO;
import mx.com.gm.Dto.ReponseDTO;
import mx.com.gm.Modelos.Tables.Persona;
import mx.com.gm.Servicios.PersonaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//Para que la reconozca como clase restController
@RestController
//De la libreria lombok, para tener acceso a log(), un console log
@Slf4j
public class ControladorPersona {

    @Autowired
    private PersonaServices personaServices;

    @GetMapping("/persona")
    public ResponseEntity<List<Persona>> retornarPersonas(Model model){
        return new ResponseEntity<>(personaServices.retornarPersonas(), HttpStatus.OK);
    }

    @GetMapping("/persona/{id}")
    public ResponseEntity<Persona> retornarPersona(@PathVariable int id){
        return new ResponseEntity<>(personaServices.retornarPersona(id), HttpStatus.OK);
    }

    //Valid: Validar si existen errores en el json
    @PutMapping("/persona/{id}")
    public ResponseEntity<PersonaDTO> editarPersona(@Valid @RequestBody PersonaDTO persona, @PathVariable int id){
        return new ResponseEntity<>(personaServices.editarPersona(persona), HttpStatus.OK);
    }

    //Valid: Validar si existen errores en el json
    @PostMapping("/persona")
    public ResponseEntity<PersonaDTO> guardarPersona(@Valid @RequestBody PersonaDTO persona){
        return new ResponseEntity<>(personaServices.guardarPersona(persona), HttpStatus.OK);
    }

    @DeleteMapping("/persona/{id}")
    public ResponseEntity<ReponseDTO> eliminarPersona(@PathVariable int id){
        ReponseDTO response = personaServices.eliminarPersona(id);
        return new ResponseEntity<>(response, HttpStatus.resolve(response.getStatus()));
    }
}
