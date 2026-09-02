import java.util.*;

public class App {
    static class Empleado {
        String Nombre;
        double Salario;
        Empleado(String Nombre, double Salario) {
            this.Nombre = Nombre;
            this.Salario = Salario;
        }
    }

    public static void main(String[] args) {
        List<Empleado> empleados = Arrays.asList(
            new Empleado("Ana", 1200),
            new Empleado("Luis", 1800),
            new Empleado("Marta", 1500)
        );

        double promedio = empleados.stream()
            .mapToDouble(e -> e.Salario)
            .average()
            .orElse(0);

        System.out.println("Promedio: " + promedio);
    }
}
