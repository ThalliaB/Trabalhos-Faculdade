package empresa;

public class Main {

	public static void main(String[] args) {
		Nota mario = new Nota();
		mario.setNota1(9);
		mario.setNota2(8);
		mario.setFaltas(5);
		
		mario.resultado();
		
		mario.setNota1(2);
		mario.setFaltas(10);
		
		mario.resultado();
	}
	
}
