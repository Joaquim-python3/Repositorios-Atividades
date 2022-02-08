package ProjetoCinema;

public class Filme {
	
	private String titulo;
	private String genero;
	private int ano;
	private String diretor;
	private float valor;
	
	public Filme(String titulo, String genero, int ano, String diretor, float valor){
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.ano = ano;
		this.diretor = diretor;
		this.valor = valor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
