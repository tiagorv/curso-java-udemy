package secao_08_aula100;


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
}
