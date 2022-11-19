
public class Main {

	public static void main(String[] args) {
		LivroDigital ld = new LivroDigital("Persuasão", new Autor("Jane Austen", "Brasileira", "jane@gmail.com"), "Romance",
				5, 10000, 3500);
		
		ld.Info();
	}
	
}
