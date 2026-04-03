// Clase Producto para representar cada nodo del árbol
public class ArbolInventario {

    Producto raiz; // Raíz del árbol

    // Método para insertar un nuevo producto en el árbol
    public Producto insertarRecursivo(Producto raiz, int id, String nombre) {
        if (raiz == null) {
            return new Producto(id, nombre);  // Crear un nuevo nodo si la raíz es null
        }

        if (id < raiz.id) { // Si el ID es menor, insertar en el subárbol izquierdo
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, id, nombre); // Insertar en el subárbol izquierdo
        } else if (id > raiz.id) { // Si el ID es mayor, insertar en el subárbol derecho
            raiz.derecho = insertarRecursivo(raiz.derecho, id, nombre); // Insertar en el subárbol derecho
        } else { // Si el ID ya existe, no se permite la inserción
            System.out.println("El producto con ese ID ya existe.");
        }

        return raiz; // Retornar la raíz del árbol después de la inserción
    }

    // Método público para insertar un producto que llama al método InsertarRecursivo
    public void insertar(int id, String nombre) { 
        raiz = insertarRecursivo(raiz, id, nombre);  
    }

    // método Recorrido Inorden (Izquierda - Raíz - Derecha)
    public void recorridoInorden(Producto raiz) { 
        if (raiz != null) { // Verificar que el nodo no sea null
            recorridoInorden(raiz.izquierdo); // Recorrer el subárbol izquierdo
            System.out.println("ID: " + raiz.id + " | Nombre: " + raiz.nombre); // Imprimir el ID y el nombre del producto
            recorridoInorden(raiz.derecho); // Recorrer el subárbol derecho
        }
    }

    // Método para mostrar el inventario completo
    public void mostrarInventario() {
        if (raiz == null) { 
            System.out.println("El inventario está vacío."); // Si la raíz es null, el inventario está vacío
        } else {
            System.out.println("Inventario (ordenado por ID):"); // Imprime un encabezado para el inventario
            recorridoInorden(raiz); // Llama al método de recorrido inorden para mostrar los productos en orden por ID
        }
    }

    // Método de búsqueda recursiva para encontrar un producto por su ID
    public Producto buscar(Producto raiz, int id) {
        if (raiz == null || raiz.id == id) { // Si la raíz es null o el ID coincide, se ha encontrado el producto
            return raiz; // Retorna el nodo encontrado o null si no se encuentra
        }

        if (id < raiz.id) { // Si el ID es menor, buscar en el subárbol izquierdo
            return buscar(raiz.izquierdo, id); // Llama recursivamente al subárbol izquierdo
        } else {
            return buscar(raiz.derecho, id); // Llama recursivamente al subárbol derecho
        }
    }

    // Método público para buscar un producto por su ID que llama al método de búsqueda recursiva
    public void buscarProducto(int id) { 
        Producto encontrado = buscar(raiz, id); // Llama al método de búsqueda recursiva para encontrar el producto por su ID

        if (encontrado != null) {
            System.out.println("Producto encontrado: ID=" + encontrado.id + ", Nombre=" + encontrado.nombre); // Si se encuentra el producto, imprime su ID y nombre
        } else {
            System.out.println("Producto no encontrado."); // Si no se encuentra el producto, imprime un mensaje indicando que no se encontró
        }
    }
}