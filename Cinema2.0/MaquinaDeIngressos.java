// SIMULACAO DE UMA MAQUINA DE CINEMA\nDevopeled by: Joaquim Cabral

package ProjetoCinema;


import javax.swing.JOptionPane;

/* Fa�a um programa Java para usar a maquina de vender ingressos de cinema. O programa deve criar
 * um objeto da maquina de bilhetes e depois adicionar as salas e os filmes. Em
 * seguida deve listar os filmes em execu��o e depois vender alguns bilhetes.
 */
public class MaquinaDeIngressos {
	public static void main(String[] args) {
		Maquina maq = new Maquina();
		
		int opcao=1;
		while(opcao != 0) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Suas op��es s�o:"
					+"\n1 - Adicionar filme"
					+"\n2 - Comprar ingresso"
					+"\n3 - Filmes em exibicao"
					+"\n4 - Adicionar sala"));
			
			switch(opcao) {
				case 1:
					Filme filme = new Filme(
							JOptionPane.showInputDialog("T�tulo do filme: "),
							JOptionPane.showInputDialog("G�nero do filme: "),
							Integer.parseInt(JOptionPane.showInputDialog("Ano de lan�amento")),
							JOptionPane.showInputDialog("Diretor do filme: "),
							Float.parseFloat(JOptionPane.showInputDialog("Valor do ingresso: ")));
					maq.adicionarFilme(filme);
					JOptionPane.showConfirmDialog(null, "Filme cadastrado com sucesso");
				case 2:
					maq.comprarIngresso(
							JOptionPane.showInputDialog("Digite o nome do filme que deseja comprar:"),
							Integer.parseInt(JOptionPane.showInputDialog("quantidade de ingressos:")));
					// vai mostrar o showCofirmDialog  pelo m�todo e nao pela classe
				case 3:
					 maq.filmesEmExibicao();
					 
				case 4:
					Sala sala = new Sala(Integer.parseInt(JOptionPane.showInputDialog("Numero da sala:")),
							Integer.parseInt(JOptionPane.showInputDialog("Quantidade de luagres na sala: ")));
					maq.adicionarSala(sala);
			}
		}
	}
}
