package ar.com.edu.unlam.cuentas;

public class CajaDeAhorros extends Cuenta{
	
	private int cantidadDeExtracciones = 0;
	private final Double COSTO_ADICIONAL = 6.0;
	
	public CajaDeAhorros(Double dinero) {
		super(dinero);
	}
	
	public void extraccionDeCajaDeAhorros(Double montoAExtraer){
		cantidadDeExtracciones = cantidadDeExtracciones + 1;
		this.extraer(montoAExtraer);
		if(getCantidadExtracciones() >=5){
			this.setDineroDisponible(this.getDineroDisponible() - COSTO_ADICIONAL);
			cantidadExtraccionesDefault();
		}
	}
	
	private int getCantidadExtracciones(){
		return cantidadDeExtracciones;
	}
	
	private void cantidadExtraccionesDefault(){
		cantidadDeExtracciones = 0;
	}
}
