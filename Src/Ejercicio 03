import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio03 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 50000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long inicio = System.nanoTime();
        for (int i = 0; i < arrayList.size(); i++) arrayList.get(i);
        long tiempoArray = System.nanoTime() - inicio;

        inicio = System.nanoTime();
        for (int i = 0; i < linkedList.size(); i++) linkedList.get(i);
        long tiempoLinked = System.nanoTime() - inicio;

        System.out.println("ArrayList:  " + tiempoArray + " ns");
        System.out.println("LinkedList: " + tiempoLinked + " ns");
    }
}
