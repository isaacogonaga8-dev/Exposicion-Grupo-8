import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};
        for (String n : nombres) {
            arrayList.add(n);
            linkedList.add(n);
        }

        System.out.println("ArrayList:");
        for (String n : arrayList) System.out.println(n);

        System.out.println("LinkedList:");
        for (String n : linkedList) System.out.println(n);
    }
}
