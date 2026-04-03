import java.util.Scanner;

public class Main {

    public static void main(String[] args) { // Método principal para ejecutar el programa

        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        ArbolInventario arbol = new ArbolInventario(); // Crea una instancia del árbol de inventario para gestionar los productos

        int opcion; // Variable para almacenar la opción seleccionada por el usuario

        do {
            System.out.println("\n=== TREE-STOCK ===");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario");
            System.out.println("3. Buscar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt(); // Lee la opción seleccionada por el usuario
            sc.nextLine(); // Limpia buffer

            switch (opcion) { 

                case 1: // Opción para registrar un nuevo producto
                    System.out.print("Ingrese ID del producto: ");
                    int id = sc.nextInt(); // Lee el ID del producto ingresado por el usuario
                    sc.nextLine(); // limpia buffer

                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = sc.nextLine(); // Lee el nombre del producto ingresado por el usuario

                    arbol.insertar(id, nombre); // Llama al método insertar del árbol para agregar el nuevo producto al inventario
                    System.out.println("Producto registrado.");
                    break; // Fin del caso 1

                case 2: // Opción para mostrar el inventario completo
                    arbol.mostrarInventario(); // Llama al método mostrarInventario del árbol para mostrar todos los productos registrados en el inventario
                    break; // Fin del caso 2

                case 3: // Opción para buscar un producto por su ID
                    System.out.print("Ingrese ID a buscar: ");
                    int idBuscar = sc.nextInt(); // Lee el ID del producto que el usuario desea buscar en el inventario

                    arbol.buscarProducto(idBuscar); // Llama al método buscarProducto del árbol para buscar el producto por su ID y mostrar el resultado de la búsqueda
                    break; // Fin del caso 3

                case 0: // Opción para salir del programa
                    System.out.println("Saliendo del sistema...");
                    break; // Fin del caso 0

                default: // Opción para manejar entradas no válidas
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0); // El bucle se repetirá hasta que el usuario seleccione la opción 0 para salir

        sc.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
