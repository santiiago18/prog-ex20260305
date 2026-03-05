Examen de Programación
Gestión de Alumnos de Formación Profesional
Objetivo
Diseñar e implementar un pequeño sistema en Java para gestionar alumnos matriculados en distintos títulos de Formación Profesional.
El ejercicio permitirá evaluar los siguientes aspectos:
Escenario
Un centro de Formación Profesional desea desarrollar un pequeño sistema para gestionar los alumnos matriculados en distintos títulos de FP.
Cada alumno estará identificado mediante un id único y tendrá asociada la siguiente información:
El sistema permitirá almacenar un máximo de 20 alumnos.
Para gestionar esta información se utilizará un array de objetos de tamaño fijo.
Clases que debes implementar
Clase Alumno
Debe representar a un alumno del centro.
Atributos privados
Debe incluir
Clase CentroFP
Esta clase gestionará el conjunto de alumnos.
Atributos
El array debe inicializarse en el constructor.
Métodos que debes implementar
Diseño de clases.
Encapsulación.
Uso de arrays unidimensionales de tamaño fijo.
Búsqueda de objetos dentro de un array.
Recorridos de arrays.
Documentación mediante Javadoc.
id
nombre
tituloFP (por ejemplo: DAM, DAW, ASIR…)
edad
int id
String nombre
String tituloFP
int edad
Constructor completo.
Métodos getters.
Método toString().
Documentación Javadoc en:
la clase
el constructor
los métodos públicos.
private Alumno[] alumnos;
private final int MAX_ALUMNOS;
Examen de Programación
1 / 2
La clase CentroFP debe incluir los siguientes métodos:
Comportamiento esperado
buscarAlumno(int id)
Busca un alumno con el identificador recibido.
Debe devolver:
buscarPrimerHuecoLibre()
Busca la primera posición libre dentro del array.
Debe devolver:
Este método debe ser privado.
registrarAlumno(Alumno alumno)
Añade un alumno al sistema.
Condiciones:
Debe devolver:
mostrarAlumnos()
Recorre el array y muestra por pantalla todos los alumnos almacenados.
Solo debe mostrar posiciones ocupadas.
contarAlumnos()
Debe devolver el número real de alumnos almacenados en el sistema.
Clase Main
La clase Main debe utilizar el sistema.
Debe:
public Alumno buscarAlumno(int id)
private int buscarPrimerHuecoLibre()
public boolean registrarAlumno(Alumno alumno)
public void mostrarAlumnos()
public int contarAlumnos()
el objeto Alumno si lo encuentra
null si no existe
el índice libre si lo encuentra
-1 si el array está completo
No debe permitir dos alumnos con el mismo id.
Solo se añadirá si existe hueco disponible.
true si el alumno se ha registrado correctamente
false si no se ha podido registrar
1. Crear un objeto CentroFP .
2. Registrar al menos 3 alumnos.
3. Mostrar los alumnos almacenados.
4. Mostrar el número total de alumnos.
5. Realizar al menos una búsqueda existente y una búsqueda inexistente.
