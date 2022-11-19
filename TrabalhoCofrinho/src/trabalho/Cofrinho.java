package trabalho;

import java.util.ArrayList;

public class Cofrinho {
	ArrayList<Moeda> lista = new ArrayList<Moeda>();//importando arrayList para a lista de moedas
	
	
	//métodos recebendo o objeto 
	public void adicionar(Moeda m) {
		lista.add(m);
	}
	
	public void remover(Moeda m) {
		lista.remove(m);
	}
	
	public void listar() {
		for(Moeda m : lista) {
			System.out.println(m);
		}
	}
	
	//fazendo a soma dos valores e apresentando na tela
	public void total() {
		double total = 0;
		double valor = 0;
		for(Moeda m : lista) {
			valor = m.converter();
			total += valor;
		}
		System.out.println(total);
	}
	
}
