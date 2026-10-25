//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Estudiante alumno = new Estudiante("LEG-2041", "Sofía Ramírez");

    System.out.println("=== Sin notas ===");
    System.out.println("Promedio: " + alumno.calcularPromedio());

    System.out.println("\n=== Notas válidas ===");
    alumno.agregarNota(8.0);
    alumno.agregarNota(6.5);
    alumno.agregarNota(10.0);   // límite superior
    alumno.agregarNota(0.0);    // límite inferior

    System.out.println("\n=== Notas inválidas ===");
    alumno.agregarNota(11.0);   // supera el máximo
    alumno.agregarNota(-3.0);   // negativa
    alumno.agregarNota(Double.NaN); // no es un número

    System.out.println("\n=== Resultado ===");
    System.out.println("Cantidad de notas: " + alumno.getCantidadNotas());
    System.out.println("Notas: " + alumno.getNotas());
    System.out.printf("Promedio final: %.2f%n", alumno.calcularPromedio());

    System.out.println("\n=== Intento de modificar las notas desde afuera ===");
    try {
        alumno.getNotas().add(10.0);
    } catch (UnsupportedOperationException e) {
        System.out.println("Bloqueado: la lista devuelta es de solo lectura.");
    }
    System.out.println("Cantidad de notas sigue siendo: " + alumno.getCantidadNotas());

    System.out.println("\n=== Constructor con datos inválidos ===");
    try {
        new Estudiante("", "Pedro");
    } catch (IllegalArgumentException e) {
        System.out.println("No se pudo crear el estudiante: " + e.getMessage());
    }
}

