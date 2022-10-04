package ar.edu.unlu.parcial.GTA;

public class Carl extends Ciudadano {

	@Override
	protected double calcularCapital() {
		double capital = 0;
		for(Propiedad propiedades : this.getPropiedades()) {
			capital += propiedades.getPrecio()*0.8;
		}
		return capital;
	}

	public Propiedad buscarAuto() {
		return this.getPropiedades().get((int)(Math.random()*this.getPropiedades().size()));
	}
	
	public void cobrarDinero(double monto, Auto auto) {
		this.getPropiedades().remove(auto);
	}
	
	@Override
	protected void agregarPropiedad(Propiedad propiedad) {
		if(propiedad instanceof Auto) {
			propiedades.add(propiedad);			
		}
	}
	
	public Propiedad buscarAuto(int asientos, String color, String marca) {
		for(Propiedad propiedad : this.getPropiedades()) {
			if(((Auto)propiedad).getCantAsientos() == asientos && ((Auto)propiedad).getColor().equals(color) && ((Auto)propiedad).getMarca().equals(marca)) {
				return propiedad;
			}
		}
		return null;
	}
}
