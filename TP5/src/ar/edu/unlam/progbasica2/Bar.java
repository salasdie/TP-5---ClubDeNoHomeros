package ar.edu.unlam.progbasica2;

import java.util.*;

public class Bar {
	public TreeSet <Cliente> clientes;
	
	public Bar(){
		clientes = new TreeSet <Cliente>();
	}
	
	public TreeSet <Cliente> getClientes(){
		return clientes;
	}
	
	public void setClientes(TreeSet<Cliente> clientes){
		this.clientes = clientes;
	}
		
	public void agregarCliente(Cliente cliente){
		if(cliente != null){
			clientes.add(cliente);
		}
	}
}