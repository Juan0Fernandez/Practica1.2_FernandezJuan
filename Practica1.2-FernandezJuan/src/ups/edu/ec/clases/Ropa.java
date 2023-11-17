package ups.edu.ec.clases;

public class Ropa extends Producto {//Extends representa la herencia de Producto
	
	//Atributo de ropa
	private String talla;

    public Ropa(String nombre, double precio, String talla, String codigo) {
        super(nombre, precio, codigo);		//constructor de la clase Ropa
        this.talla = talla;
    }

    //metodos de getters y setters
    
    public String getTalla() {
        return talla;
    }

	public void setTalla(String talla) {
		this.talla = talla;
	}
	
    
}
