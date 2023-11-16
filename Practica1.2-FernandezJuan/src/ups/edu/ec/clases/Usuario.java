package ups.edu.ec.clases;

public class Usuario {
	
	private int cedula;
	private String nombre;
    private String email;
    private Carrito carrito;
	
  

//Constructor
  public Usuario(int cedula, String nombre, String email) {
      this.cedula = cedula;
      this.nombre = nombre;
      this.email = email;
      this.carrito = new Carrito();  // Inicializamos el carrito en el constructor
  }



public int getCedula() {
	return cedula;
}



public void setCedula(int cedula) {
	this.cedula = cedula;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Carrito getCarrito() {
	return carrito;
}

public void setCarrito(Carrito carrito) {
	this.carrito = carrito;
}

@Override
public String toString() {
	return "Usuario [cedula=" + cedula + ", nombre=" + 
nombre + ", email=" + email + ", carrito=" + carrito + "]";
}


public void verProductosEnCarrito() {
    carrito.verProductos();
}

  
public void agregarProductoAlCarrito(Producto producto) {
    // Asegúrate de que this.carrito no sea null antes de agregar el producto
    if (this.carrito != null) {
        this.carrito.agregarProducto(producto);
    } else {
        System.out.println("Error: el carrito no ha sido inicializado.");
    }

}




}
