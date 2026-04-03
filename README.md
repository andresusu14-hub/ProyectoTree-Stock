# Estudiante: Andrés Felipe Usuga Espinosa

# Sistema de inventario "Tree-Stock"

## Objetivo del programa
 El ojetivo de este programa es desarrollar una aplicación de consola en Java que permita gestionar un inventario de productos utilizando un árbol binario de búsqueda, facilitando el almacenamiento, consulta y organización de los productos de manera eficiente mediante su identificador (ID)

## Estructura del programa
El programa está compuesto por tres clases principales:
- Producto: Representa cada nodo del árol. Contiene los atributos:  ID del producto (int) y nombre (String). También incluye referencias de los nodos izquierdo y derecho.
- ArbolInventario: Contiene la lógica del árbol binario. Permite insertar productos de forma recursiva. Implementa el recorrido inorden. Permite buscar pruductos por ID.
- Main: Contiene el menú interactivo. Permite al usuario interactuar con el sistema mediante la consola.

## Funcionamiento del sistema
El sistema utiliza un árbol binario de búsqueda (BST), donde cada prodcuto se almacena en una posición específica según su ID

1. Si el ID es menor que el nodo actual, se ubica en el subárbol izquierdo.
2. Si el ID es mayor, se ubica en el subárbol derecho

## Instrucciones de ejecución
Para ejecutar el programa correctamente, siga los siguientes pasos:

1. Instalar el JDK (Java Development Kit) en el equipo.
2. Guardar las clases del programa en archivos con el mismo nombre de cada clase:
   - Producto.java
   - ArbolInventario.java
   - Main.java
3. Abrir una terminal o consola en la carpeta donde se encuentran los archivos.
4. Ejecutar el programa
5. Una vez iniciado el programa, aparecerá un menú interactivo donde el usuario podrá seleccionar diferentes opciones para registrar productos con ID, mostrar inventario o buscar un producto.

## Opciones del menú del sistema
El programa presenta las siguientes opciones:

1. Registrar producto: permite ingresar un ID y nombre del producto. El producto se inserta en el árbol según su ID
2. Mostrar inventario: Muestra los productos almacenados, se presentan ordenados por ID
3. Buscar producto: Permite ingresar un ID. El sistema indica si el producto existe o no.
0. Salir: finaliza la ejecución del sistema




