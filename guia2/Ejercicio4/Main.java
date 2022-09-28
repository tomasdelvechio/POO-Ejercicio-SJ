package ar.edu.unlu.ejercicio4;

public class Main {

	public static void main(String[] args) {

		Agencia agencia = new Agencia();
		Vehiculo auto = new Auto("ABC", 4);
		Vehiculo autoVIP = new AutoVIP("DEF", 4);
		Vehiculo camion = new Camion("PatenteCamion");
		Vehiculo combi = new Combi("PatenteCombi");
		Vehiculo flete = new Flete("PatenteFlete", 150.0);
		
		agencia.registrarVehiculo(auto);
		agencia.registrarVehiculo(autoVIP);
		agencia.registrarVehiculo(camion);
		agencia.registrarVehiculo(combi);
		agencia.registrarVehiculo(flete);
		
		Cliente cliente = new Cliente(1);
		
		System.out.println("Presupuesto agencia: " + agencia.solicitarPresupuesto(10, agencia.getAuto("ABC")));
		System.out.println("Presupuesto agencia: " + agencia.solicitarPresupuesto(10, agencia.getAuto("DEF")));
		System.out.println("Presupuesto agencia: " + agencia.solicitarPresupuesto(10, agencia.getAuto("PatenteCamion")));
		System.out.println("Presupuesto agencia: " + agencia.solicitarPresupuesto(10, agencia.getAuto("PatenteCombi")));
		System.out.println("Presupuesto agencia: " + agencia.solicitarPresupuesto(10, agencia.getAuto("PatenteFlete")));
		System.out.println("Presupuesto agencia: " + agencia.solicitarPresupuesto(10, agencia.getAuto("PatenteParalisis")));
	
		System.out.println("Presupuesto agencia: " + cliente.solicitarPresupuesto(10, agencia.getAuto("ABC")));
		System.out.println("Presupuesto agencia: " + cliente.solicitarPresupuesto(10, agencia.getAuto("DEF")));
		System.out.println("Presupuesto agencia: " + cliente.solicitarPresupuesto(10, agencia.getAuto("PatenteCamion")));
		System.out.println("Presupuesto agencia: " + cliente.solicitarPresupuesto(10, agencia.getAuto("PatenteCombi")));
		System.out.println("Presupuesto agencia: " + cliente.solicitarPresupuesto(10, agencia.getAuto("PatenteFlete")));
		System.out.println("Presupuesto agencia: " + cliente.solicitarPresupuesto(10, agencia.getAuto("PatenteParalisis")));
	
		System.out.println(" ");
		System.out.println("ALQUILERES");
		System.out.println(" ");
		System.out.println("Alquilar auto: " + cliente.alquilarVehiculo(10, agencia.registrarAlquiler(auto.getPatente()), "25-09-2022", "05-10-2022"));
		System.out.println("Alquilar auto: " + cliente.alquilarVehiculo(10, agencia.registrarAlquiler(auto.getPatente()), "25-09-2022", "05-10-2022"));
		System.out.println("Alquilar auto: " + cliente.alquilarVehiculo(10, agencia.registrarAlquiler(autoVIP.getPatente()), "25-09-2022", "05-10-2022"));
		System.out.println("Alquilar auto: " + cliente.alquilarVehiculo(10, agencia.registrarAlquiler(camion.getPatente()), "25-09-2022", "05-10-2022"));
		System.out.println("Alquilar auto: " + cliente.alquilarVehiculo(10, agencia.registrarAlquiler(combi.getPatente()), "25-09-2022", "05-10-2022"));
		System.out.println("Alquilar auto: " + cliente.alquilarVehiculo(10, agencia.registrarAlquiler(flete.getPatente()), "25-09-2022", "05-10-2022"));
		System.out.println("Alquilar auto: " + cliente.alquilarVehiculo(10, agencia.registrarAlquiler("bonsai"), "25-09-2022", "05-10-2022"));
		System.out.println("");
		System.out.println("Presupuesto total cliente: " + cliente.montoTotalAlquilados());
		System.out.println("");	
		
	}

}
