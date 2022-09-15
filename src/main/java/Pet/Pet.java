package Pet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;

import Auxiliar.Auxiliar;

public class Pet {
	private String estado;
	private int tiempo;
	private int nivel=0;
	
	public Pet() {
		this.estado =	iniciarEsado();
		saludar();
		dameSaludo();
		tomarTiempo();
			
	}
	
	
	public String iniciarEsado() {
		Random random = new Random();
		int menor = 1;
		int mayor = 4;
		
		int estadoInicial = random.nextInt(mayor + menor)+ menor;
		
		switch(estadoInicial) {
		case 1 : 
				
			return "contenta";
		
		case 2: 
			return "aburrida";
		
			
		case 3: 
			return "hambrienta";
			
		case 4: 
			return "triste";
		
		default:
			return "algo";
		}	
		
	}
	
	
	
	public String saludar() {
		Random random = new Random();
		int menor = 1;
		int mayor = 10;
		
		int estadoInicial = random.nextInt(mayor+menor) + menor;
		
		String saludo;
		
		switch (estadoInicial) {
		case 1 :
				saludo= "Buenas como va?";
			break;
		case 2 : 
			saludo = "Que onda, todo bien?";
			break;
		case 3: 
			saludo = "Que contursi?";
			break;
		case 4: 
			saludo = "Hola, como baila?";
			break;
		case 5:
			saludo = "que onda perro?";
			break;
		case 6: 
			 saludo = "Que haces gato?";
			 break;
		case 7: 
			saludo = "Hola amigo que contas?";
			break;
		case 8: 
			saludo = "Buenas en que andas?";
			break;
		case 9: 
			saludo = "Hola gente hermosa como andan?";
			break;
		case 10: 
			saludo = "Holas vienen, holas van";
		default:
			return "Hola amigazo que bueno verte";
			
		}
		return saludo;
	}
	
		public void dameSaludo() {
				System.out.println(saludar());
		}
	
	private void tomarTiempo() {
		 boolean loop = true;
			this.tiempo = 0;
			while(loop) {
			while(tiempo < 101) {
				tiempo++;
				if(tiempo>80 && this.estado.equals("aburrida")){
					
						this.estado = "contenta";
				}
				loop = false;
			}
		}	
	}

	
	public void comer() {
		if(this.estado.equals("hambrienta")) {
				this.estado= "contenta";
		}else if(this.estado.equals("contenta")){
			 this.nivel++;
		}else if(this.estado.equals("triste")) {
			if(nivel> 0) {
				nivel--;
			}
			
		}
		
		
		
	}
	
	public void quererJugar() {
		if(!this.estado.equals("hambrienta")){
			jugar();
		}
	}
	
	private void jugar() {
		if(this.estado.equals("contenta")){
				nivel+=2;
		}
		if(this.estado.equals("aburrida")){
				this.estado="contenta";
		}
		if(this.estado.equals("triste")){
				this.estado = "aburrida";
			
		}
	}
	
	

	@Override
	public String toString() {
		return "Pet [tiempo=" + tiempo + ", nivel=" + nivel + "]";
	}
	
	public String getNivel() {
			return "El nivel de la mascota es: "+nivel;
	}
	
	
	
}
