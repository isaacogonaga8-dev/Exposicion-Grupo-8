import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long inicio = System.nanoTime();
        for (int i = 0; i < 50000; i++) arrayList.add(0, i);
        long tiempoArray = System.nanoTime() - inicio;

        inicio = System.nanoTime();
        for (int i = 0; i < 50000; i++) linkedList.add(0, i);
        long tiempoLinked = System.nanoTime() - inicio;

        System.out.println("ArrayList:  " + tiempoArray + " ns");
        System.out.println("LinkedList: " + tiempoLinked + " ns");
    }
}
