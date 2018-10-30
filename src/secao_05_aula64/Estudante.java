package secao_05_aula64;

public class Estudante {
	
	private String nome;
	private String email;
	
	public Estudante(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + ", " + this.email;
	}
}
