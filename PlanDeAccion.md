# Plan de Acción

## 1. Roles y Responsabilidades
- **Líder del equipo:** Gabriel Padilla. Coordina el trabajo y supervisa la integración.
- **Responsable de análisis de métricas:** [Nombre]. Define e interpreta métricas de calidad (cobertura, estilo, defectos).
- **Responsable de revisión manual:** [Nombre]. Aplica principios de Clean Code y SOLID.
- **Responsable de análisis estático:** [Nombre]. Configura y ejecuta Checkstyle, PMD, JaCoCo y GitHub Actions.

## 2. Problemas de Calidad Identificados
- Clases sin paquete declarado.
- Uso incorrecto de genéricos.
- Diseño deficiente (listas paralelas, baja cohesión).
- Uso de System.out.println en lógica de negocio.
- Ausencia de pruebas unitarias.
- No se aplican principios SOLID ni Clean Code.
- Estilo de código inconsistente.

## 3. Estrategias y Técnicas de Mejora
- Refactorizar el código para aplicar Clean Code y SOLID.
- Mover clases a paquetes con nombre.
- Parametrizar colecciones.
- Reemplazar listas paralelas por clases de dominio.
- Limitar cada clase a una única responsabilidad.
- Sustituir System.out.println por logger.
- Validar índices antes de acceder/eliminar elementos.
- Crear pruebas unitarias para cada clase.
- Ajustar el código a reglas de estilo.

## 4. Métricas para Evaluar la Calidad
- **Cobertura de código:** JaCoCo (objetivo: >80%).
- **Cumplimiento de estilo:** Checkstyle (0 violaciones críticas).
- **Defectos estáticos:** PMD (0 defectos críticos).
- **Ejecución automática:** Pipeline CI/CD en GitHub Actions.

## 5. Herramientas y Plugins
- **Checkstyle:** Estilo de código.
- **JaCoCo:** Cobertura de código.
- **PMD:** Defectos estáticos.
- **GitHub Actions:** Automatización CI/CD.

## 6. Plan de Trabajo
1. Refactorizar el código base.
2. Configurar y ejecutar herramientas de calidad.
3. Implementar pruebas unitarias.
4. Analizar reportes y ajustar el código.
5. Documentar el proceso y resultados.
6. Subir cambios y reportes al repositorio GitHub.

