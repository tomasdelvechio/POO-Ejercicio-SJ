package ar.edu.unlu.ejercicio2;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		FiguraGeometrica circulo = new Circulo(2);
		FiguraGeometrica rectangulo = new Rectangulo(2,4);
		FiguraGeometrica cuadrado = new Cuadrado(2);
		FiguraGeometrica triangulo = new Triangulo(4,2);
		FiguraGeometrica3D esfera = new Esfera(2);
		FiguraGeometrica3D cubo = new Cubo(4);
		FiguraGeometrica3D paralelopipedo = new Paralelopipedo(1,2,3);
		FiguraGeometrica3D tetraedro = new Tetraedro(4);
		
		LinkedList<FiguraGeometrica> figuras = new LinkedList<FiguraGeometrica>();
		
		figuras.add(circulo);
		figuras.add(rectangulo);
		figuras.add(cuadrado);
		figuras.add(triangulo);
		figuras.add(esfera);
		figuras.add(cubo);
		figuras.add(paralelopipedo);
		figuras.add(tetraedro);
		
		
		System.out.println("area de figuras 2D");
		for(FiguraGeometrica figura : figuras) {
			if(figura instanceof FiguraGeometrica2D) {
				if(figura instanceof Circulo) {
					System.out.print("area de circulo: ");
				} else if(figura instanceof Cuadrado) {
					System.out.print("area de cuadrado: ");
				} if(figura instanceof Triangulo) {
					System.out.print("area de triangulo: ");
				}if(figura instanceof Rectangulo) {
					System.out.print("area de rectangulo: ");
				}
				System.out.println(figura.getArea());	
			}
		}
		System.out.println("------------------------------------------");
		
		System.out.println("area de figuras 3D");
		for(FiguraGeometrica figura : figuras) {
			if(figura instanceof FiguraGeometrica3D) {
				if(figura instanceof Cubo) {
					System.out.print("area de cubo: ");
				} else if(figura instanceof Paralelopipedo) {
					System.out.print("area de paralelopipedo: ");
				} if(figura instanceof Esfera) {
					System.out.print("area de esfera: ");
				}if(figura instanceof Tetraedro) {
					System.out.print("area de tetraedro: ");
				}
				System.out.println("Area: "+  figura.getArea());	
			}
		}
		
        LinkedList<FiguraGeometrica3D> figuras2 = new LinkedList<FiguraGeometrica3D>();

        figuras2.add(esfera);
        figuras2.add(paralelopipedo);
        figuras2.add(cubo);
        figuras2.add(tetraedro);
		System.out.println("volumen de figuras 3D");
        for (FiguraGeometrica3D figura : figuras2) {
            if(figura instanceof Cubo) {
				System.out.print("area de cubo: ");
			} else if(figura instanceof Paralelopipedo) {
				System.out.print("area de paralelopipedo: ");
			} if(figura instanceof Esfera) {
				System.out.print("area de esfera: ");
			}if(figura instanceof Tetraedro) {
				System.out.print("area de tetraedro: ");
			}
            System.out.println("Volumen: " + figura.getVolumen());
        }
		
	}

}
