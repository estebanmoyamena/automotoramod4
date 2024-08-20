package desafio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

	
public class LibroVenta {
	private String nombreVenta;
	private String fechaVenta;
	
	public LibroVenta(String nombreVenta, String fechaVenta) {
		super();
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;
	}

	public String getNombreVenta() {
		return nombreVenta;
	}

	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
		
		File carpeta = new File("src/"+cliente.getNombre());  
		File archivo = new File("src/"+cliente.getNombre()+"/"+getNombreVenta()+".txt");  

		ArrayList<String> lista = new ArrayList<String>(); 
		lista.add(vehiculo.getPatente()); 
		lista.add(Integer.toString(cliente.getEdad())); 
		lista.add(getFechaVenta()); 
		lista.add(getNombreVenta()); 
		
		if (!carpeta.exists()) {
			if (carpeta.mkdirs()) {
				System.out.println("*-----------------*\n Directorio creado \n*-----------------*");
				try {
					archivo.createNewFile();
					FileWriter fileW = new FileWriter(archivo);
					BufferedWriter bufferedWriter = new BufferedWriter(fileW);

					Iterator<String> iter = lista.iterator();
					while (iter.hasNext()) {
						bufferedWriter.write(iter.next());
						if(iter.hasNext()) {
							bufferedWriter.newLine();
						}
					}
					bufferedWriter.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Error al crear directorio");
			}
		} else {
			System.out.println("Directorio ya esta creado");
		}
	}
	public static void main(String[] args) {
	      
    }
}



