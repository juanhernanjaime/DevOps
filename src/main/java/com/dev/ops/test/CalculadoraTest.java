package com.dev.ops.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dev.ops.service.Calculadora;

public class CalculadoraTest {

	@Autowired
	Calculadora calculadora;

	@Test
	public void calculadoraTest() {
		if (this.calculadora == null) {
			System.out.println("prendiendo la calculadora");
			this.calculadora = new Calculadora();
		}
		assertEquals(calculadora.sumar(4, 2), 6);
		assertEquals(calculadora.restar(4, 2), 2);
		assertEquals(calculadora.multiplicar(4, 2), 8);
		assertEquals(calculadora.dividir(4, 2), 2);
	}

}
