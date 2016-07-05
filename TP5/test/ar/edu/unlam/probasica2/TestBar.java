package ar.edu.unlam.probasica2;

import static org.junit.Assert.*;
import java.util.TreeSet;
import org.junit.Test;
import ar.edu.unlam.progbasica2.Bar;
import ar.edu.unlam.progbasica2.Cliente;
import ar.edu.unlam.progbasica2.CompararPorEdad;

public class TestBar {

	@Test
	public void agregarClientesAlBar(){
		Bar bar = new Bar();
		bar.agregarCliente(new Cliente("Diego",25));
		bar.agregarCliente(new Cliente("Camila",21));
		bar.agregarCliente(new Cliente("Martin",30));
		bar.agregarCliente(new Cliente("Gabriela",25));
		bar.agregarCliente(new Cliente("Nacho",38));
	}
	
	@Test
	public void queLosClientesEstenOrdenadosAlfabeticamente(){
		Bar bar = new Bar();
		bar.agregarCliente(new Cliente("Oscar", 40));	
		bar.agregarCliente(new Cliente("Ruben", 21));
		bar.agregarCliente(new Cliente("Estela", 35));
		bar.agregarCliente(new Cliente("Marcos", 29));
		
		assertEquals("Estela",bar.getClientes().first().getNombre());
		assertEquals("Ruben",bar.getClientes().last().getNombre());
	}
	
	@Test
	public void compararClientesIguales(){
		Cliente cliente1 = new Cliente("Diego", 25);	
		Cliente cliente2 = new Cliente("Diego", 25);
		assertEquals(0,cliente1.compareTo(cliente2));
	}
	
	@Test
	
	public void compararClientesDiferentes(){
		Cliente cliente1 = new Cliente("Diego", 25);	
		Cliente cliente2 = new Cliente("Camila", 21);
		assertNotEquals(0,cliente1.compareTo(cliente2));
	}
	
	@Test
	public void agregarClientesConElMismoNombre(){
		Bar bar = new Bar();
		bar.agregarCliente(new Cliente("Diego", 25));
		bar.agregarCliente(new Cliente("Diego", 20));	
		bar.agregarCliente(new Cliente("Camila", 24));
		
		Integer esperado=2;
		assertEquals(esperado, bar.getClientes().size(),0.01);
	}
	
	@Test
	public void ClientesOrdenadosPorEdad(){		
		CompararPorEdad comparadorNuevo = new CompararPorEdad();
		Bar bar = new Bar();
		
		bar.agregarCliente(new Cliente("Diego", 25));
		bar.agregarCliente(new Cliente("Camila", 21));	
		bar.agregarCliente(new Cliente("Micaela", 24));	
		bar.agregarCliente(new Cliente("Rodirgo", 22));	
		
		TreeSet<Cliente> clientesOrdenandosPorEdad = new TreeSet <Cliente>(comparadorNuevo);
		clientesOrdenandosPorEdad.addAll(bar.getClientes());
		bar.setClientes(clientesOrdenandosPorEdad);
		
		assertEquals("Camila", bar.getClientes().first().getNombre());
		assertEquals("Diego", bar.getClientes().last().getNombre());
	}
	
}
