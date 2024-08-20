package desafio2;



public class MiniBus extends Bus {
private String tipoViaje;
public MiniBus(String color, String patente, int cantidadDeAsientos,
String tipoViaje) {
super(color, patente, cantidadDeAsientos);
this.tipoViaje = tipoViaje;
}
public String getTipoViaje() {
return tipoViaje;
}
public void setTipoViaje(String tipoViaje) {
this.tipoViaje = tipoViaje;
}
public void imprimeBus() {
System.out.println( " color " + super.getColor());
System.out.println( " patente " + super.getColor());
System.out.println( " cantidadDeAsientos " +
super.getCantidadDeAsientos() );
System.out.println( " tipoViaje " + getTipoViaje());
}
}


