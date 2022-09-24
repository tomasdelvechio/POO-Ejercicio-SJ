package Ejercicio10Clase2y3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
	
	private int idCliente;
	private CuentaNormal cuentaNormal;
	private CuentaCredito cuentaCredito;
	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public CuentaNormal getCuentaNormal() {
		return cuentaNormal;
	}

	public void setCuentaNormal(CuentaNormal cuentaNormal) {
		this.cuentaNormal = cuentaNormal;
	}

	public CuentaCredito getCuentaCredito() {
		return cuentaCredito;
	}

	public void setCuentaCredito(CuentaCredito cuentaCredito) {
		this.cuentaCredito = cuentaCredito;
	}

	public Cliente(int idCliente){
		this.idCliente = idCliente;
	}
	
	public void crearCuentaNormal(double limiteDeGiro) {
		this.cuentaNormal = new CuentaNormal(this.getIdCliente(),limiteDeGiro);
	}
	
	public void crearCuentaCredito(double limiteDeGasto) {
		this.cuentaCredito = new CuentaCredito(this.getIdCliente(),limiteDeGasto);
	}
	
	public Errores comprarCuentaNormal(double monto) {
		return this.getCuentaNormal().descontarSaldo(monto);
	}
	
	public Errores cargarSaldoCuentaNormal(double monto) {
		return this.getCuentaNormal().cargarSaldo(monto);
	}
	
	public Errores invertir(double monto, String fecha){	
		LocalDate fechaDada = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy") );
		return this.getCuentaNormal().invertir(monto, fechaDada);
	}
	
	public Errores recogerInversion() {
		return this.getCuentaNormal().retirarInversion();
	}
	
	public Errores comprarCuentaCredito(double monto) {
		return this.getCuentaCredito().descargarSaldo(monto);
	}
	
	public Errores pagarDeudasCredito(double monto) {
		return this.getCuentaCredito().cargarSaldo(monto);
	}
	
	public String getDatosCuenta() {
		return this.getCuentaNormal().retornarDatosCuenta() + "\n" + this.getCuentaCredito().retornarDatos();
	}
	
	
}
