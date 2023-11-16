package ups.edu.ec.clases;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	private List<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public Carrito( List<Producto> productos) {
		super();
		this.productos = productos;
	}

  
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}



	@Override
	public String toString() {
		return "Carrito [productos del carrito:\n " + productos + "]" ;
	}

	public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado al carrito: " + producto.getNombreProducto());
    }


    public void verProductos() {
    	for (Producto producto : productos) {
            System.out.println(producto.getNombreProducto() + " - " + producto.getPrecio());
        }
    }
	
    public void realizarPedido() {
        // Lógica para realizar un pedido
        System.out.println("Pedido realizado con éxito. ¡Gracias por su compra!");
        
        productos.clear(); // Limpiar el carrito después de realizar el pedido
    }
    
    public double calcularTotal() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
		return total;
    }
}
