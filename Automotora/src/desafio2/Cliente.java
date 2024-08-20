package desafio2;

public class Cliente extends Persona {

    private int edad;

    // Constructor
    public Cliente(String rut, String nombre, int edad) {
        super(rut, nombre, edad); // Llama al constructor de Persona
        this.edad = edad; // Asigna la edad pasada como parámetro a la variable de instancia `edad`
    }

    // Getter para edad
    public int getEdad() {
        return edad;
    }

    // Setter para edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
}