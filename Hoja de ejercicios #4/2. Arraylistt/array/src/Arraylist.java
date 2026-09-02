public class Arraylist {
    public static void main(String[] args) throws Exception {
        System.out.println("Array list <integer> de 10 numeros");

        java.util.ArrayList<Integer> numeros = new java.util.ArrayList<Integer>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        numeros.add(30);
        numeros.add(35);
        numeros.add(40);
        numeros.add(45);
        numeros.add(50);

        System.out.println("Numeros en la lista:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        
    }
}
