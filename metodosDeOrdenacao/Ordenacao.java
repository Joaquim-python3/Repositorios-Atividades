package Atividade;

public class Ordenacao {

	public void bubbleSort(int vetor[]) {
		int temp;
		int contador = 1;

		do {
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					temp = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = temp;
				}
			}
			contador++;
		} while (contador < vetor.length);
	}

	public void selectionSort(int vetor[]) {

		int menor, indiceMenor;

		for (int i = 0; i < vetor.length - 1; i++) {
			menor = vetor[i];
			indiceMenor = i;

			// comparar com outros valores do vetor
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < menor) {
					menor = vetor[j];
					indiceMenor = j;
				}
			}

			vetor[indiceMenor] = vetor[i];
			vetor[i] = menor;
		}
	}

}
