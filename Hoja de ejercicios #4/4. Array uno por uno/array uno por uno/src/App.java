import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n===== MENÚ ARRAYLIST =====");
            System.out.println("1. Agregar un elemento");
            System.out.println("2. Agregar varios elementos");
            System.out.println("3. Eliminar por índice");
            System.out.println("4. Mostrar elementos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un elemento: ");
                    String elemento = scanner.nextLine();
                    lista.add(elemento);
                    System.out.println("Elemento agregado correctamente.");
                    break;

                case 2:
                    System.out.print("Cuántos elementos desea agregar: ");
                    int cantidad;
                    try {
                        cantidad = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar un número válido.");
                        scanner.nextLine();
                        continue;
                    }

                    if (cantidad <= 0) {
                        System.out.println("La cantidad debe ser mayor que 0.");
                        break;
                    }

                    for (int i = 1; i <= cantidad; i++) {
                        System.out.print("Ingrese el elemento " + i + ": ");
                        lista.add(scanner.nextLine());
                    }
                    System.out.println("Se agregaron " + cantidad + " elementos.");
                    break;

                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("La lista está vacía.");
                        break;
                    }

                    System.out.println("Elementos actuales: " + lista);
                    System.out.print("Ingrese el índice a eliminar: ");

                    try {
                        int indice = scanner.nextInt();
                        scanner.nextLine();

                        if (indice < 0 || indice >= lista.size()) {
                            System.out.println("Índice fuera de rango.");
                        } else {
                            String eliminado = lista.remove(indice);
                            System.out.println("Se eliminó el elemento: " + eliminado);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar un índice válido.");
                        scanner.nextLine();
                    }
                    break;

                case 4:
                    if (lista.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("Elementos de la lista: " + lista);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}

