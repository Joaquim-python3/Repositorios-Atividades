package exercicio007;

import java.util.Scanner;

public class TesteEntradaDeCinema {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int idade;
		float horario;
		int sala;
		

		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();

		System.out.println("Hor�rios: 12.30, 14.30, 16.30, 18.30, 20.30");
		System.out.println("Digite o hor�rio da sess�o: ");
		horario = entrada.nextFloat();

		System.out.println("Salas: 1, 2, 3, 4");
		System.out.println("Digite a sala da sess�o: ");
		sala = entrada.nextInt();
		
		System.out.println("Vai usar carteirinha de estudante: ");
		System.out.println("1 - true\n2 - false");
		int verificar_carteirinha = entrada.nextInt();
		
		EntradaDeCinema ingresso = new EntradaDeCinema(idade, (float) horario, sala, (float) 16);
		
		if(verificar_carteirinha == 1) {
			System.out.println("Digite o n�mero da carteirinha: ");
			int carteirinha_estudante = entrada.nextInt();
			
			System.out.println(ingresso.CalculaDesconto(idade, carteirinha_estudante)); // desconto com idade e n� da carteirinha
		}
		

		System.out.println(ingresso.CalculaDescontoHorario((float) horario)); // desconto pelo o horario
		System.out.println(ingresso.CalculaDesconto(idade)); // desconto pela a idade
		System.out.println(ingresso.toString()); // mostra informa��es
		
	}
}
