package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Digite o Peso seguido da altura");
		
		int peso;
		double altura;
		
		Scanner teclado = new Scanner(System.in); //ctrl + Shift + o para importar
		
		peso = teclado.nextInt();
		altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.printf("IMC: %.2f ", imc);
	}

}
