package ProjetoCinema;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Maquina {
	
	ArrayList<Filme> filmes;
	ArrayList<Sala> salas;

	public Maquina() {
		super();
		filmes = new ArrayList<>();
		salas = new ArrayList<>();
	}

	// 1 -  Informar o valor do ingresso para os filmes;
	public void informarValorIngressoFilmes() {
		for(Filme filme : filmes) {
			System.out.println("Filme: "+filme.getTitulo()+"\nValor ingresso: "+filme.getValor());
		}
	}
	
	// 2 - Adicionar as salas do cinema informando, para cada sala, numero ecapacidade de pessoas;
	public void adicionarSala(Sala sala){
		salas.add(sala);
	}
	
	/* 3 - Adicionar os filmes que devem ser exibidos, informando para cada filme, titulo, gênero, ano, 
	 * diretor e em qual sala será exibido;
	 */
	public void adicionarFilme(Filme filme) {
		filmes.add(filme);
	}
	
	// 4 - Consultar os filmes em exibição - A maquina deve exibir uma lista dos filmes em exibição
	public void filmesEmExibicao() {
		System.out.println("Filmes em exibição:");
		for(Filme filme : filmes) {
			System.out.println("Filme: "+filme.getTitulo()
							+"\nGênero do Filme: "+filme.getGenero()
							+"\nAno do filme: "+filme.getAno()
							+"\nDiretor do filme: "+filme.getDiretor());
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		}
	}
	
	/* 5 - Comprar um ingresso  - A maquina deve permitir que o cliente possa
	 * escolher um filme e informar quantos ingressos deseja comprar. Deve ser
	 * verificado se existem lugares disponíveis, verificando a capacidade disponível
	 * da sala onde o filme será exibido.
	 */
	
	public void comprarIngresso(String nomeDoFilme, int quantidadeDeIngressos) {
		Sala s = new Sala();
		for (Filme filme : filmes) {
			if(filme.getTitulo().equalsIgnoreCase(nomeDoFilme)) {
				s.ocuparLugar(quantidadeDeIngressos);
				
				/*6 - Informar o valor total da compra - A maquina deve informar, ao final da
				 * compra, o valor total a ser pago pelo cliente.
				 */
				
				JOptionPane.showConfirmDialog(null, "Valor total: "+filme.getValor()* quantidadeDeIngressos);
			}
		}
	}
}