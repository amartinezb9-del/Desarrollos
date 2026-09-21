import java.util.ArrayList;

public class App {
    public static double calcularPromedioMensual(ArrayList<Double> ventas) {
        validarVentas(ventas);

        double total = 0;
        for (double venta : ventas) {
            total += venta;
        }
        return total / ventas.size();
    }

    public static double obtenerVentaMaxima(ArrayList<Double> ventas) {
        validarVentas(ventas);

        double maxima = ventas.get(0);
        for (double venta : ventas) {
            if (venta > maxima) {
                maxima = venta;
            }
        }
        return maxima;
    }

    public static double obtenerVentaMinima(ArrayList<Double> ventas) {
        validarVentas(ventas);

        double minima = ventas.get(0);
        for (double venta : ventas) {
            if (venta < minima) {
                minima = venta;
            }
        }
        return minima;
    }

    public static int contarDiasSobreElPromedio(ArrayList<Double> ventas) {
        double promedio = calcularPromedioMensual(ventas);
        int cantidadDias = 0;

        for (double venta : ventas) {
            if (venta > promedio) {
                cantidadDias++;
            }
        }
        return cantidadDias;
    }

    private static void validarVentas(ArrayList<Double> ventas) {
        if (ventas == null || ventas.isEmpty()) {
            throw new IllegalArgumentException("La lista de ventas no puede estar vacia.");
        }
    }

    public static void main(String[] args) {
        ArrayList<Double> ventasDiarias = new ArrayList<>();
        double[] montos = {
            120.50, 98.75, 150.00, 87.25, 210.40, 175.60, 132.80,
            99.99, 185.30, 240.00, 156.75, 145.20, 198.50, 110.00,
            275.80, 230.45, 165.00, 189.90, 95.50, 140.25, 220.00,
            205.75, 130.60, 175.00, 260.30, 115.40, 155.80, 190.00,
            245.90, 180.50
        };

        for (double monto : montos) {
            ventasDiarias.add(monto);
        }

        System.out.printf("Promedio mensual: %.2f%n", calcularPromedioMensual(ventasDiarias));
        System.out.printf("Venta maxima: %.2f%n", obtenerVentaMaxima(ventasDiarias));
        System.out.printf("Venta minima: %.2f%n", obtenerVentaMinima(ventasDiarias));
        System.out.println("Dias sobre el promedio: "
                + contarDiasSobreElPromedio(ventasDiarias));
    }
}
