# Evaluación de calidad ISO/IEC 25010 — BiblioUni

Se utiliza el modelo de **ocho características solicitado por la actividad** (ISO/IEC 25010:2011). La edición 2023 reorganizó el modelo; esta tabla sigue expresamente la versión de ocho características indicada por el docente.

| Característica | Relevancia | Justificación | Indicador o medición propuesta |
|---|---|---|---|
| Adecuación funcional | Alta | Las operaciones bibliotecarias deben cumplir reglas de negocio | % de escenarios funcionales aprobados |
| Eficiencia de desempeño | Media | Las consultas deben responder oportunamente en uso académico | Latencia de endpoints en entorno de pruebas |
| Compatibilidad | Media | La API debe intercambiar datos correctamente con clientes | % de contratos JSON e integraciones válidos |
| Usabilidad | Media | Los mensajes y flujos deben ser comprensibles | Tasa de tareas completadas en evaluación manual, si existe UI |
| Fiabilidad | Alta | No deben generarse préstamos inconsistentes | % de transacciones consistentes; errores reproducibles |
| Seguridad | Alta | Deben protegerse datos y operaciones sensibles | % de accesos no autorizados rechazados, si hay autenticación |
| Mantenibilidad | Alta | El proyecto continuará en unidades posteriores | Cobertura de ramas críticas y facilidad para aislar pruebas |
| Portabilidad | Baja | El despliegue se evalúa en un entorno académico definido | Ejecución exitosa en otro entorno Java compatible |

## Tres características más críticas

1. **Adecuación funcional:** pruebas unitarias, funcionales y de API para consulta, préstamo, devolución y reglas implementadas.
2. **Fiabilidad:** pruebas de integridad, transacciones, material no disponible y errores de persistencia.
3. **Seguridad:** comprobaciones de acceso y validación de entradas cuando el sistema incluya autenticación/autorización; no se contempla pentesting avanzado.

**Nota:** Mantenibilidad también es alta por su importancia para las unidades 2 y 3, pero se priorizan las tres anteriores por el impacto directo en usuarios y datos.
