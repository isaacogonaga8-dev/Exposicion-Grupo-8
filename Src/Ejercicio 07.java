import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio07 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.offer("Cliente 1");
        fila.offer("Cliente 2");
        fila.offer("Cliente 3");

        System.out.println("Siguiente: " + fila.peek());

        while (!fila.isEmpty()) {
            System.out.println("Atendiendo a: " + fila.poll());
        }
    }
}
