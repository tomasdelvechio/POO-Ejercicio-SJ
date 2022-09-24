package Ejercicio10Clase2y3;

import java.time.LocalDate;


public class CuentaNormal {
	private double giroEnDescubierto;
	private double limiteDeGiro;
	private double saldoCuenta;
	private Boolean retiro;
	private LocalDate fechaDevolucionInversion;
	private LocalDate fechaDeInversion;
	private double saldoInvertido;
	private double montoTotal;
	private int idCliente;

	public CuentaNormal(int idCliente, double limiteDeGiro) {
		
		this.idCliente = idCliente;
		this.limiteDeGiro = limiteDeGiro;
		this.giroEnDescubierto = limiteDeGiro;
		this.saldoCuenta = 0.0;
		this.montoTotal = this.getMontoTotal();
		this.fechaDevolucionInversion = LocalDate.MIN;
		this.retiro = true;
		
	}

	public double getLimiteDeGiro() {
		return giroEnDescubierto;
	}

	public double getSaldoCuenta() {
		return saldoCuenta;
	}

	public LocalDate getFechaDevolucionInversion() {
		return fechaDevolucionInversion;
	}

	public double getSaldoInvertido() {
		return saldoInvertido;
	}

	public double getGiroEnDescubierto() {
		return giroEnDescubierto;
	}

	public double getMontoTotal() {
		
		return this.getLimiteDeGiro() + this.getSaldoCuenta();
		
	}

	public int getIdCliente() {
		return idCliente;
	}
	
	public Errores cargarSaldo(double saldo) {
		
		if (saldo > 0) {
			if ((this.getSaldoCuenta() == 0.0) && (this.getGiroEnDescubierto() >= saldo))  {
				this.giroEnDescubierto += saldo;
				return Errores.OK;
			} else if ((this.getSaldoCuenta() == 0.0) && (this.getGiroEnDescubierto() < saldo)) {
				saldo -= this.getGiroEnDescubierto();
				this.giroEnDescubierto = this.getLimiteDeGiro();
				this.saldoCuenta += saldo;
				return Errores.OK;
			} else {
				this.saldoCuenta += saldo;
				return Errores.OK;
			}
		} else {
			return Errores.INGRESOINVALIDO;
		}
		
	}
	
	public Errores descontarSaldo(double monto) {
		
		if (this.getSaldoCuenta() >= monto) {
			this.saldoCuenta -= monto;
			return Errores.OK;
		} else if ((this.getSaldoCuenta() < monto) && (this.getMontoTotal() >= monto)) {
			monto = monto - this.getSaldoCuenta();
			this.saldoCuenta = 0.0;
			this.giroEnDescubierto = this.getGiroEnDescubierto() - monto;
			return Errores.INGRESANDOLIMITEDEGIRO;
		} else {
			return Errores.SALDOINSUFICIENTE;
		}
		
	}
	
	public Errores invertir(double monto, LocalDate fechaRetorno) {
		
		if (this.getSaldoCuenta() >= monto) {
			if (this.retiro = true) {
				this.fechaDevolucionInversion = fechaRetorno;
				this.saldoInvertido = monto;
				this.saldoCuenta -= monto;
				this.retiro = false;
				this.fechaDeInversion = LocalDate.now();
				return Errores.OK;
			} else {
				return Errores.YA_INVIRTIO;
			}
		} else {
			return Errores.SALDOINSUFICIENTE;
		}
	}
		
	public Errores retirarInversion() {
		
		if (this.getFechaDevolucionInversion().isBefore(LocalDate.now())) {
			this.saldoCuenta += this.getSaldoInvertido() + (this.getSaldoInvertido() * 0.4);
			this.retiro = true;
			this.saldoInvertido = 0;
			return Errores.OK;
		} else {
			return Errores.YA_INVIRTIO;
		}
	}
	

	public String retornarDatosCuenta() {
		return ("Saldo de la cuenta: \n "+this.getSaldoCuenta() + "\n" + "limite de giro en descubierto: \n"+ this.getGiroEnDescubierto()
		+"\n"+"saldo invertido: \n" + this.getSaldoInvertido());
	}
		

}