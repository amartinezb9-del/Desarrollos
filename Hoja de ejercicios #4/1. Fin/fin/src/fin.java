import java.util.Scanner;

public class fin {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese elementos, y cuando termine escriba fin");
        String input;
        input = scanner.nextLine();

        while (!input.equals("fin")) {
            System.out.println("Ingrese elementos, y cuando termine escriba fin");
            input = scanner.nextLine();
        }
        System.out.println("Fin del programa");

        scanner.close();

    }
}
