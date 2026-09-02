import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nombres = Arrays.asList("Ana", "Luis", "Pedro");
        System.out.print("Ingrese nombre: ");
        String n = sc.next();
        System.out.println(nombres.contains(n) ? "Existe" : "No existe");
        sc.close();
    }
}
