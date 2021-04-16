package main;



public class Produto {
	
	private String nome;
	private int tempoEspera;
	
	public Produto(String nome, int tempoEspera) {
		
		this.nome = nome;
		this.tempoEspera = tempoEspera;
	
	}
	
	public String getNome() { return nome; }
	
	public int getTempoEspera() { return tempoEspera; }
	
	@Override
	public String toString() {
		
		return "Lanche: "+nome+", Tempo de espera: "+tempoEspera+",\n";
	}
	
}
