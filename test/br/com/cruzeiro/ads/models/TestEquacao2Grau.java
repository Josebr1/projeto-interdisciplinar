package br.com.cruzeiro.ads.models;
import static org.junit.Assert.*;

import org.junit.Test;

import br.com.cruzeiro.ads.controllers.Equacao2GrauController;

public class TestEquacao2Grau {

	@Test
	public void delta() {
		assertEquals(1, new Equacao2GrauController(1, -5, 6).delta(), 0.0f);
	}
	
	@Test
	public void x1() {
		assertEquals(3, new Equacao2GrauController(1, -5, 6).calcularX1(), 0.0f);
	}
	
	@Test
	public void x2() {
		assertEquals(2, new Equacao2GrauController(1, -5, 6).calcularX2(), 0.0f);
	}
	
	@Test
	public void temRaize() {
		assertTrue(new Equacao2GrauController(1, -5, 6).temRaizes());
	}
	
	@Test
	public void naoTemRaizes() {
		assertFalse(new Equacao2GrauController(20, 20, 20).temRaizes());
	}

}
