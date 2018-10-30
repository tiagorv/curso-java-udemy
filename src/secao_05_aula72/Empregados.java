package secao_05_aula72;

public class Empregados {
	
	private Integer codigo;
	private String nome;
	private Double salario;
	
	public Empregados(Integer codigo, String nome, Double salario){
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Integer getCodigo(){
		return this.codigo;
	}
	
	public void aumentaSalario(Double percentual){
		this.salario += this.salario * (percentual / 100);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Código: " + this.codigo + " , Nome: " + this.nome + " , Salário: " +this.salario; 
	}

}
