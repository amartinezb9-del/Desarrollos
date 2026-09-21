import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    static class Factura {
        private final int idFactura;
        private final String cliente;
        private final double monto;

        Factura(int idFactura, String cliente, double monto) {
            this.idFactura = idFactura;
            this.cliente = cliente;
            this.monto = monto;
        }

        public int getIdFactura() {
            return idFactura;
        }

        public String getCliente() {
            return cliente;
        }

        public double getMonto() {
            return monto;
        }
    }

    public static Map<String, Double> totalFacturadoPorCliente(ArrayList<Factura> facturas) {
        Map<String, Double> resumen = new LinkedHashMap<>();

        for (Factura factura : facturas) {
            resumen.merge(factura.getCliente(), factura.getMonto(), Double::sum);
        }

        return resumen;
    }

    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();
        facturas.add(new Factura(1, "Ana", 1500.00));
        facturas.add(new Factura(2, "Luis", 800.50));
        facturas.add(new Factura(3, "Ana", 275.25));
        facturas.add(new Factura(4, "Luis", 1200.00));
        facturas.add(new Factura(5, "Marta", 950.75));

        Map<String, Double> resumen = totalFacturadoPorCliente(facturas);

        System.out.println("Total facturado por cliente:");
        for (Map.Entry<String, Double> entrada : resumen.entrySet()) {
            System.out.printf("%s: %.2f%n", entrada.getKey(), entrada.getValue());
        }
    }
}
