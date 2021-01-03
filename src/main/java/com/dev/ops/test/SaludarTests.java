package com.dev.ops.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dev.ops.service.Saludar;

public class SaludarTests {

	@Test
	public void contextLoads() {
		assertEquals("Hello World", new Saludar().say());
	}

}
