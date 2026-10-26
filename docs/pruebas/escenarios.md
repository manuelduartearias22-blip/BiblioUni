# Escenarios narrativos de prueba — BiblioUni

Estos escenarios son una **propuesta inicial**: confirmar nombres de clases, endpoints y reglas del proyecto real antes de automatizarlos. Los escenarios EP-011 y EP-012 suponen un gancho innovador de recomendaciones; reemplazarlos si la innovación implementada es distinta.

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
