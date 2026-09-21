import java.util.ArrayList;

public class App {
    public static ArrayList<Empleado> empleadosPorDepartamentoYSalario(
            ArrayList<Empleado> empleados, String departamento) {
        ArrayList<Empleado> resultado = new ArrayList<>();

        for (Empleado empleado : empleados) {
            if (empleado.getDepartamento().equals(departamento)
                    && empleado.getSalario() > 5000) {
                resultado.add(empleado);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Ana", "Ventas", 6500));
        empleados.add(new Empleado("Luis", "Ventas", 5000));
        empleados.add(new Empleado("Marta", "Recursos Humanos", 7000));

        ArrayList<Empleado> resultado = empleadosPorDepartamentoYSalario(empleados, "Ventas");
        System.out.println(resultado);
    }

    public static class Empleado {
        private final String nombre;
        private final String departamento;
        private final double salario;

        public Empleado(String nombre, String departamento, double salario) {
            this.nombre = nombre;
            this.departamento = departamento;
            this.salario = salario;
        }

        public String getDepartamento() {
            return departamento;
        }

        public double getSalario() {
            return salario;
        }

        @Override
        public String toString() {
            return nombre + " - " + departamento + " - Q" + salario;
        }
    }
}
