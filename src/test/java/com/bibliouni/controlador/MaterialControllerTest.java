package com.bibliouni.controlador;
import static org.junit.jupiter.api.Assertions.*;
import com.bibliouni.servicio.MaterialService;
import org.junit.jupiter.api.Test;
class MaterialControllerTest {
 @Test void controladorPuedeListar() { assertEquals(2, new MaterialController(new MaterialService()).listar().size()); }
 @Test void controladorDevuelve404SiNoExiste() { assertEquals(404, new MaterialController(new MaterialService()).buscar(999L).getStatusCode().value()); }
}
