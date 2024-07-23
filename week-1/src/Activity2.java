import java.util.Scanner;

public class Activity2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int vetor[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.print("Digite um número de 1 a 10: ");
		int numero = scanner.nextInt();

		boolean achou = false;

		int position = 0;

		for (int index = 0; index < 10; index++) {
			if (vetor[index] == numero) {
				achou = true;
				position = index;
				break;
			}

		}

		if (achou) {
			System.out.println("Achei");
			System.out.printf("Na Posição %d está localizado o numero %d.", position, vetor[position]);
		} else {
			System.out.println("Número não encontrado.");
		}

		scanner.close();
	}

}