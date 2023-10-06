package service;

/*

	Clase CuentaMovimientos
	Clase que hereda CuentaLimite. Incopora un nuevo método obtenerMovimientos
	que devolverá un ArraList con los movimientos realizados
	en la cuenta
	Cada movimiento se define por: cantidad, fechaHora, tipo (ingreso o extracción)
	
*/
	

public class CuentaMovimientos extends CuentaLimite {
	
	//constructor
	public CuentaMovimientos(String codigoCuenta, double saldo, double limite, String tipo) {
		super(codigoCuenta, saldo, limite);
		
		
		
		// TODO Auto-generated constructor stub
	}


	
	
	

}
