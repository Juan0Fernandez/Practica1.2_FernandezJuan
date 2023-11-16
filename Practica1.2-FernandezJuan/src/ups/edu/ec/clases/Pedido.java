package ups.edu.ec.clases;

import java.util.ArrayList;

public class Pedido {

	private int numeroDePedido;
    private Carrito carrito;
	public Pedido(int numeroDePedido, Carrito carrito) {
		super();
		this.numeroDePedido = numeroDePedido;
		this.carrito = carrito;
	}
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
	@Override
	public String toString() {
		return "Pedido [numeroDePedido=" + numeroDePedido + ", carrito=" + 
	carrito + "]";
	}
    
    
}
