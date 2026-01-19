# Informe Final

## 1. Proceso de Implementación


Se partió de un proyecto Java básico con problemas de calidad: clases sin paquete, uso incorrecto de genéricos, listas paralelas, ausencia de pruebas, y sin aplicación de principios SOLID ni Clean Code. El equipo asignó roles y planificó tareas según el Plan de Acción.

### Integración y Corrección de SonarQube
- Se integró SonarQube al pipeline de GitHub Actions para análisis automático de calidad.
- Se generó y utilizó un token seguro para la autenticación.
- Se corrigió el archivo de workflow eliminando líneas inválidas y configurando correctamente la variable SONAR_TOKEN.
- El análisis de SonarQube ahora se ejecuta automáticamente en cada push o pull request, y los resultados pueden consultarse en la instancia SonarQube configurada.

### Refactorización
- Se crearon paquetes para cada dominio: inventory, orders, students, tasks.
- Se reemplazaron listas paralelas por clases de dominio (Product, CustomerOrder, Student, Task).
- Se parametrizaron todas las colecciones.
- Se eliminó System.out.println y se implementó logging.
- Se validaron índices en operaciones de eliminación.
- Se aplicaron principios SOLID y Clean Code.

### Configuración de Herramientas
- Se configuraron Checkstyle, PMD y JaCoCo en el pom.xml.
- Se creó un pipeline CI/CD en GitHub Actions para validar automáticamente el código y generar reportes.

### Pruebas Unitarias
- Se implementaron pruebas unitarias para las clases principales usando JUnit.
- Se logró una cobertura de código superior al 80% (ver reporte de JaCoCo).

## 2. Comparativa Antes y Después

| Aspecto                  | Estado Inicial         | Estado Final           |
|--------------------------|-----------------------|------------------------|
| Organización de código   | Deficiente            | Paquetes y clases de dominio |
| Tipado y seguridad       | Bajo                  | Colecciones tipadas    |
| Principios SOLID         | No aplicados          | Aplicados              |
| Logging                  | System.out.println    | Logger Java            |
| Pruebas                  | Inexistentes          | Unitarias con JUnit    |
| Cobertura de pruebas     | 0%                    | >80%                   |
| Estilo de código         | Inconsistente         | Validado con Checkstyle|
| Defectos estáticos       | No analizado          | Analizado con PMD      |
| CI/CD                    | No                    | GitHub Actions         |

## 3. Reflexión Individual sobre el Trabajo en Equipo

El trabajo colaborativo permitió distribuir responsabilidades y aprovechar las fortalezas de cada miembro. La comunicación constante y el uso de herramientas colaborativas (GitHub, chats, reuniones) facilitaron la integración y la mejora continua del proyecto. Cada integrante aportó en su rol y se documentaron las contribuciones mediante commits y registros de reuniones.

## 4. Evidencias
- URL del repositorio GitHub: [Colocar aquí la URL]
- Reportes generados por Checkstyle, PMD y JaCoCo (adjuntos en el repositorio y descargables desde GitHub Actions).
- Historial de commits y registros de reuniones disponibles en el repositorio.

