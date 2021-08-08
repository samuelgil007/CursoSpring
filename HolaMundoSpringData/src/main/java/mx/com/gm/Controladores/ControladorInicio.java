package mx.com.gm.Controladores;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.Modelos.Tables.Persona;
import mx.com.gm.Servicios.PersonaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import java.util.List;

@Controller
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user){
        //Tambien se podrian sacar usuarios de algun token enviado en un header
        log.info("Hizo login el rol: " + user);
        return "index";
    }
}
