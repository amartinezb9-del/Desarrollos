import java.util.*;
public class App {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>(Arrays.asList(8.5, 9.0, 7.5, 10.0));
        double suma = 0;
        for (double n : notas) suma += n;
        System.out.println("Promedio: " + (suma / notas.size()));
    }
}
