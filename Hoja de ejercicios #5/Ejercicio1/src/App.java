import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Cuaderno", 4.50, 8));
        productos.add(new Producto(2, "Boligrafo", 1.25, 15));
        productos.add(new Producto(3, "Mochila", 25.00, 5));

        aumentarPreciosPorStockBajo(productos, 10);

        for (Producto producto : productos) {
            System.out.printf("%s: %.2f EUR (stock: %d)%n",
                    producto.getNombre(), producto.getPrecio(), producto.getStock());
        }
    }

    public static void aumentarPreciosPorStockBajo(ArrayList<Producto> productos, double porcentajeAumento) {
        for (Producto producto : productos) {
            if (producto.getStock() < 10) {
                double precioActualizado = producto.getPrecio() * (1 + porcentajeAumento / 100);
                producto.setPrecio(precioActualizado);
            }
        }
    }
}
