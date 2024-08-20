package desafio2;

public class Tienda {

	private Vendedor vendedor;
	private Vehiculo vehiculo;
	private int stock;
	
	public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {

	}
	
	public 	Vendedor getVendedor( ) {
		return vendedor;
	}
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String existeStock() {
		
		return " cantidad de stock es " + getStock();	
		}
	
	}
