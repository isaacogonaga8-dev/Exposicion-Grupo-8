import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio05 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long inicio = System.nanoTime();
        boolean a = arrayList.contains(99999);
        long tiempoArray = System.nanoTime() - inicio;

        inicio = System.nanoTime();
        boolean l = linkedList.contains(99999);
        long tiempoLinked = System.nanoTime() - inicio;

        System.out.println("ArrayList:  " + a + " en " + tiempoArray + " ns");
        System.out.println("LinkedList: " + l + " en " + tiempoLinked + " ns");
    }
}
