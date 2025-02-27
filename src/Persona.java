
public class Persona {
	float peso;
	float altura;
	
	public Persona(float peso,float altura){
		this.altura = altura;
		this.peso = peso;
	}
	
	public void calcularIMC() {
		float IMC = peso / (altura*altura);
		
		if(IMC<18.5) {
			System.out.println("Tu IMC es 17.3. Estás por debajo del peso normal.¡Consulta con un médico!");
		}
		else if(IMC<24.9) {
			System.out.println("Tu IMC es 22.5. Tienes un peso saludable. ¡Buen trabajo!");
		}
		else {
			System.out.println("Tu IMC es 28.9. Tienes sobrepeso. ¡Cuida tu salud!");
		}
		
		
	}

}
