package secao_08_aula100;

public class ItemPedido {
	
	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	public ItemPedido(){
		
	}

	public ItemPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double getTotal(){
		return this.getQuantidade() * this.getPreco();
	}
	
	@Override
	public String toString() {
		return this.produto + ",R$: " + this.preco + ", Quantidade: " + this.quantidade + 
			" SubTotal R$: " + this.getTotal();
	}
	
}
