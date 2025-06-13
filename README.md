Bootcamp DevOps – Grupo 11
Alumnos:	Cristian Valenzuela Vidal – cfvalenzuela.vidal@gmail.com
			Eduardo Ramirez - Eduardo Ramírez – eramirez4@uc.cl       
			
Ejercicio guiado M3-4: "Automatización del Proceso de Construcción"

Respuestas a las Preguntas Finales:

    1. ¿Qué aprendiste sobre el ciclo de vida de Maven?

Aprendí que Maven organiza el proceso de construcción en fases claramente definidas como validate, compile, test, package, install y deploy. Cada fase tiene un propósito específico y se ejecuta en un orden secuencial, lo que permite automatizar tareas repetitivas y garantizar consistencia en el proceso de construcción del software.

    2. ¿Cómo facilita Maven el trabajo en equipo y la reproducibilidad?

Maven estandariza la estructura de los proyectos y gestiona automáticamente las dependencias a través del archivo pom.xml. Esto asegura que todos los miembros del equipo trabajen con las mismas versiones de librerías y configuraciones, evitando conflictos y facilitando la reproducibilidad del proyecto en distintos entornos.

    3. ¿Cuál fue el mayor reto al trabajar con dependencias?

El mayor reto fue entender cómo resolver conflictos entre versiones de dependencias y cómo configurar correctamente los scopes (como compile, test, o provided) para asegurar que las librerías estén disponibles en las fases adecuadas del ciclo de vida.

    4. ¿Por qué crees que Maven es tan usado en entornos empresariales?	

Maven es ampliamente adoptado porque ofrece una solución robusta para la automatización de la construcción, gestión de dependencias y estandarización de proyectos. Su integración con herramientas de CI/CD (como GitHub Actions) y repositorios empresariales (como Nexus) lo hace ideal para entornos profesionales donde la escalabilidad y la consistencia son críticas.

    5. ¿Qué harías diferente si tuvieras que automatizar otro proyecto?	

Exploraría el uso de perfiles de Maven para manejar configuraciones específicas de entornos (dev, prod, etc.) desde el inicio. También investigaría más a fondo plugins avanzados para optimizar tareas como la generación de informes o el despliegue en la nube.
