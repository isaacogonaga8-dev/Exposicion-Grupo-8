import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio04 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 30000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long inicio = System.nanoTime();
        while (!arrayList.isEmpty()) arrayList.remove(0);
        long tiempoArray = System.nanoTime() - inicio;

        inicio = System.nanoTime();
        while (!linkedList.isEmpty()) linkedList.removeFirst();
        long tiempoLinked = System.nanoTime() - inicio;

        System.out.println("ArrayList:  " + tiempoArray + " ns");
        System.out.println("LinkedList: " + tiempoLinked + " ns");
    }
}
