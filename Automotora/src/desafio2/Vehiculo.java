package desafio2;


public class Vehiculo {

	private String color;
	private String  patente;
	
	public Vehiculo(String color, String patente) {
		super();
		this.color = color;
		this.patente = patente;
		}
	public Vehiculo(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getColor() {
		return color;
	}
		public void setColor(String color) {
			this.color = color;
			}
	
	public String getPatente() {
		return patente;
	}
	
	public void setPatente(String patente) {
		this.patente = patente;
	}

}
	

