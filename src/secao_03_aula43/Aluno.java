package secao_03_aula43;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal(){
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public String resultado(){
		String resultado = "";
		if (this.notaFinal() < 60){
			resultado = "FAILED \nMissing: " + 
							String.format("%.2f", 60 - this.notaFinal()) +
							" POINTS";
		}else{
			resultado = "PASS";			
		}
		return resultado;
	}
}
