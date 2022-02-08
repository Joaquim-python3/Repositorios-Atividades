package ProjetoCinema;

public class Sala {
	private int numero;
	private int quantidade;
	
	public Sala(int numero, int quantidade) {
		super();
		this.numero = numero;
		this.quantidade = quantidade;
	}
	
	public Sala() {
		super();
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void ocuparLugar(int lugaresOcupados) {
		quantidade = quantidade - lugaresOcupados;
	}
	
}
