# PREGUNTAS: LINKEDLIST Y COMPARACIÓN ARRAYLIST VS. LINKEDLIST

## 1. Evaluación diagnóstica: conocimientos previos sobre Listas y ArrayList

*Objetivo: Identificar los conocimientos previos de los estudiantes sobre las listas dinámicas y `ArrayList`, antes de iniciar el estudio profundo de `LinkedList`.*

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
