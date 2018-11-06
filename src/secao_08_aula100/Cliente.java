package secao_08_aula100;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private String nome;
	private String email;
	private Date dataNiver;
	
	public Cliente(){
	}

	public Cliente(String nome, String email, Date dataNiver) {
		this.nome = nome;
		this.email = email;
		this.dataNiver = dataNiver;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNiver() {
		return dataNiver;
	}

	public void setDataNiver(Date dataNiver) {
		this.dataNiver = dataNiver;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Cliente: " + this.nome + "\n");
		sb.append("E-mail: " + this.email + "\n");
		sb.append("Data Niver: " + sdf.format(this.dataNiver) + "\n");
		
		return sb.toString();
	}
}
