package secao_08_aula100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as informações do cliente:");
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.print("E-mail: ");
		String email = sc.next();
		System.out.print("Data de Nascimento (DD/MM/YYYY): ");
		Date dataNiver = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataNiver);
		
		System.out.println("Informe os dados do Pedido");
		System.out.print("Status: ");
		Status status = Status.valueOf(sc.next());
		System.out.print("Quantos produtos no Pedidos: ");
		int totalProdutos = sc.nextInt();
		
		Date dataAtual = new Date();
		
		List<ItemPedido> itens = new ArrayList<>();
		for (int i = 1; i <= totalProdutos; i++ ){
			System.out.println("Informe item # " + i + " do Pedido");
			System.out.print("Produto: ");
			String nomeProduto = sc.next();
			System.out.print("Valor: ");
			double valor = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			Produto produto = new Produto(nomeProduto, valor);
			ItemPedido itemPedido = new ItemPedido(quantidade, valor, produto);
			itens.add(itemPedido);
		}
		
		Pedido pedido = new Pedido(dataAtual, status, cliente, itens);
		
		System.out.println("-----Dados do Pedido-----");
		System.out.println(pedido);
		
		
		
		sc.close();
	}
}
