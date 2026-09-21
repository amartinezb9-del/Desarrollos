import java.util.ArrayList;

public class CarritoCompras {
    private final ArrayList<ItemCarrito> items;

    public CarritoCompras() {
        items = new ArrayList<>();
    }

    public void agregarItem(String producto, int cantidad, double precioUnitario) {
        for (ItemCarrito item : items) {
            if (item.getProducto().equals(producto)) {
                item.incrementarCantidad(cantidad);
                return;
            }
        }

        items.add(new ItemCarrito(producto, cantidad, precioUnitario));
    }

    public void eliminarItem(String producto) {
        items.removeIf(item -> item.getProducto().equals(producto));
    }

    public void vaciarCarrito() {
        items.clear();
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}