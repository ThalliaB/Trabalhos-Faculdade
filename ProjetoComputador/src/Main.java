
public class Main {
	public static void main(String[] args) {
		Desktop compA = new Desktop(8,4,600);
		Notbook compB = new Notbook(8, 4, 15);
		
		Computador comp;
		
		comp = compA;
		System.out.println("Valor:" + comp.calculaValor());
		System.out.println("-------------");
		comp = compB;
		System.out.println("Valor:" + comp.calculaValor());
	}
}
