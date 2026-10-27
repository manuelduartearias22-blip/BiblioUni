package com.bibliouni.servicio;
import com.bibliouni.modelo.Material;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
@Service
public class MaterialService {
 private final List<Material> catalogo = List.of(new Material(1L, "Introducción a Java", true), new Material(2L, "Ingeniería de Software", false));
 public List<Material> listar() { return catalogo; }
 public Optional<Material> buscarPorId(Long id) { return catalogo.stream().filter(m -> m.id().equals(id)).findFirst(); }
}
