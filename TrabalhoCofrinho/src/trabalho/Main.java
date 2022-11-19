package trabalho;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		
		int opcao;
		
		System.out.println("Menu");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar as moedas guardadas");
		System.out.println("4 - Total das moedas em real");
		opcao = teclado.nextInt();
		
		int escolha;
		double valor;
		Moeda moeda;
		
		while(opcao!=0) {
			switch (opcao) {
			
			case 1: 
				escolha = 0;
				while(escolha>3||escolha<=0) {
					System.out.println("Qual tipo de moeda deseja adicionar?");
					System.out.println("1 - Dolar");
					System.out.println("2 - Euro");
					System.out.println("3 - Real");
					escolha = teclado.nextInt();
				}
				System.out.println("Digite o valor:");
				valor = teclado.nextDouble();
				if(escolha==1) {
					moeda = new Dolar(valor);
				}else if(escolha==2) {
					moeda = new Euro(valor);
				}else {
					moeda = new Real(valor);
				}
				
				cofrinho.adicionar(moeda);
				break;
				
				
			case 2:
				escolha = 0;
				while(escolha>3||escolha<=0) {
					System.out.println("Qual tipo de moeda deseja remover?");
					System.out.println("1 - Dolar");
					System.out.println("2 - Euro");
					System.out.println("3 - Real");
					escolha = teclado.nextInt();
				}
				System.out.println("Digite o valor:");
				valor = teclado.nextDouble();
				if(escolha==1) {
					moeda = new Dolar(valor);
				}else if(escolha==2) {
					moeda = new Euro(valor);
				}else {
					moeda = new Real(valor);
				}
				
				cofrinho.remover(moeda);
				break;
			case 3:
				cofrinho.listar();
				break;
			case 4:
				cofrinho.total();
				break;
			default:
				System.out.println("Opcao Invalida");
			}
		
			System.out.println("Menu");
			System.out.println("1 - Adicionar");
			System.out.println("2 - Remover");
			System.out.println("3 - Listar as moedas guardadas");
			System.out.println("4 - Total das moedas em real");
			opcao = teclado.nextInt();
			
		}
	}
	
}
