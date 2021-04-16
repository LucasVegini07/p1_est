package main;

public class Main {
	
	public static void main(String[] args) {
		
		Lanchonete lanchonete = new Lanchonete();
		
		Produto p1 = new Produto("X-salada", 1);
		Produto p2 = new Produto("X-calabresa", 2);
		Produto p3 = new Produto("X-Mignon", 3);
		Produto p4 = new Produto("X-Mignon", 4);
		
		lanchonete.addProduto(p1);
		lanchonete.addProduto(p2);
		lanchonete.addProduto(p3);
		lanchonete.addProduto(p4);
		
		Pedido pedido1 = new Pedido();
		Pedido pedido2 = new Pedido();
		Pedido pedido3 = new Pedido();
		Pedido pedido4 = new Pedido();
		
		System.out.println("Cardápio");
		System.out.println(lanchonete.menu().toString());
		
		pedido1.addProduto(p1);
		pedido1.addProduto(p1);
		pedido1.addProduto(p2);
		
		pedido2.addProduto(p2);
		pedido3.addProduto(p3);
		pedido4.addProduto(p4);
		
		lanchonete.anotarPedido(pedido1);
		lanchonete.anotarPedido(pedido2);
		lanchonete.anotarPedido(pedido3);
		lanchonete.anotarPedido(pedido4);

		lanchonete.Auxiliar();
		
		lanchonete.cozinhar();
		lanchonete.cozinhar();
		lanchonete.cozinhar();
		lanchonete.cozinhar();
		lanchonete.cozinhar();
		
		lanchonete.Auxiliar();

		
		lanchonete.isTemPedidoPronto();

		lanchonete.Auxiliar();

		
		lanchonete.pronto();
		lanchonete.pronto();
		lanchonete.pronto();

		
		
		lanchonete.Auxiliar();

		lanchonete.pronto();
		
		lanchonete.Auxiliar();
				
		lanchonete.Auxiliar();
		
		System.out.println(lanchonete.isTemPedido());
		
		lanchonete.pronto();
				
		System.out.println(lanchonete.isTemPedido());
		
		lanchonete.anotarPedido(pedido2);
		lanchonete.anotarPedido(pedido3);
		lanchonete.anotarPedido(pedido4);
		
		
		lanchonete.cozinhar();
		
		lanchonete.pronto();

		lanchonete.cozinhar();
		
		lanchonete.pronto();

		lanchonete.cozinhar();
		
		lanchonete.pronto();
		
		System.out.println("Terminou");
		
		lanchonete.pronto();
		lanchonete.pronto();
		lanchonete.pronto();
		lanchonete.pronto();
		lanchonete.pronto();
		lanchonete.pronto();

		
		lanchonete.cozinhar();
		lanchonete.cozinhar();
		lanchonete.cozinhar();
		lanchonete.cozinhar();
		lanchonete.cozinhar();
		lanchonete.cozinhar();

		
		lanchonete.isTemPedido();
		lanchonete.isTemPedido();
		lanchonete.isTemPedido();
		lanchonete.isTemPedido();
		lanchonete.isTemPedido();
		lanchonete.isTemPedido();
		lanchonete.isTemPedido();
		
		lanchonete.isTemPedidoPronto();
		lanchonete.isTemPedidoPronto();
		lanchonete.isTemPedidoPronto();
		lanchonete.isTemPedidoPronto();
		lanchonete.isTemPedidoPronto();
		lanchonete.isTemPedidoPronto();
		
		lanchonete.pronto();
		lanchonete.pronto();
		lanchonete.pronto();
		lanchonete.pronto();
		lanchonete.pronto();
		lanchonete.pronto();
		
	}	
}
	
		
	