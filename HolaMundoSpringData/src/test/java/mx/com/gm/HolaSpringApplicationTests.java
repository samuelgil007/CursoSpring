package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.Controladores.ControladorPersona;
import mx.com.gm.Dto.PersonaDTO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

//@SpringBootTest
@SpringBootTest(properties = {"spring.profiles.active=dev"})
class HolaSpringApplicationTests {

	@Autowired
	private ControladorPersona controladorPersona;

	@Test
	void contextLoads() {
	}
	@Test
	@Transactional(readOnly = true)
	void probarControlador(){
		System.out.println("Retorna información:" + controladorPersona.retornarPersona(3));
	}
	@Test
	@Transactional
	@Rollback
	//@Commit inidica que se acepte la transaccion en la db.
	void probarControladorGuardar(){
		System.out.println("Guarda información:" + controladorPersona.guardarPersona(PersonaDTO.builder()
		.nombre("Con transaccinal")
		.apellido("ss")
		.telefono("123")
		.build()));
	}

	@Test
	@Transactional
	@Rollback
	void probarControladorBorrar(){
			System.out.println("Borra información:" + controladorPersona.eliminarPersona(2).getStatusCode());
	}

}
