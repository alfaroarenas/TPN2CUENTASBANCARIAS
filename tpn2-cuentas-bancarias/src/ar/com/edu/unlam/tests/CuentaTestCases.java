package ar.com.edu.unlam.tests;

import org.junit.Assert;
import org.junit.Test;

import ar.com.edu.unlam.cuentas.CajaDeAhorros;
import ar.com.edu.unlam.cuentas.CuentaCorriente;
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
	public void extraerDeCajaDeAhorroConCostoAdicional(){
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
	
	@Test
	public void extraerDeCajaDeAhorroSinCostoAdicional(){
		CajaDeAhorros cajaDeAhorro = new CajaDeAhorros(12000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);


		Double valorEsperado = 9000.0;
		Double valorActual = cajaDeAhorro.getDineroDisponible();
		
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void testeoDeDescubirtoSinRecargoCuentaCorriente(){
		CuentaCorriente cuentaCorriente = new CuentaCorriente(10000.0);
		cuentaCorriente.extraerDeCuentaCorriente(11000.0);
		
		Double valorEsperado = 1000.0;
		Double valorActual = cuentaCorriente.getDineroDisponible();
		
		Assert.assertEquals(valorEsperado, valorActual);
		
	}
	
	@Test
	public void testeoDeDescubirtoConRecargoCuentaCorriente(){
		CuentaCorriente cuentaCorriente = new CuentaCorriente(10000.0);
		cuentaCorriente.extraerDeCuentaCorriente(13000.0);

		Double valorEsperado = 3150.0;
		Double valorActual = cuentaCorriente.getDineroDisponible();
		
		Assert.assertEquals(valorEsperado, valorActual);
		
	}
	
}
