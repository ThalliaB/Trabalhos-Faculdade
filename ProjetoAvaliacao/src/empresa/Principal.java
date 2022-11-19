package empresa;

public class Principal {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Mario", "Encanador", new Avaliacao(9, 10, 8));
		Aluno a2 = new Aluno("Luigi", "Encanador", new Avaliacao(9, 7, 8));
		
		a1.info();
		a2.info();
		
	}

}
