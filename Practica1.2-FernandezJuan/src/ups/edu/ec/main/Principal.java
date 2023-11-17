package ups.edu.ec.main;

import java.util.ArrayList;
import java.util.Scanner;

import ups.edu.ec.clases.Carrito;
import ups.edu.ec.clases.Electrónico;
import ups.edu.ec.clases.Pedido;
import ups.edu.ec.clases.Producto;
import ups.edu.ec.clases.Ropa;
import ups.edu.ec.clases.Usuario;

public class Principal {
	 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);//inicialisa la clase Scanner 

        ArrayList<Producto> productosDisponibles = new ArrayList<>(); //inicialisa una lista
        
        
        //agregamos productos a la lista creada, Productos que tenemos ya disponibles por asi decirlo
        productosDisponibles.add(new Producto("Laptop Dell", 800.00, "L001"));
        productosDisponibles.add(new Producto("Laptop Lenovo", 1000.00, "L002"));
        productosDisponibles.add(new Producto("IPhone X", 400.00, "I050"));
        productosDisponibles.add(new Producto("IPhone 13 Pro Max", 600.00, "I020"));
        productosDisponibles.add(new Producto("Samsung 12", 450.00, "S200"));
        productosDisponibles.add(new Producto("One Plus 8TMO", 300.00, "O500"));

        ArrayList<Producto> productosIngresados = new ArrayList<>();

        Usuario usuario = null;
        int opcionBucle = 0;
     do {//inicializa un bucle mediante un menu con el comando de do
         System.out.println("Ingrese la opción que desea realizar");//inicializa el menu 
         System.out.println("1. Registrar Usuario.");
         System.out.println("2. Registrar Producto.");
         System.out.println("3. Realizar pedido.");
         System.out.println("3. Imprimir pedido.");
         System.out.println("4. Salir.");

         opcionBucle = entrada.nextInt();//guanda el parametro que desea realizar el usuario 
         entrada.nextLine(); // Consumir la nueva línea

         switch (opcionBucle) {
             case 1:
            	//codigo que se usara para la creacion de n usuarios
                 System.out.println("Cuantos usuarios desea ingresar: ");
                 int numUsuarios = entrada.nextInt();
                 entrada.nextLine();

                 for (int i = 1; i <= numUsuarios; i++) {//inicializa un bucle para la creacion de n usuarios
                     System.out.println("Ingrese los datos del Usuario " + i + ":");
                     System.out.print("Ingrese la cedula: ");
                     int cedula = entrada.nextInt();
                     entrada.nextLine(); // Consumir la nueva línea
                     System.out.print("Nombre: ");
                     String nombre = entrada.nextLine();
                     System.out.print("Email: ");
                     String email = entrada.nextLine();
                     System.out.println(" ");

                     usuario = new Usuario(cedula, nombre, email);
                 }
                 break;

             case 2:
            	//codigo que se usara para la creacion de n Productos
                 System.out.println("Cuantos Productos desea ingresar: ");
                 int numProductos = entrada.nextInt();
                 entrada.nextLine();

                 for (int i = 1; i <= numProductos; i++) {//inicializa un bucle para la creacion de n Productos

                	 System.out.println("Ingrese el nombre del producto:");
                     String nombreProducto = entrada.nextLine();
                     System.out.println("Ingrese el precio del producto:");
                     double precioProducto = entrada.nextDouble();
                     entrada.nextLine(); // Consumir la nueva línea
                     System.out.println("Ingrese el código del producto:");
                     String codigoProducto = entrada.nextLine();

                     System.out.println("Si su producto es electrónico digite (E)caso contrario dijite (R)");
                     char esElectronico = entrada.nextLine().charAt(0);
                     //char palabra que nos permite el ingreso solo de un caracter
                     
                     //Verifica si el carácter almacenado en esElectronico, convertido a mayúsculas, es igual a 'E'.
                     if (Character.toUpperCase(esElectronico) == 'E') {
                         System.out.println("Ingrese la marca del producto electrónico:");
                         String marca = entrada.nextLine();
                         System.out.println("Ingrese la garantía del producto electrónico:");
                         String garantia = entrada.nextLine();
                         productosIngresados.add(new Electrónico(nombreProducto, precioProducto, marca, garantia, codigoProducto));
                     } else {//si el caracter ingresado no es e
                         System.out.println("Ingrese la talla del producto de ropa:");
                         String talla = entrada.nextLine();
                         productosIngresados.add(new Ropa(nombreProducto, precioProducto, talla, codigoProducto));
                     } 
                 }
            	 
            	 
                 break;

             case 3://tercer caso realizar pedido
            	 if (usuario != null) {//condicion si no existe un usuario no se ejecuta el codigo
                     System.out.println("Productos disponibles:");
                     int index = 1;
                     for (Producto producto : productosDisponibles) {//Codigo que muestra productos ya creados anteriormente
                         System.out.println(index + ". " + producto.getNombreProducto());
                         index++;
                     }

                     System.out.println("Productos ingresados:");//Codigo que muestra los productos que fueron ingresados 
                     for (Producto producto : productosIngresados) {
                         System.out.println(index + ". " + producto.getNombreProducto());
                         index++;
                     }

                     System.out.println("0. Salir");

                     int opcionProducto;
                     do {//bucle para agregar productos al carrito 
                         System.out.print("Seleccione el número del producto que desea agregar al carrito o ( 0 para salir): ");
                         opcionProducto = entrada.nextInt();
                         entrada.nextLine(); // Consumir la nueva línea
                         //Codigo por el cual se agregan productos al carrito utilizando la composicion,polimorfismo y herencia
                         if (opcionProducto > 0 && opcionProducto <= productosDisponibles.size()) {
                             usuario.agregarProductoAlCarrito(productosDisponibles.get(opcionProducto - 1));
                         } else if (opcionProducto > productosDisponibles.size() && opcionProducto <= index) {
                             usuario.agregarProductoAlCarrito(productosIngresados.get(opcionProducto - productosDisponibles.size() - 1));
                             usuario.verProductosEnCarrito();
                              
                         } else if (opcionProducto != 0) {
                             System.out.println("Opción no válida. Intente de nuevo.");
                         }
                     } while (opcionProducto != 0);
                 } else {
                     System.out.println("Primero registre un usuario antes de realizar un pedido.");
                 }
                 break;

             case 4:
                 System.out.println(" E-commerce pedidos.");

                 usuario.verProductosEnCarrito();                
            	 usuario.realizarPedido();
            	 
                 break;
             case 5:
                 System.out.println("Saliendo del programa.");
                 break;

             default:
                 System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                 break;
         }
     } while (opcionBucle != 4);

     entrada.close();//ciera la clase sccaner
	}
 }
