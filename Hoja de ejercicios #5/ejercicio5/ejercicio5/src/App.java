import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Teclado", 25.50, 8));
        productos.add(new Producto(2, "Raton", 15.00, 12));
        productos.add(new Producto(3, "Monitor", 180.00, 5));

        actualizarPreciosPorStock(productos, 10);

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public static void actualizarPreciosPorStock(ArrayList<Producto> productos, double porcentajeAumento) {
        for (Producto producto : productos) {
            if (producto.getStock() < 10) {
                double precioActualizado = producto.getPrecio() * (1 + porcentajeAumento / 100);
                producto.setPrecio(precioActualizado);
            }
        }
    }
}
