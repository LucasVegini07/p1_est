package main;

import queue.base.Queue;
import queue.base.LinkedQueue;

//Esta classe foi desenvolvida com o intuito de ser a classe controle; utilizei queue pois no enunciado da questão estava descrito que os pedidos seriam atendidos por ontem de chamado, ou seja o primeiro pedido a ser feito será o primeiro pedido a ser entregue, como uma fila mesmo.
//Quando ao queue do produto, posso dar a mesma justificativa do exercício anterior, optei por usar ela, pois não podíamos usar as listas. 
//A classe auxiliar foi desenvolvida para auxiliar nos meus testes quanto ao código.


public class Lanchonete {
	
	private Queue <Pedido> pedidos = new LinkedQueue<>();
	private Queue <Produto> produtos = new LinkedQueue<>();
	
	public Queue<Produto> menu() {
		return this.produtos;
	}
	public void anotarPedido(Pedido p) {
		pedidos.enqueue(p);
	}
	
	public void cozinhar() {
		Pedido p;		
		
		for(int i = 0; i < pedidos.size(); i++) {
			p = pedidos.first();
			p.cozinhar();
			pedidos.dequeue();
			pedidos.enqueue(p);			
		}
	}

	public boolean isTemPedidoPronto() {
		if (pedidos.isEmpty() == false && pedidos.first().getTempoEspera() == 0) {
			System.out.println("Tem pedido pronto para ser entregue!");
			return true;
		}
			System.out.println("Não em pedido pronto para ser entregue!");
		return false;
	}
	
	public Pedido pronto() {
		Pedido p;
		if(pedidos.isEmpty() == false && pedidos.first().getTempoEspera() == 0) {
			p = pedidos.first();
			pedidos.dequeue();	
			System.out.println("Pedido pronto para ser entregue!");
		}
		else {
			System.out.println("Aguardando finalização do pedido ou não há pedidos!");
		}
		return null;
	}
	
	public boolean isTemPedido() {
		
		if(pedidos.size() != 0)
			return true;
					return false;
	}
	
	protected void addProduto(Produto p) {
		produtos.enqueue(p);
	}
	
	
	protected void Auxiliar() {
		
		Pedido p;
		
		for(int i = 0; i < pedidos.size(); i++) {
			System.out.println(pedidos.first().toString());
			p = pedidos.first();
			pedidos.dequeue();
			pedidos.enqueue(p);
		}
		
		System.out.println(" ------------ ");
	}

}

