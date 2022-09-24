package Ejercicio3Clase2y3;
import java.util.LinkedList;
import java.util.List;

public class Password {
	private String clave;
	private int longuitud;
	
	public Password (int longuitud){
		this.longuitud = longuitud;
		this.generarClave();
	}
	
	public int getLonguitud() {
		return longuitud;
	}
	
	public Boolean determinarSeguridadClave(String clavePrueba) {

        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        Boolean respuesta;
        for (char caracter: clavePrueba.toCharArray ()) {
            if (Character.isUpperCase(caracter)){
                mayusculas ++;
            }
            if (Character.isLowerCase(caracter)){
                minusculas ++;
            }
            if (Character.isDigit(caracter)){
                numeros ++;
            }
        }

        if ((mayusculas > 2) && (minusculas > 1) && (numeros >= 2)) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;

    }

    public LinkedList<String> generarClave() {

        String[] valoresPosibles = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        List<String> clavesGeneradas = new LinkedList<String>();
        String clavePrueba = new String();
        int n;
        do {
            clavePrueba = "";
            for (int i = 0; i < this.getLonguitud(); i++) {
                n = (int)(Math.random()*60);
                clavePrueba += valoresPosibles[n];
            }
            clavesGeneradas.add(clavePrueba);
        } while(this.determinarSeguridadClave(clavePrueba) == false);
        this.setClave(clavePrueba);
        return (LinkedList<String>) clavesGeneradas;

    }

	private void setClave(String clave) {
		this.clave = clave;
	}

	public String getClave() {

		return this.clave;
	}

	
	
}
