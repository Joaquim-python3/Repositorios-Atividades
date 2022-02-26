package trabalho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	static int contador;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		String caminhoArq = "C:/Users/LENOVO/Downloads/test.csv";
		String linha = "", procuraNome = "";
		boolean continuaBusca = true;

		try {
			BufferedReader br = new BufferedReader(new FileReader(caminhoArq));

			while ((linha = br.readLine()) != null) {
				String[] listaDados = linha.split(",");

				String nome = listaDados[2];
				String pais = listaDados[4];
				String dinheiro = listaDados[12];

				Cliente c = new Cliente(nome, pais, dinheiro);
				listaClientes.add(c);

			}

			do {

				System.out.println("Digite um nome para pesquisar e exit para sair: ");
				procuraNome = entrada.nextLine();
				System.out.println("Nome procurado: " + procuraNome);

				if (!procuraNome.toLowerCase().equalsIgnoreCase("exit")) {
					System.out.println("Buscando " + procuraNome + " em " + listaClientes.size());
					int index = buscaBinaria(listaClientes, procuraNome);

					if (index == -1) {
						System.out.println("Nome não encontrado");

					} else {

						Cliente cc = new Cliente();
						cc.toString();

					}
				} else {
					continuaBusca = false;
				}

			} while (continuaBusca);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int buscaBinaria(List<Cliente> listaClientes, String nome) {
		int inicio = 0, meio, fim = listaClientes.size() - 1;
		contador = 0;

		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			contador++;
			if (listaClientes.get(meio).getNome().equalsIgnoreCase(nome)) {
				return meio;
			}
			contador++;
			if (nome.compareTo(listaClientes.get(meio).getNome()) < 0) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		return -1;
	}
}
