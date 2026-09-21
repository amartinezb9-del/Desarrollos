import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static ArrayList<Integer> fusionar(ArrayList<Integer> primero,
            ArrayList<Integer> segundo) {
        ArrayList<Integer> resultado = new ArrayList<>(primero.size() + segundo.size());
        int indicePrimero = 0;
        int indiceSegundo = 0;

        while (indicePrimero < primero.size() && indiceSegundo < segundo.size()) {
            if (primero.get(indicePrimero) <= segundo.get(indiceSegundo)) {
                resultado.add(primero.get(indicePrimero++));
            } else {
                resultado.add(segundo.get(indiceSegundo++));
            }
        }

        while (indicePrimero < primero.size()) {
            resultado.add(primero.get(indicePrimero++));
        }

        while (indiceSegundo < segundo.size()) {
            resultado.add(segundo.get(indiceSegundo++));
        }

        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Integer> primero = new ArrayList<>(Arrays.asList(1, 4, 7, 10));
        ArrayList<Integer> segundo = new ArrayList<>(Arrays.asList(2, 3, 8, 9));

        System.out.println(fusionar(primero, segundo));
    }
}
