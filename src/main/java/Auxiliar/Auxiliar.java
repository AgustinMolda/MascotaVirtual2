package Auxiliar;

public class Auxiliar {
	private int cantidad;
	private String nombreObjeto;
	
	public void getObjeto() {
		this.nombreObjeto = "Espada";
		this.cantidad = 1;
		System.out.println("Has obtenido: "+nombreObjeto + " y su cantidad actual es: "+ cantidad);
		
	}
	
	public void looseObjeto() {
			this.nombreObjeto ="";
			this.cantidad = cantidad--;
			System.out.println("Has perdido: "+nombreObjeto + " y su cantidad actual es: "+ cantidad);
		
	}
}
