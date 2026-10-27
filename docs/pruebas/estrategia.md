# Estrategia de pruebas — BiblioUni

## 1. Objetivo y alcance
Definir una estrategia basada en riesgos para verificar el comportamiento de BiblioUni, sistema de gestión bibliotecaria. Se utiliza una implementación de referencia creada para esta actividad; no se dispone del proyecto original del Módulo 2. Las funcionalidades de préstamos, usuarios y base de datos se incluyen como alcance futuro y NO como funciones implementadas.

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
**Gancho propuesto para la versión de referencia (aún no implementado): recomendaciones de materiales.** Se diseñarán pruebas para: (a) recomendaciones coherentes con criterios definidos; (b) respuesta controlada cuando no hay historial o resultados; (c) que no se recomienden materiales no disponibles cuando la regla así lo exija. Si el gancho es otro, sustituir estos ejemplos por sus reglas reales.

## 8. Ambiente, datos y ejecución
Java, Maven, Spring Boot y JUnit 5 con `spring-boot-starter-test`. Usar datos ficticios, base de pruebas separada y mocks para aislar servicios. Ejecutar `mvn test` desde la raíz y conservar captura del resumen de ejecución. Automatizar progresivamente los escenarios priorizados en Unidades 2 y 3.

## 9. Riesgos y criterios de salida
Riesgos principales: préstamo duplicado, inconsistencia de disponibilidad, pérdida de integridad y manejo incorrecto de errores. Para cerrar esta unidad: documentos versionados, escenarios priorizados, prueba inicial ejecutada sin fallos y evidencia disponible. Las pruebas formales restantes se implementarán en las siguientes unidades.


## 10. Inventario y responsables
| Componente | Estado actual | Responsable de verificación | Evidencia prevista |
|---|---|---|---|
| Material (modelo) | Implementado | Estudiante / QA | Prueba de datos y disponibilidad |
| MaterialService | Implementado | Estudiante / QA | MaterialServiceTest |
| MaterialController | Implementado | Estudiante / QA | MaterialControllerTest y prueba HTTP |
| Base de datos y repositorios | No implementados | Estudiante / QA | Pruebas de integración futuras |
| Préstamos y usuarios | No implementados | Estudiante / QA | Escenarios para Unidades 2 y 3 |
| Recomendaciones (gancho) | Diseñado, no implementado | Estudiante / QA | Escenarios EP-011 y EP-012 |

## 11. Matriz de riesgos y mitigaciones
| Riesgo | Probabilidad | Impacto | Prioridad | Control propuesto |
|---|---|---|---|---|
| Consultar material inexistente sin respuesta adecuada | Media | Alta | Alta | Prueba de HTTP 404 y búsqueda vacía |
| Devolver disponibilidad incorrecta | Media | Alta | Alta | Pruebas de catálogo disponible/no disponible |
| Préstamo duplicado (función futura) | Media | Alta | Alta | Reglas unitarias y pruebas de concurrencia al implementarlo |
| Recomendaciones irrelevantes (gancho futuro) | Media | Media | Media | Validar criterios y casos sin resultados |
| Exposición de datos (función futura) | Baja | Alta | Alta | Validación de entradas y autorización cuando exista |

## 12. Matriz de trazabilidad requisito–prueba
| Requisito / historia de usuario | Escenario | Prueba automatizada actual | Estado |
|---|---|---|---|
| RF-01 Consultar catálogo de materiales | EP-002 | MaterialControllerTest.controladorPuedeListar | Implementada |
| RF-02 Buscar material por identificador | EP-001, EP-009 | MaterialServiceTest.materialExistente / materialInexistente; MaterialControllerTest.controladorDevuelve404SiNoExiste | Implementada |
| RF-03 Gestionar préstamo y devolución | EP-003 a EP-008, EP-010 | No disponible | Pendiente de desarrollo |
| RI-01 Recomendar materiales | EP-011, EP-012 | No disponible | Pendiente de desarrollo |

## 13. Criterios de entrada, salida y cobertura por nivel
| Nivel | Entrada | Salida | Métrica objetivo (propuesta) |
|---|---|---|---|
| Unidad | Código compila; casos y datos definidos | 100 % de pruebas críticas ejecutadas sin fallos | >= 80 % de ramas críticas al instrumentar JaCoCo |
| Integración | Componentes conectados y datos ficticios | 0 fallos críticos en contratos y persistencia | >= 90 % de rutas de integración priorizadas |
| Sistema | Flujos implementados y ambiente aislado | 100 % de flujos críticos aprobados | >= 90 % de escenarios de sistema ejecutados |
| Aceptación | Requisitos y criterios acordados | Validación del docente/usuario y defectos críticos resueltos | 100 % de criterios de aceptación críticos |

Los umbrales son **metas de planificación**, no resultados medidos. En la versión actual no existe persistencia ni implementación de préstamos o recomendaciones; por tanto, no se atribuye cobertura real a esos componentes.

## 14. Seguimiento y cierre
Registrar por ejecución: fecha, comando, versión, pruebas ejecutadas, aprobadas/fallidas, evidencia y defectos. Si surge un defecto, asignar ID, severidad, pasos de reproducción, responsable, corrección y repetición de la prueba. Cerrar con resumen de cobertura y lecciones aprendidas, sin confundir resultados de un proyecto demo con la ejecución de BiblioUni.
