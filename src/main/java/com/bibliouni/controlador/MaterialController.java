package com.bibliouni.controlador;
import com.bibliouni.modelo.Material;
import com.bibliouni.servicio.MaterialService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/materiales")
public class MaterialController {
 private final MaterialService servicio;
 public MaterialController(MaterialService servicio) { this.servicio = servicio; }
 @GetMapping public List<Material> listar() { return servicio.listar(); }
 @GetMapping("/{id}") public ResponseEntity<Material> buscar(@PathVariable Long id) {
  return servicio.buscarPorId(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
 }
}
