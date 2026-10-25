import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Estudiante {

    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;

    private final String legajo; // identidad del alumno: no cambia
    private String nombre;
    private List<Double> notas;

    public Estudiante(String legajo, String nombre) {

        if (legajo == null || legajo.trim().isEmpty()) {
            throw new IllegalArgumentException("El legajo no puede estar vacío.");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }

        this.legajo = legajo;
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }



    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    // Devuelve una copia de solo lectura: el exterior no puede modificar la lista interna

    public List<Double> getNotas() {
        return Collections.unmodifiableList(new ArrayList<>(notas));
    }

    public int getCantidadNotas() {
        return notas.size();
    }


    public boolean agregarNota(double nota) {

        if (Double.isNaN(nota) || nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {
            System.out.println("Nota rechazada: " + nota + " está fuera del rango válido ("
                    + NOTA_MINIMA + " a " + NOTA_MAXIMA + ").");
            return false;
        }

        notas.add(nota);
        System.out.println("Nota " + nota + " registrada para " + nombre + ".");
        return true;
    }

    public double calcularPromedio() {

        if (notas.isEmpty()) {
            System.out.println("Aviso: " + nombre + " todavía no tiene notas, no hay promedio.");
            return 0;
        }

        double suma = 0;
        for (double n : notas) {
            suma += n;
        }

        return suma / notas.size();
    }
}