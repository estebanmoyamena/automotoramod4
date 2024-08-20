package desafio2;

public class Persona {

	private String rut;
	private String nombre;
	@SuppressWarnings("unused")
	private int edad;
	
	public Persona(String rut, String nombre, int edad) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getRut() {
		return rut;
		}
	
	public void setRut(String rut) {
		this.rut = rut;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}

