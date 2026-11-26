import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio09 {

    static long medirInsertarInicio(List<Integer> lista) {
        long inicio = System.nanoTime();
        for (int i = 0; i < 20000; i++) lista.add(0, i);
        return System.nanoTime() - inicio;
    }

    static long medirAcceso(List<Integer> lista) {
        long inicio = System.nanoTime();
        for (int i = 0; i < lista.size(); i++) lista.get(i);
        return System.nanoTime() - inicio;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> l = new LinkedList<>();

        long aInsertar = medirInsertarInicio(a);
        long lInsertar = medirInsertarInicio(l);
        long aAcceso = medirAcceso(a);
        long lAcceso = medirAcceso(l);

        System.out.println("Operación         | ArrayList (ns) | LinkedList (ns)");
        System.out.println("------------------|----------------|----------------");
        System.out.printf("Insertar al inicio| %14d | %15d%n", aInsertar, lInsertar);
        System.out.printf("Acceso por índice | %14d | %15d%n", aAcceso, lAcceso);
    }
}
