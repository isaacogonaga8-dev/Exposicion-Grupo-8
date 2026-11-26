Conclusiones: ArrayList vs. LinkedList


Las estructuras de datos determinan la forma en que un programa almacena, consulta y modifica la información. En el lenguaje Java, las clases ArrayList y LinkedList implementan la interfaz List y permiten manejar colecciones ordenadas de elementos; sin embargo, su implementación interna es distinta, lo cual influye directamente en el rendimiento de cada operación.


La elección de la estructura depende de la operación predominante. No existe una estructura superior en todos los casos; el desempeño de ArrayList y LinkedList varía según se trate de consultar, insertar, eliminar o buscar elementos.
ArrayList es más eficiente para la consulta de datos. Al estar basada en un arreglo dinámico, permite el acceso directo a cualquier posición mediante el método get(i) con complejidad O(1). Además, requiere menos memoria, ya que no almacena referencias adicionales por elemento.
LinkedList es más eficiente para inserciones y eliminaciones en los extremos. Al estar formada por nodos doblemente enlazados, agregar o quitar elementos al inicio o al final no requiere desplazar el resto de los datos, con complejidad O(1). Por esta razón es adecuada para implementar colas (Queue) y estructuras similares.
LinkedList presenta desventajas en el acceso por índice. Para llegar a una posición específica debe recorrer los nodos uno a uno, con complejidad O(n), lo que la hace menos eficiente cuando se requieren consultas frecuentes.
En la búsqueda de elementos, ambas estructuras tienen un comportamiento similar. Las dos requieren recorrer la colección (complejidad O(n)); no obstante, ArrayList suele obtener mejores tiempos debido a que sus elementos se encuentran contiguos en memoria.
La medición de tiempos permitió comprobar la teoría en la práctica. Los ejercicios realizados con System.nanoTime() evidenciaron las diferencias de rendimiento, especialmente al trabajar con grandes volúmenes de datos.




Importancia del tema
Eficiencia del software: seleccionar correctamente la estructura de datos reduce el tiempo de ejecución y el consumo de recursos, aspecto crítico cuando se trabaja con grandes cantidades de información.
Base para el estudio de estructuras de datos: comprender el funcionamiento de arreglos dinámicos y listas enlazadas facilita el aprendizaje posterior de pilas, colas, árboles y grafos.
Toma de decisiones de diseño: el programador debe analizar qué operaciones serán más frecuentes antes de elegir una estructura, y no limitarse a que el programa funcione.
Aplicación en el ámbito profesional: las colecciones de Java son utilizadas en sistemas de gestión de turnos, inventarios, historiales, registros de usuarios y muchas otras aplicaciones reales.





5. Conclusión final

La comparación entre ArrayList y LinkedList demuestra que el rendimiento de un programa depende en gran medida de la estructura de datos elegida. Si la aplicación requiere consultas frecuentes por posición, ArrayList es la opción más adecuada; si requiere inserciones y eliminaciones constantes en los extremos, LinkedList ofrece mejores resultados. Por lo tanto, conocer las características de cada estructura permite desarrollar soluciones más eficientes, ordenadas y acordes a las necesidades del problema.
