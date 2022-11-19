package empresa;

public class Nota {

	private double nota1;
	private double nota2;
	private int faltas;
	
	public void setNota1(double nota) {
		if(nota<0 || nota >10) {
			System.out.println("Nota inválida");
		}
		nota1 = nota;
	}
	
	public void setNota2(double nota) {
		if(nota<0 || nota >10) {
			System.out.println("Nota inválida");
		}
		nota2 = nota;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	
	
	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public void resultado() {
		
		double media = (nota1 + nota2) / 2;
		
		if(media < 4) {
			System.out.println("Reprovado");
		}else if(media < 7) {
			System.out.println("Exame final");
		}else {
			System.out.println("Aprovado");
		}
	}
	
	
}
