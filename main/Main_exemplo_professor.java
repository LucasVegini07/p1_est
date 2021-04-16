package main;



public class Main_exemplo_professor {
	
	public static void main(String[] args) {
		
		Lanchonete lanchonete = new Lanchonete();		
		
		Produto p1 = new Produto("X-burguer", 1);
		Produto p2 = new Produto("X-salada", 2);
		Produto p3 = new Produto("X-bacon", 3);
		
		lanchonete.addProduto(p1);
		lanchonete.addProduto(p2);
		lanchonete.addProduto(p3);
		
		Pedido pedido1 = new Pedido();
		Pedido pedido2 = new Pedido();
		Pedido pedido3 = new Pedido();
		Pedido pedido4 = new Pedido();
		
		System.out.println("Cardápio: ");
		System.out.println(lanchonete.menu().toString());
		
	
		pedido1.addProduto(p1);
		pedido1.addProduto(p1);
		
		pedido2.addProduto(p3);
		pedido2.addProduto(p2);
		
		pedido3.addProduto(p1);
		
		lanchonete.anotarPedido(pedido1);
		lanchonete.anotarPedido(pedido2);
		lanchonete.anotarPedido(pedido3);
		
		lanchonete.cozinhar();
		
		lanchonete.isTemPedidoPronto();
		lanchonete.pronto();
		
		lanchonete.Auxiliar();
		
		pedido4.addProduto(p2);
		lanchonete.anotarPedido(pedido4);
		
		lanchonete.cozinhar();
		
		lanchonete.cozinhar();
		
		lanchonete.pronto();
		
		lanchonete.Auxiliar();
		
		lanchonete.pronto();

		lanchonete.Auxiliar();
		
		lanchonete.pronto();

	}

}
