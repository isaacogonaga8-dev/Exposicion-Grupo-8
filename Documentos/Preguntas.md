# PREGUNTAS: LINKEDLIST Y COMPARACIÓN ARRAYLIST VS. LINKEDLIST

## 1. Evaluación diagnóstica: conocimientos previos sobre Listas y ArrayList

*Objetivo: Identificar los conocimientos previos de los estudiantes sobre las listas dinámicas y `ArrayList` (tema del Grupo 7), antes de iniciar el estudio profundo de `LinkedList`.*

**Preguntas:**

**1. ¿Cuál es la principal ventaja de una Lista (`List`) frente a un arreglo tradicional (`int[]`) en Java?**
* A) Su tamaño es dinámico: crece o disminuye automáticamente.
* B) Solo puede guardar números enteros.
* C) Ocupa menos líneas de código para imprimirse.

**2. ¿En qué posición (índice) se guarda siempre el primer elemento de un `ArrayList`?**
* A) 1
* B) 0
* C) -1

**3. ¿De qué paquete de Java debemos importar la clase `ArrayList`?**
* A) `java.io`
* B) `java.util`
* C) `java.net`

**4. Si quieres guardar números enteros en un `ArrayList`, ¿cómo debes declararlo correctamente?**
* A) `ArrayList<int> numeros = new ArrayList<>();`
* B) `ArrayList<Integer> numeros = new ArrayList<>();`
* C) `ArrayList numeros = new int[];`

**5. ¿Qué método de `ArrayList` se utiliza para agregar un nuevo elemento al final de la lista?**
* A) `push()`
* B) `insert()`
* C) `add()`

**6. ¿Qué método permite obtener cuántos elementos tiene guardados un `ArrayList`?**
* A) `length`
* B) `size()`
* C) `count()`

**7. Si tienes `ArrayList<String> frutas` con 3 elementos, ¿cómo obtienes el segundo elemento?**
* A) `frutas.get(1)`
* B) `frutas.get(2)`
* C) `frutas`

**8. ¿Qué hace el método `lista.set(0, "Nuevo")` en un `ArrayList`?**
* A) Borra toda la lista y deja solo `"Nuevo"`.
* B) Reemplaza el elemento de la posición 0 por `"Nuevo"`.
* C) Agrega `"Nuevo"` al final sin borrar nada.

**9. ¿Qué sucede cuando ejecutas `lista.remove(1)` en un `ArrayList`?**
* A) Se elimina el elemento de la posición 1 y los demás se recorren para llenar el espacio.
* B) Se deja un espacio vacío (`null`) en la posición 1.
* C) Se borra el último elemento de la lista.

**10. ¿Por qué un `ArrayList` es tan rápido para consultar un dato por su índice (`get(i)`)?**
* A) Porque guarda los datos en posiciones contiguas de memoria (como un arreglo por dentro).
* B) Porque ordena los datos alfabéticamente automáticamente.
* C) Porque solo permite guardar máximo 10 datos.

---

## 2. Evaluación final (APE 6): LinkedList y comparación ArrayList vs. LinkedList

*Objetivo: Comprobar la comprensión de los estudiantes sobre la arquitectura interna de `LinkedList`, sus métodos exclusivos y el criterio técnico de selección frente a `ArrayList`.*

**Preguntas:**

**1. ¿Qué sucede en una `LinkedList` cuando se elimina un nodo intermedio?**
* A) El nodo anterior apunta directamente al siguiente, saltándose el eliminado.
* B) Todos los nodos siguientes se mueven una posición a la izquierda en memoria.
* C) Se borran también todos los nodos que estaban después de él.

**2. ¿Cómo se declara correctamente una `LinkedList` que almacenará nombres de ciudades en Java?**
* A) `LinkedList<String> ciudades = new LinkedList;`
* B) `LinkedList<String> ciudades = new LinkedList<>();`
* C) `LinkedList ciudades = new List<String>();`

**3. Si una `LinkedList` tiene 1,000 elementos y llamas a `lista.get(999)` (el último elemento), ¿qué hace Java internamente?**
* A) Recorre los 1,000 nodos desde el principio (`HEAD`).
* B) Empieza desde el final (`TAIL`) porque está más cerca y lo encuentra al instante.
* C) Lanza un error porque `LinkedList` no tiene índices.

**4. ¿Qué interfaz permite recorrer una `LinkedList` en ambos sentidos (hacia adelante y hacia atrás) de forma eficiente?**
* A) `Scanner`
* B) `ListIterator`
* C) `Comparator`

**5. ¿Cuál es el valor inicial que tienen los punteros `HEAD` (`first`) y `TAIL` (`last`) cuando creas una `LinkedList` vacía?**
* A) `0`
* B) `null`
* C) `-1`

**6. Si necesitas implementar una PILA (LIFO: último en entrar, primero en salir) usando `LinkedList`, ¿qué pareja de métodos usas?**
* A) `push()` para agregar arriba y `pop()` para sacar de arriba.
* B) `get(0)` y `size()`.
* C) `contains()` y `clear()`.

**7. ¿Por qué `ArrayList` aprovecha mejor la memoria caché del procesador que `LinkedList`?**
* A) Porque sus elementos están guardados uno al lado del otro en memoria contigua.
* B) Porque usa menos líneas de código en Java.
* C) Porque no permite guardar datos repetidos.

**8. ¿Qué método permite verificar si un elemento específico existe dentro de una `LinkedList` o `ArrayList`?**
* A) `exists(elemento)`
* B) `contains(elemento)`
* C) `has(elemento)`

**9. Si tienes un `ArrayList` con capacidad inicial de 10 elementos y agregas el elemento 11, ¿qué ocurre?**
* A) Se sobreescribe el primer elemento.
* B) Java crea un nuevo arreglo más grande y copia los datos anteriores.
* C) El programa lanza un error y se detiene.

**10. En un editor de texto donde guardas el historial para usar "Deshacer" (Ctrl + Z) quitando siempre la última acción, ¿qué conviene usar?**
* A) `LinkedList` usando `addLast()` y `removeLast()`.
* B) Un arreglo estático `String[]`.
* C) Un `ArrayList` ordenándolo en cada clic.

---
