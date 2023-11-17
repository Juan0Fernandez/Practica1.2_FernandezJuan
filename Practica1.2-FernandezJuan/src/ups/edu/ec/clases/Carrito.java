package ups.edu.ec.clases;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private ArrayList<Producto> productos;//atributo de carrito

    public Carrito() {
        this.productos = new ArrayList<>();//inicializa una lista de productos
    }
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}


	@Override//metodo to string
	public String toString() {
		return "Carrito [productos del carrito:\n " + productos + "]" ;
	}

	public void agregarProducto(Producto producto) {//metodo para agregar productos al carrito
        productos.add(producto);
      //se muestra en consola lo que se agrego al carrito
        System.out.println("Producto agregado al carrito: " + producto.getNombreProducto()); 
    }

    public void verProductos() {//metodo para ver los productos en el carrito
    	System.out.println("Productos en el carrito: ");
    	for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    public double calcularTotal() {//metodo para calcular el total de los productos
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        System.out.println("Total a pagar :  "+ total);
		return total;
    }
    
    public void realizarPedido() {
        System.out.println("Pedido realizado con éxito. ¡Gracias por su compra!");
        
        productos.clear(); // Limpiar el carrito después de realizar el pedido
    }
    
    
}
