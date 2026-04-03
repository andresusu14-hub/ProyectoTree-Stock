// Clase Producto para representar cada nodo del árbol
public class Producto {

    int id; // Identificador único del producto
    String nombre; // Nombre del producto
    Producto izquierdo; // Hijo izquierdo del nodo
    Producto derecho; // Hijo derecho del nodo

    // Constructor para inicializar un producto con su id y nombre
    public Producto(int id, String nombre) {
        this.id = id; // Asignar el id del producto
        this.nombre = nombre; // Asigna el nombre del producto
        this.izquierdo = null; // Inicializa el hijo izquierdo como null
        this.derecho = null; // Inicializa el hijo derecho como null
    }
}
