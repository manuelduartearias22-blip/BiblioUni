# Estrategia de pruebas — BiblioUni

## 1. Objetivo y alcance
Definir una estrategia basada en riesgos para verificar el comportamiento de BiblioUni, sistema de gestión bibliotecaria. Esta propuesta deberá ajustarse a los componentes y reglas efectivamente implementados en el repositorio del Módulo 2.

## 2. ¿Qué se va a probar?
- **Modelo:** entidades Material, Usuario y Prestamo, restricciones y relaciones, si existen.
- **Servicios:** reglas de disponibilidad, creación/devolución de préstamos, validación de usuarios y materiales.
- **Controladores REST:** códigos HTTP, cuerpos JSON, validación de solicitudes y tratamiento de errores.
- **Persistencia:** repositorios, integridad referencial, transacciones y consistencia de datos.

## 3. Tipos de pruebas y justificación
| Tipo | Aplicación | Motivo |
|---|---|---|
| Unitarias | Reglas de servicios con dependencias simuladas | Aislar defectos rápidamente |
| Integración | Servicios, repositorios y controladores | Comprobar colaboración y persistencia |
| Funcionales | Préstamos, consultas, devoluciones | Verificar requisitos de negocio |
| API REST | Solicitudes y respuestas HTTP | Confirmar contratos, estados y validaciones |
| No funcionales básicas | Errores, tiempos de respuesta orientativos y accesibilidad básica si hay interfaz | Evaluar atributos de calidad relevantes |

## 4. Niveles de prueba
1. **Componente (unitarias):** métodos de servicios y validadores.
2. **Integración:** controlador–servicio–repositorio y base de datos de pruebas.
3. **Sistema:** flujo completo de consulta, préstamo y devolución.
4. **Aceptación:** validación manual de escenarios principales contra requisitos acordados.

## 5. Técnicas y criterios
Se utilizará caja negra (particiones de equivalencia, valores límite, transiciones de estado) y caja blanca (cobertura de ramas críticas). Se priorizarán casos con mayor impacto en integridad de préstamos. Una prueba pasa si el resultado real coincide con el esperado y no altera datos de manera indebida.

## 6. Exclusiones justificadas
No se realizarán pruebas de carga masiva, penetración avanzada, resiliencia distribuida ni compatibilidad exhaustiva entre navegadores, por limitaciones de tiempo, infraestructura y alcance académico. Esto no excluye controles básicos de errores y acceso cuando existan.

## 7. Gancho innovador
**Pendiente de confirmar con el equipo:** identificar la funcionalidad innovadora real del Módulo 2. Como plantilla, si consiste en recomendaciones inteligentes de materiales, se probarán: (a) recomendaciones coherentes con criterios definidos; (b) respuesta controlada cuando no hay historial o resultados; (c) que no se recomienden materiales no disponibles cuando la regla así lo exija. Si el gancho es otro, sustituir estos ejemplos por sus reglas reales.

## 8. Ambiente, datos y ejecución
Java, Maven, Spring Boot y JUnit 5 con `spring-boot-starter-test`. Usar datos ficticios, base de pruebas separada y mocks para aislar servicios. Ejecutar `mvn test` desde la raíz y conservar captura del resumen de ejecución. Automatizar progresivamente los escenarios priorizados en Unidades 2 y 3.

## 9. Riesgos y criterios de salida
Riesgos principales: préstamo duplicado, inconsistencia de disponibilidad, pérdida de integridad y manejo incorrecto de errores. Para cerrar esta unidad: documentos versionados, escenarios priorizados, prueba inicial ejecutada sin fallos y evidencia disponible. Las pruebas formales restantes se implementarán en las siguientes unidades.
