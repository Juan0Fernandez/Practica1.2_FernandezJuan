package ups.edu.ec.clases;

public class Producto {
	private String nombreProducto;		//Atributos de la clase Producto
    private double precio;
    private String codigo;

    //constructor de la clase Producto
    public Producto(String nombreProducto, double precio, String codigo) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;	
        this.codigo = codigo;
    }
    //metodos getters y setters
    public String getNombreProducto() {
        return nombreProducto;
    }
    
    public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	//metodo to string
	@Override
    public String toString() {
        return "Nombre: " + nombreProducto + ", Precio: " + precio + ", Código: " + codigo;
    }
	
	
	
}
