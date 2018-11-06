package secao_08_aula100;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private Date momento;
	private Status statusPedido;
	private Cliente cliente;
	
	private List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido(){
		
	}

	public Pedido(Date momento, Status statusPedido, Cliente cliente, List<ItemPedido> itens) {
		this.momento = momento;
		this.statusPedido = statusPedido;
		this.cliente = cliente;
		this.itens = itens;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public Status getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(Status statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItem(ItemPedido item){
		this.itens.add(item);
	}
	
	public void removeItem(ItemPedido item){
		this.itens.remove(item);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		StringBuilder sb = new StringBuilder();
		sb.append("Data/Hora: ").append(sdf.format(this.momento) + "\n");
		sb.append("Status : " + statusPedido.toString() + "\n");
		sb.append(cliente);
		
		double soma = 0;
		for (ItemPedido itemPedido : itens) {
			soma += itemPedido.getTotal();
			sb.append(itemPedido + "\n");
		}
		sb.append("Total: " + soma);
		
		return sb.toString();
	}
}
