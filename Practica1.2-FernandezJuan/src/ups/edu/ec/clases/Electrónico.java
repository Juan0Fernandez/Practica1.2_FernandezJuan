package ups.edu.ec.clases;

public class Electrónico extends Producto{ //Extends representa la herencia de Producto
	
	private String marca;			//atributos de Electrónico
    private String garantia;

    public Electrónico(String nombre, double precio, String marca, String garantia, String codigo) {
        super(nombre, precio, codigo);
        this.marca = marca;					//constructor con la herencia de producto
        this.garantia = garantia;
    }
    
    //metodos getters
    public String getMarca() {
        return marca;
    }

    public String getGarantia() {
        return garantia;
    }
}
