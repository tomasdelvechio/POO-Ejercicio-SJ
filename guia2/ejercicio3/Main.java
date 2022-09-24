package ar.edu.unlu.ejercicio3;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		
		Empleado asalariado = new Asalariado("1111", "12.12", "sebastian", "juarez", "30-01-1999", 100);
		
		LinkedList<Venta> ventas= new LinkedList<Venta>();
		Venta venta1 = new Venta("remera","24-09-2022",100);
		Venta venta2 = new Venta("remera","24-09-2022",200);
		Venta venta3 = new Venta("remera","24-09-2022",300);
		ventas.add(venta1);
		ventas.add(venta2);
		ventas.add(venta3);
		
		Empleado empleadoPorComision = new EmpleadoPorComision("1111", "12.12", "matias", "cosentino", "08-03-2001",0.5,ventas);
		Empleado empleadoPorComisionConSalarioFijo = new EmpleadoPorComisionConSalarioFijo("1111", "12.12", "sebastian", "juarez", "30-01-1999",0.5,ventas,10000);
		Empleado empleadoPorHora = new EmpleadoPorHora("1111", "12.12", "diego", "milito", "30-01-1999",10,35);
		Empleado empleadoPorHora2 = new EmpleadoPorHora("1111", "12.12", "diego", "milito", "30-01-1999",10,45);
		Empleado pasante = new Pasante("1111", "12.12", "sebastian", "juarez", "30-01-1999");

		LinkedList<Empleado> empleados = new LinkedList<Empleado>();
		empleados.add(asalariado);
		empleados.add(empleadoPorComision);
		empleados.add(empleadoPorComisionConSalarioFijo);
		empleados.add(empleadoPorHora);
		empleados.add(empleadoPorHora2);
		empleados.add(pasante);
		
        System.out.println("Salario sin cumpleaños ---------------------");
		
		for(Empleado e : empleados) {
			System.out.println("Salario: "+ e.getSalario());
		}
		
		
		LinkedList<Empleado> empleadosa = new LinkedList<Empleado>();
        Empleado asalariadoa = new Asalariado("1111", "12.12", "Sebastian", "Juarez", "30-09-1999", 100);
        Empleado porComisiona = new EmpleadoPorComision("2222", "12.12", "Matias", "Cosentino", "08-09-2001", 0.5,ventas);
        Empleado porComisionConSalarioa = new EmpleadoPorComisionConSalarioFijo("2222", "12.12", "Matias", "Cosentino", "08-09-2001", 0.5, ventas, 10000);
        Empleado porHoraa = new EmpleadoPorHora("1111", "12.12", "Diego", "Milito", "30-09-1999", 10, 35);
        Empleado porHora2a = new EmpleadoPorHora("1111", "12.12", "Diego", "Milito", "30-09-1999", 10, 45);
        Empleado pasantea = new Pasante("1111", "12.12", "Sebastian", "Juarez", "30-09-1999");

        empleadosa.add(asalariadoa);
        empleadosa.add(porComisiona);
        empleadosa.add(porComisionConSalarioa);
        empleadosa.add(porHoraa);
        empleadosa.add(porHora2a);
        empleadosa.add(pasantea);

        
        System.out.println("Salario con cumpleaños ---------------------");      
        for (Empleado e : empleadosa) {
            System.out.println("Salario: " + e.getSalario());
        }
		
	}

}
