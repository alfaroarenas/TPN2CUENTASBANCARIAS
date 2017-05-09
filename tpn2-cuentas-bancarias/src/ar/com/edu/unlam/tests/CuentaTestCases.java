package ar.com.edu.unlam.tests;

import org.junit.Test;

import ar.com.edu.unlam.cuentas.CajaDeAhorros;
import ar.com.edu.unlam.cuentas.CuentaSueldo;

public class CuentaTestCases {

	
	@Test
	public void extraerCuentaSueldo(){
		CuentaSueldo cuentaSueldo = new CuentaSueldo(5000.0);
		cuentaSueldo.extraer(2000.0);
		System.out.println(cuentaSueldo.getDinero());
	}
	
	@Test
	public void extraerDeCajaDeAhorro(){
		CajaDeAhorros cajaDeAhorro = new CajaDeAhorros(12000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);
		cajaDeAhorro.extraccionDeCajaDeAhorros(1000.0);
		System.out.println(cajaDeAhorro.getDinero());
	}
	
	
}
