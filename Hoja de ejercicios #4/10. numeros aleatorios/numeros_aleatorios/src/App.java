import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) nums.add(r.nextInt(100));
        System.out.println(nums);
    }
}
