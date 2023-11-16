package ups.edu.ec.main;

import java.util.Scanner;

import ups.edu.ec.clases.Carrito;
import ups.edu.ec.clases.Pedido;
import ups.edu.ec.clases.Producto;
import ups.edu.ec.clases.Usuario;



public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Producto producto1 = new Producto("Laptop Dell ", 800.00, "L001");
        Producto producto2 = new Producto("Laptop Lenovo ", 1000.00, "L002");
        Producto producto3 = new Producto("IPhone X ", 400.00, "I050");
        Producto producto4 = new Producto("IPhone 13 Pro Max ", 600.00, "I020");
        Producto producto5 = new Producto("Samsung 12 ", 450.00, "S200");
        Producto producto6 = new Producto("One Plus 8TMO ", 300.00, "O500");

        // Ingreso de usuarios
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos del Usuario " + i + ":");
            System.out.print("Ingrese la cedula: ");
            int cedula = entrada.nextInt();
            entrada.nextLine(); // Consumir la nueva línea
            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Email: ");
            String email = entrada.nextLine();
            System.out.println(" ");

            Usuario usuario = new Usuario(cedula, nombre, email);

            // Mostrar productos disponibles
            System.out.println("Productos disponibles:");
            System.out.println("1. " + producto1.getNombreProducto());
            System.out.println("2. " + producto2.getNombreProducto());
            System.out.println("3. " + producto3.getNombreProducto());
            System.out.println("4. " + producto4.getNombreProducto());
            System.out.println("5. " + producto5.getNombreProducto());
            System.out.println("6. " + producto6.getNombreProducto());

            // Agregar productos al carrito interactivamente
            System.out.println("Seleccione el número del producto que desea agregar al carrito o 0 para dejar de agregar productos :");
            Carrito carritoUsuario = interactuarConCarrito(entrada, usuario, producto1, producto2, producto3, producto4, producto5, producto6);

            // Mostrar carritos
            System.out.println("\nCarrito de " + usuario.getNombre() + ":");
            usuario.verProductosEnCarrito();
            
            System.out.println("\nDesea realizar el pedido 1.si 2.no o cero para salir ");
            int opcion;
            do {
                System.out.print("Opción: ");
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                    	 Pedido pedido = new Pedido(1, carritoUsuario);
                    	 System.out.println("Detalle del pedido:\n" + pedido.toString());
                         System.out.println("Valor a pagar: " + carritoUsuario.calcularTotal());
                    	carritoUsuario.realizarPedido();
                    	
                        break;
                    case 2:
                    	System.out.print("Pedido Cancelado");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } while (opcion != 0);
            
        }
    }

    private static Carrito interactuarConCarrito(Scanner entrada, Usuario usuario, Producto producto1, Producto producto2, Producto producto3, Producto producto4, Producto producto5, Producto producto6) {
        Carrito carrito = usuario.getCarrito();

        int opcion;
        do {
            System.out.print("Opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    usuario.agregarProductoAlCarrito(producto1);
                    break;
                case 2:
                    usuario.agregarProductoAlCarrito(producto2);
                    break;
                case 3:
                    usuario.agregarProductoAlCarrito(producto3);
                    break;
                case 4:
                    usuario.agregarProductoAlCarrito(producto4);
                    break;
                case 5:
                    usuario.agregarProductoAlCarrito(producto5);
                    break;
                case 6:
                    usuario.agregarProductoAlCarrito(producto6);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        return carrito;
    }
}