package ups.edu.ec.clases;

public class Usuario {

	// Atributos de Usuario
	private int cedula;
	private String nombre;
	private String email;
	private Carrito carrito;

	// Constructor de la clase ususario con sus atributos
	public Usuario(int cedula, String nombre, String email) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.email = email;
		this.carrito = new Carrito();
	}

	// metodos de getters y setters

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public String getNombre() {
		return nombre;
	}

	public void agregarProductoAlCarrito(Producto producto) {// metodo para agregar producto al carrito
		carrito.agregarProducto(producto);
	}

	public void verProductosEnCarrito() {//metodo para ver los productos en el carrito
		carrito.verProductos();
	}

	public void realizarPedido() {//metodo para realizar pedido 
		carrito.calcularTotal();
		carrito.realizarPedido();

	}

	@Override
	public String toString() {
		return "Usuario [cedula=" + cedula + ", nombre=" + nombre + ", email=" + email + ", carrito=" + carrito + "]";
	}

}
