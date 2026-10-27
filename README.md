# BiblioUni — proyecto de referencia para estrategia de pruebas

**Advertencia académica:** este proyecto mínimo fue creado como **referencia**, porque no se proporcionó el código original del Módulo 2. No debe describirse como la implementación original de BiblioUni. Las funcionalidades de préstamo, persistencia y recomendaciones del gancho innovador **no están implementadas** aquí; están documentadas como escenarios propuestos.

## Contenido
- `docs/pruebas/estrategia.md`: estrategia y alcance
- `docs/pruebas/calidad_iso25010.md`: evaluación de calidad
- `docs/pruebas/escenarios.md`: escenarios propuestos
- `docs/pruebas/mapa_conceptual.png`: mapa conceptual
- `src/main`: aplicación mínima Spring Boot, servicio y API de materiales en memoria
- `src/test`: pruebas iniciales de contexto, servicio y controlador

## Ejecutar
Requiere Java 21 y Maven 3.6.3+ (o usar el wrapper de un proyecto generado por Spring Initializr). Desde la raíz: `mvn test`.

**Evidencia:** guardar una captura real de la salida de `mvn test` al ejecutar *este* proyecto. La captura anterior de `DemoApplicationTests` corresponde a otro proyecto y no valida este código.

## GitHub
Subir estos archivos a `feature/estrategia-pruebas`, confirmar que el PR apunta a `develop`. Si `develop` ya contiene algunos archivos, GitHub mostrará solo los cambios posteriores.


## Estado de cumplimiento y evidencia
Este repositorio es una **implementación académica de referencia**, no el proyecto original del Módulo 2. Están implementados catálogo de materiales, servicio y controlador REST; los préstamos, persistencia y recomendaciones son funcionalidades planificadas. Los escenarios diseñados para estas últimas no están ejecutados.

### Ejecución local
Requiere Java 21 y Maven 3.9+ (o un wrapper de Maven disponible). Desde la raíz: `mvn test`. Conservar una captura que muestre el resultado de las pruebas de **este proyecto**, no de otro proyecto `demo`. Los reportes de Surefire se generan en `target/surefire-reports` después de ejecutar Maven. No se adjunta evidencia de ejecución no realizada.
