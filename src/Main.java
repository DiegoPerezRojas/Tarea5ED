import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("BIENVENIDO AL PROGRAMA PARA CALCULAR EL PESO\nDime tu peso (Kilogramos)");
		float peso = scan.nextFloat();
		System.out.println("Ahora escribe tu altura (metros");
		float altura = scan.nextFloat();
		
		Persona nuevaPersona= new Persona(peso,altura);
		nuevaPersona.calcularIMC();

	}

}
