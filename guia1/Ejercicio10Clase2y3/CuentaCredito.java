package Ejercicio10Clase2y3;

import java.util.LinkedList;
import java.util.Queue;

public class CuentaCredito {

	private int idCliente;
	private double limiteDeGasto;
	private Queue<Compra> compras = new LinkedList<>();
	private double saldoDeudor;
	
	public CuentaCredito(int idCliente, double limiteDeGasto) {
		
		this.idCliente = idCliente;
		this.limiteDeGasto = limiteDeGasto;
		this.saldoDeudor = 0.0;
		
	}

	public int getIdCliente() {
		return idCliente;
	}

	public double getLimiteDeGasto() {
		return limiteDeGasto;
	}

	public Queue<Compra> getCompras() {
		return compras;
	}

	public double getSaldoDeudor() {
		return saldoDeudor;
	}
	
	public double getSaldoDisponible() {
		
		return this.getLimiteDeGasto() - this.getSaldoDeudor();
		
	}
	
	//COMPRAR
	public Errores descargarSaldo(double monto) {
		
		if (monto <= this.limiteDeGasto) {
			this.limiteDeGasto -= monto;
			this.saldoDeudor += monto;
			Compra compra = new Compra(monto);
			compras.add(compra);
			return Errores.OK;
		} else {
			return Errores.SALDOINSUFICIENTE;
		}
		
	}
	
	//PAGAR
	public Errores cargarSaldo(double monto) {
		
		if (monto <= this.getSaldoDeudor()) {
			this.limiteDeGasto += monto;
			this.saldoDeudor -= monto;
			for (Compra compra : compras) {
				if (monto >= compra.getPrecioCompra()) {
					monto -= compra.getPrecioCompra();
					compras.remove();
				} else {
					compra.setPrecioCompra(compra.getPrecioCompra() - monto);
					monto = 0.0;
				}
			}
			return Errores.OK;
		} else {
			return Errores.SALDOINSUFICIENTE;	
		}
		
	}
	
	public String retornarDatos() {
		return "saldo disponible : \n"+ this.getSaldoDisponible()+ "\n saldo deudor: \n"+this.getSaldoDeudor();
	}

}
