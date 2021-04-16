package main;



import queue.base.LinkedQueue;
import queue.base.Queue;

//Está classe foi desenvolvida para que fossem armazenadas as informações de cada pedido
//Optei por utilizar o queue para armazenar as informações, pois no enunciado da questão estava descrito que não podíamos utilizar listas, então acabei optando pelo queue. 
//Em relação ao LinkedQueue em vez de ArrayQueue se deve ao fato que não existe um limite fixo para a quantidade de produtos armazenados no pedido.

public class Pedido {
	
	private Queue<Produto> produtos;
	private int tempoEspera;
	
	public Pedido () {
		this.produtos = new LinkedQueue<Produto>();
		this.tempoEspera = 0;
	}
	
	public int getTempoEspera() {
		return tempoEspera;
	}
	
	public void addProduto (Produto p) {	
		produtos.enqueue(p);
		if(tempoEspera < p.getTempoEspera())
			tempoEspera = p.getTempoEspera();
	}	
	
	public void cozinhar () {
		if (tempoEspera != 0)
		this.tempoEspera = this.tempoEspera - 1;
	}  
	
	@Override
	public String toString() {
		
		String produtosStrig = "";
		
		for(int i = 0; i< produtos.size(); i++) {
			produtosStrig = produtosStrig+", "+produtos.first().getNome();
			produtos.enqueue(produtos.first());
			produtos.dequeue();
		}
		
		return produtosStrig+" : Tempo de espera: "+tempoEspera; 
		
	}
}
