import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<String> pendientes = new ArrayList<>(Arrays.asList("Estudiar Java", "Hacer ejercicio", "Lavar platos"));
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nPendientes: " + pendientes);
            System.out.println("1) Marcar como completada\n2) Eliminar\n3) Salir");
            int op = sc.nextInt();
            if (op == 1) {
                System.out.print("Número: ");
                int i = sc.nextInt() - 1;
                if (i >= 0 && i < pendientes.size()) {
                    System.out.println("Completada: " + pendientes.remove(i));
                }
            } else if (op == 2) {
                System.out.print("Número: ");
                int i = sc.nextInt() - 1;
                if (i >= 0 && i < pendientes.size()) pendientes.remove(i);
            } else break;
            sc.close();
        }
    }
    
}
