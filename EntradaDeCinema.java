package exercicio007;
/*Escreva uma classe “EntradaDeCinema�? com a seguinte estrutura
(dados):
 int idade
 float horário
 int sala
 float valor
E com as seguintes ações (métodos):
 Construtor: com a finalidade de inicializar todos os atributos.
 CalculaDesconto: que deve receber como parâmetro a idade do
cliente (do tipo int) e caso seja menor de 12 anos, deve ser dado um
desconto de 50% no valor normal.
 CalculaDesconto: que deve receber como parâmetro a idade do
cliente (do tipo int) e o número de sua carteira de estudante (do tipo
int). Se o estudante tiver idade entre 12 e 15 anos, deve ser dado
um desconto de 40%, de 16 a 20 um desconto de 30% e mais que
20 anos um desconto de 20% no valor normal.
 CalculaDescontoHorário: esse método deve dar um desconto de
10% sobre o valor aferido após todas as outras opções de desconto,
caso o horário do filme seja antes das 16 horas.
 Exibir(): que deve imprimir todos os dados do ingresso.
Desenvolva uma aplicação que leia os dados necessários para
instanciar e imprimir o ingresso para clientes normais, menores de 12
anos e estudantes.*/

public class EntradaDeCinema {
	int idade;
	float horario;
	int sala;
	public static float valor; // nao vai mudar
	
	//INICIALIZANDO TODOS OS ATRIBUTOS
	public EntradaDeCinema(int idade, float horario, int sala, float valor) {
		this.idade = idade;
		this.horario = horario;
		this.sala = sala;
		this.valor = valor;
	}
	
	//MÉTODOS
	public float CalculaDesconto(int idade) {
		if(idade<12) {
			valor = (float) (valor * 0.5); // DESCONTO 50%
		}
		return valor;
	}
	
	public float CalculaDesconto(int idade, int carteirinha_estudante){
		if(idade >=12 && idade<=15) {
			valor = (float) (valor * 0.6); // DESCONTO 40%
			
		} else if(idade>16 && idade<=20) {
			valor = (float) (valor * 0.8); // DESCONTO 20%
			
		}
		return valor;
	}
	
	public float CalculaDescontoHorario(float horario) {
		if(horario < 16) {
			valor  = (float) (valor * 0.9); // DESCONTO DE 10%
		}
		return valor;
	}
	
	//MÉTODO PARA MOSTRAR TUDO, SÓ QUE EM STRING
	@Override
	public String toString() {
		return "EntradaDeCinema [idade=" + idade + ", horario=" + horario + ", sala=" + sala + ", valor=" + valor + "]";
	}
	
}
