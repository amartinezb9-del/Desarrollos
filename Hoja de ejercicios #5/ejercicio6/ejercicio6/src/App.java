import java.util.ArrayList;

public class App {
    public static double calcularPromedioMensual(ArrayList<Double> ventas) {
        if (ventas.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (double venta : ventas) {
            total += venta;
        }
        return total / ventas.size();
    }

    public static double calcularMaximo(ArrayList<Double> ventas) {
        if (ventas.isEmpty()) {
            return 0.0;
        }

        double maximo = ventas.get(0);
        for (double venta : ventas) {
            if (venta > maximo) {
                maximo = venta;
            }
        }
        return maximo;
    }

    public static double calcularMinimo(ArrayList<Double> ventas) {
        if (ventas.isEmpty()) {
            return 0.0;
        }

        double minimo = ventas.get(0);
        for (double venta : ventas) {
            if (venta < minimo) {
                minimo = venta;
            }
        }
        return minimo;
    }

    public static int contarDiasSobreElPromedio(ArrayList<Double> ventas) {
        double promedio = calcularPromedioMensual(ventas);
        int cantidad = 0;

        for (double venta : ventas) {
            if (venta > promedio) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public static void main(String[] args) {
        ArrayList<Double> ventas = new ArrayList<>();
        double[] montos = {
            120.50, 95.00, 210.75, 180.00, 145.25, 300.00, 250.50,
            175.00, 98.50, 220.00, 190.25, 160.00, 275.75, 130.00,
            205.50, 185.00, 110.25, 240.00, 315.50, 150.00, 170.75,
            225.00, 280.25, 135.00, 200.50, 155.75, 260.00, 105.00,
            195.25, 230.00
        };

        for (double monto : montos) {
            ventas.add(monto);
        }

        System.out.printf("Promedio mensual: %.2f%n", calcularPromedioMensual(ventas));
        System.out.printf("Venta maxima: %.2f%n", calcularMaximo(ventas));
        System.out.printf("Venta minima: %.2f%n", calcularMinimo(ventas));
        System.out.println("Dias sobre el promedio: " + contarDiasSobreElPromedio(ventas));
    }
}
