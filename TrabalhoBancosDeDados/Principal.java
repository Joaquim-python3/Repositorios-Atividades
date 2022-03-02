package trabalho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
		String linha = "";
		String s = "";
		int index = 0;
		boolean continuaBusca = true;

		try {
			BufferedReader br = new BufferedReader(new FileReader(caminhoArq));

			while ((linha = br.readLine()) != null) {
				String[] listaDados = linha.split(",");

				String nome = listaDados[2];
				String pais = listaDados[4];
				String idade = listaDados[6];
				String dinheiro = listaDados[8];

				Cliente c = new Cliente(nome, pais, idade, dinheiro);
				listaClientes.add(c);
				
			}

			do {
				
				System.out.println("Digite um nome para pesquisar e exit para sair: ");
				String procuraNome = entrada.nextLine();

				if (!procuraNome.toLowerCase().equalsIgnoreCase("exit")) {
					
//					System.out.println("Digite o país para pesquisar: ");
//					String procuraPais = entrada.nextLine();
					
					System.out.println("Nome procurado: " + procuraNome);

					System.out.println("Buscando " + procuraNome + " em " + listaClientes.size());
					
					for(Cliente c: listaClientes) {
						index++;
						if(c.getNome().equalsIgnoreCase(procuraNome)) {
//							if(c.getPais().equalsIgnoreCase(procuraPais)) {
								
								System.out.println("index: "+index);
								s += c.toString() + "\n";
//							}
						}
					}
					
					FileWriter w = new FileWriter("C:/Users/LENOVO/Downloads/file.txt");
					w.write(s);
					w.close();

//					int index = buscaBinaria(listaClientes, procuraNome);
//
//					if (index == -1) {
//						System.out.println("Nome não encontrado");
//
//					} else {
//						
//						Cliente cli = new Cliente();
//						cli.getInformacoes(
//								listaClientes.get(index).getNome(), 
//								listaClientes.get(index).getPais(), 
//								listaClientes.get(index).getSaldo());
//						System.out.println("Busca finalizada, comparações realizadas: "+contador);
//						
//					}

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
