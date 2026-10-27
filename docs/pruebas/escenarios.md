# Escenarios narrativos de prueba — BiblioUni

Estos escenarios distinguen funciones **implementadas** (consulta de materiales) de funcionalidades **planificadas** (préstamos, usuarios, persistencia y gancho de recomendaciones). No se afirma que los escenarios futuros ya se hayan ejecutado.

| ID | Componente bajo prueba | Escenario narrativo | Tipo | Prioridad |
|---|---|---|---|---|
| EP-001 | MaterialService | Verificar que se consulte correctamente un material existente por identificador. | Unitaria | Alta |
| EP-002 | MaterialController | Verificar que la API devuelva una respuesta correcta al consultar materiales disponibles. | API | Alta |
| EP-003 | PrestamoService | Verificar que un usuario válido pueda solicitar un material disponible. | Unitaria | Alta |
| EP-004 | PrestamoService | Verificar que se rechace un préstamo de material no disponible (camino triste). | Unitaria | Alta |
| EP-005 | PrestamoController | Verificar que una solicitud con usuario inexistente produzca un error controlado (camino triste). | API | Alta |
| EP-006 | MaterialController | Verificar que datos inválidos en una solicitud produzcan respuesta de validación sin guardar cambios (camino triste). | API | Alta |
| EP-007 | PrestamoService | Verificar que la devolución actualice correctamente el estado del préstamo y del material. | Unitaria | Alta |
| EP-008 | PrestamoRepository | Verificar que un préstamo se guarde y recupere manteniendo las relaciones esperadas. | Integración | Alta |
| EP-009 | MaterialController | Verificar que la consulta de un identificador inexistente genere una respuesta de error coherente. | API | Media |
| EP-010 | PrestamoController | Verificar el flujo completo de creación, consulta y devolución de un préstamo. | Integración | Alta |
| EP-011 | RecomendacionService (hipotético) | Verificar que el gancho innovador genere recomendaciones coherentes con las reglas definidas. | Unitaria | Alta |
| EP-012 | RecomendacionController (hipotético) | Verificar que el gancho responda adecuadamente cuando no existen recomendaciones disponibles (camino triste). | API | Media |

## Criterios de diseño para la Unidad 2
Cada escenario se transformará en casos con precondiciones, datos, pasos, resultado esperado y evidencia. Se usarán datos de prueba ficticios y se confirmarán los nombres reales de clases y rutas REST.


## Datos, precondiciones y criterios de aceptación (muestra de diseño)
| Escenario | Precondición / dato | Acción | Resultado esperado medible | Estado |
|---|---|---|---|---|
| EP-001 | Existe material ID=1 | Buscar ID 1 | Resultado presente e ID igual a 1 | Automatizado |
| EP-002 | Catálogo de referencia con 2 materiales | Listar materiales | Respuesta con exactamente 2 elementos | Automatizado (controlador) |
| EP-009 | No existe material ID=999 | Consultar `/api/materiales/999` | HTTP 404; ningún material retornado | Automatizado (controlador) |
| EP-004 | Material ID=2 no disponible | Solicitar préstamo | Solicitud rechazada sin crear préstamo | Diseñado, no ejecutable aún |
| EP-006 | Identificador o dato inválido | Enviar solicitud inválida | HTTP 4xx sin modificación persistente | Diseñado, no ejecutable aún |
| EP-011 | Gancho implementado; catálogo con coincidencias | Pedir recomendaciones | Recomendaciones cumplen reglas definidas y no duplican ID | Diseñado, no ejecutable aún |
| EP-012 | Gancho implementado; catálogo sin coincidencias | Pedir recomendaciones | Lista vacía o mensaje controlado; sin error 500 | Diseñado, no ejecutable aún |

**Técnicas:** particiones de equivalencia (IDs existentes/inexistentes), valores límite (IDs inválidos, cantidad máxima de préstamos cuando exista), transiciones de estado (disponible/prestado/devuelto), y pruebas negativas. Los umbrales de aceptación de rendimiento y seguridad se definirán al contar con el entorno completo.
