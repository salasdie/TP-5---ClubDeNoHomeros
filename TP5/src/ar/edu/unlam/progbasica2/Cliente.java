package ar.edu.unlam.progbasica2;

public class Cliente implements Comparable<Cliente> {
	
	private String nombre;
	private Integer edad;
	
	public Cliente(String nombre, Integer edad){
		this.nombre = nombre;
		this.edad = edad;	
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public Integer getEdad(){
		return edad;
	}	
	
	public void setEdad(Integer edad){
		this.edad= edad;
	}
	
	
	@Override
	public boolean equals(Object clienteNuevo){
		if(clienteNuevo instanceof Cliente){
			Cliente clienteNuevo2 = (Cliente) clienteNuevo;
			if (this.getNombre().equalsIgnoreCase(clienteNuevo2.getNombre())){
				return true;
				} else {
				return false;	
				}
		}else {
				return false;
		}
	}
	
	@Override 
	public int hashCode(){
		return 1;
	}
	
	@Override
	public int compareTo(Cliente otroCliente){
		return this.nombre.compareTo(otroCliente.getNombre());
	}
		
}
