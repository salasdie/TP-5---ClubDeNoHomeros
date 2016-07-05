package ar.edu.unlam.progbasica2;

import java.util.Comparator;

public class CompararPorEdad implements Comparator<Cliente>{
	
	@Override
	public int compare(Cliente clienteNuevo, Cliente clienteNuevo2){
		return clienteNuevo.getEdad() - clienteNuevo2.getEdad();
		}
	}

