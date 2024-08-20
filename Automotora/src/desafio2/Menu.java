package desafio2;

import java.util.Scanner;

public class Menu {

    public void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = scanner.nextLine();

        System.out.println("Ingrese la edad del cliente:");
        int edadCliente = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.println("Ingrese la patente del vehículo:");
        String patenteVehiculo = scanner.nextLine();

        System.out.println("Ingrese el nombre de la venta:");
        String nombreVenta = scanner.nextLine();

        System.out.println("Ingrese la fecha de la venta:");
        String fechaVenta = scanner.nextLine();

        // Create Cliente and Vehiculo objects
        Cliente cliente = new Cliente(nombreCliente, fechaVenta, edadCliente);
        Vehiculo vehiculo = new Vehiculo(patenteVehiculo);

        // Create a LibroVenta object and save the sale
        LibroVenta libroVenta = new LibroVenta(nombreVenta, fechaVenta);
        libroVenta.guardarVenta(cliente, vehiculo);

        System.out.println("La venta ha sido procesada y guardada.");
    }
}