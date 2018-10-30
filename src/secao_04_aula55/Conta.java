package secao_04_aula55;

public class Conta {
	
	private String numero;
	private String cliente;
	private double saldo;
	private static final double valorTaxa = 5.00;  
	
	public Conta(String numero, String cliente, double msaldo) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = msaldo;
		System.out.println("this.saldo: " + this.saldo);
		System.out.println("msaldo: " + msaldo);		
	}
	
	public Conta(String numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}

	public String getNumero() {
		return numero;
	}

	public String getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void deposito(double valorDeposito){
		this.saldo += valorDeposito;
	}
	
	public void saque(double valorSaque){
		this.saldo -= valorSaque;
		this.saldo -= valorTaxa;
	}
	
	@Override
	public String toString() {
		return "Account: " + 
				this.numero +
				", Holder: " +
				this.cliente +
				", Balance: $: " +
				this.saldo;
	}
}
