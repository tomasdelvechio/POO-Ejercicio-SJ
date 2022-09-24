package Ejercicio3Clase2y3;

import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Scanner;


public class ejercicio3Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;
        System.out.println("Ingrese la longitud de la contraseña");
        longitud = sc.nextInt();
        Password password = new Password(longitud);
        List<String> clavesGeneradas = new LinkedList<String>();
        clavesGeneradas = password.generarClave();
        System.out.println("La clave generada es: " + password.getClave());
        System.out.println("");
        for(String contrasenia :clavesGeneradas) {
            if (password.determinarSeguridadClave(contrasenia) == true) {
                System.out.println("<" + contrasenia + "> - Fuerte");
            } else {
                System.out.println("<" + contrasenia + "> - Debil");
            }
        }


	}


}
