# Sistema de Gestión de Notas de Estudiantes

## Descripción

Este proyecto consiste en un sistema de gestión de estudiantes desarrollado en Java. Permite registrar notas, consultar la cantidad de calificaciones, obtener el promedio y validar los datos ingresados.

El sistema utiliza encapsulamiento para proteger la información del estudiante y garantizar que las notas se registren únicamente mediante operaciones controladas.

## Funcionamiento

El programa crea un estudiante llamado Sofía Ramírez, con el legajo `LEG-2041`, y realiza diferentes pruebas:

* Consulta el promedio cuando todavía no hay notas registradas.
* Registra notas válidas dentro del rango de 0 a 10.
* Rechaza notas negativas, superiores a 10 o que no sean números válidos (`NaN`).
* Muestra la cantidad de notas registradas y la lista de calificaciones.
* Calcula el promedio final y lo muestra con dos decimales.
* Intenta modificar la lista de notas desde afuera y comprueba que no se permite.
* Intenta crear un estudiante con un legajo inválido y captura la excepción correspondiente.

Las notas aceptadas se almacenan en una lista dinámica de tipo `List<Double>`.

## Clases principales

### `Estudiante`

Representa a un estudiante y contiene los siguientes atributos privados:

* `NOTA_MINIMA`: constante que establece la nota mínima permitida en 0.
* `NOTA_MAXIMA`: constante que establece la nota máxima permitida en 10.
* `legajo`: identificador del estudiante, que no puede modificarse después de la creación.
* `nombre`: nombre del estudiante.
* `notas`: lista de calificaciones registradas.

**Métodos principales:**

* `getLegajo()`: devuelve el legajo del estudiante.
* `getNombre()`: devuelve su nombre.
* `getNotas()`: devuelve una copia de solo lectura de las notas.
* `getCantidadNotas()`: devuelve la cantidad de calificaciones registradas.
* `agregarNota()`: valida y registra una nota si se encuentra dentro del rango permitido.
* `calcularPromedio()`: calcula el promedio de las notas registradas.

El constructor verifica que el legajo y el nombre no estén vacíos. Si alguno de estos datos es inválido, lanza una excepción `IllegalArgumentException`.

### `Main`

Contiene el método principal del programa. Crea un estudiante y ejecuta pruebas de registro de notas, cálculo del promedio, validación de datos y protección de la lista frente a modificaciones externas.

## Conceptos de programación utilizados

* **Encapsulamiento:** los atributos son privados para impedir el acceso y la modificación directa desde otras clases.
* **Validación de datos:** se verifica que las notas estén entre 0 y 10 y que los datos iniciales sean válidos.
* **Constantes con `static final`:** definen los límites de las calificaciones.
* **Atributos inmutables:** el legajo se declara `final` para impedir su reasignación.
* **Colecciones:** se utiliza `ArrayList` para almacenar una cantidad variable de notas.
* **Listas de solo lectura:** `Collections.unmodifiableList()` impide modificar la copia devuelta por `getNotas()`.
* **Ciclos:** se utiliza un bucle `for-each` para recorrer las calificaciones y calcular el promedio.
* **Excepciones:** se utilizan `IllegalArgumentException` y `UnsupportedOperationException` para manejar situaciones inválidas.
* **Métodos de instancia:** permiten registrar notas, consultar datos y calcular resultados.

## Ejecución

<img width="666" height="725" alt="image" src="https://github.com/user-attachments/assets/566cb68f-2b1a-44c6-820a-5836aa5b4a79" />

## Objetivo del ejercicio

Aplicar los principios de encapsulamiento, validación de datos y manejo de colecciones en Java, desarrollando una clase que permita administrar las calificaciones de un estudiante de manera controlada y segura.
