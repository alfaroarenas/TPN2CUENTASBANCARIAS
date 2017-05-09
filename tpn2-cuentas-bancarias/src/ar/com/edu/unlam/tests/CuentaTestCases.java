package ar.com.edu.unlam.tests;

import org.junit.Assert;
import org.junit.Test;

import ar.com.edu.unlam.cuentas.CajaDeAhorros;
import ar.com.edu.unlam.cuentas.CuentaSueldo;

public class CuentaTestCases {
	/**
	 * preparacion
	 * ejecucion
	 * contrastacion
	 **/
	
	@Test
	public void extraerCuentaSueldo(){
		CuentaSueldo cuentaSueldo = new CuentaSueldo(5000.0);
		cuentaSueldo.extraer(2000.0);
		
		Double valorEsperado = 3000.0;
		Double valorActual = cuentaSueldo.getDineroDisponible();
		
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void extraerDeCajaDeAhorro(){
		CajaDeAhorros cajaDeAhorro = new CajaDeAhorros(12000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);

		Double valorEsperado = 5994.0;
		Double valorActual = cajaDeAhorro.getDineroDisponible();
		
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	
}
