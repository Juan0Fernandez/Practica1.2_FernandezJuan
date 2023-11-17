package ups.edu.ec.clases;

import java.util.ArrayList;

public class Pedido {

	private int numeroDePedido;//Atributos de pedido
    private Carrito carrito;
    
    
    
	public Pedido(int numeroDePedido, Carrito carrito) {
		super();
		this.numeroDePedido = numeroDePedido; 		//constructor de pedido
		this.carrito = carrito;
	}
	
	//metodos de getters y setters
	public int getNumeroDePedido() {
		return numeroDePedido;
	}
	public void setNumeroDePedido(int numeroDePedido) {
		this.numeroDePedido = numeroDePedido;
	}
	public Carrito getCarrito() {
		return carrito;
	}
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	@Override //metodo to String
	public String toString() {
		return "Pedido [numeroDePedido=" + numeroDePedido + ", carrito=" + 
	carrito + "]";
	}
	
}
