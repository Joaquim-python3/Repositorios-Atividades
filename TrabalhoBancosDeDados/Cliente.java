package trabalho;

//Um banco precisa com frequência ordenar seus clientes de acordo com algum critério. Nesta parte do
//trabalho, você deverá implementar um sistema que permita ao funcionário do banco ordenar os
//clientes do banco pela identificação do cliente ou nome. Os dados dos clientes serão lidos de um
//arquivo texto (ASCII) e devem conter para cada cliente o seu nome, país e saldo.

//Para ordenar os dados de und arquivo, o usuário deve poder selecionar o método a ser utilizado
//(seleção ou bolha). O usuário deve ainda selecionar se deseja ver os dados ordenados na tela, ou se
//deseja que seja gerado um novo arquivo de saída contendo-os. Além dos dados ordenados, o sistema
//deverá apresentar (sempre na tela) o tempo gasto para a ordenação, e o número de comparações e
//movimentações feitas entre registros.

public class Cliente {
	private String nome;
	private String pais;
	private String saldo;
	
	public Cliente(String nome, String pais, String saldo) {
		super();
		this.nome = nome;
		this.pais = pais;
		this.saldo = saldo;
	}

	public Cliente() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Ficha do Cliente:\n-----------------\nNome: " + nome + "\nPais: "+pais+ "\nSaldo: "+saldo+ "\n-----------------";
		
	}
	
}
