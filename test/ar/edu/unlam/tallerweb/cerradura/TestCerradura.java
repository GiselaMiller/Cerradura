package ar.edu.unlam.tallerweb.cerradura;

import org.junit.Assert;
import org.junit.Test;

public class TestCerradura {

	@Test
	public void testPasarCodigoCorrectoAbroCerradura() {
		Cerradura miCerradura = new Cerradura(1234,2);
		Assert.assertTrue(miCerradura.abrir(1234));
	}
	@Test
	public void testPasarCodigoErroneoNoAbroCerradura() {
		Cerradura miCerradura = new Cerradura(4321,2);
		Assert.assertFalse(miCerradura.abrir(1234));
	}
	
	@Test
	public void testPasarCantidadFallosBloqueo(){
		Cerradura miCerradura = new Cerradura(1234,3);
		miCerradura.abrir(7894);
		miCerradura.abrir(7895);
		miCerradura.abrir(7896);
		miCerradura.abrir(7897);
		Assert.assertTrue(miCerradura.fueBloqueada());		
	}
	@ Test
	public void testPasarCantidadFallosNoBloqueo(){
		Cerradura miCerradura = new Cerradura(1234,3);
		miCerradura.abrir(7894);
		miCerradura.abrir(7895);
		Assert.assertFalse(miCerradura.fueBloqueada());
	}

}
