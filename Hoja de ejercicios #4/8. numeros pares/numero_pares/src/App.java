import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        n.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
