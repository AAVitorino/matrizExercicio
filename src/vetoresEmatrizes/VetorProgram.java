package vetoresEmatrizes;

import java.util.Locale;
import java.util.Scanner;

import entities.Hospede;

public class VetorProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Hospede[] hotel = new Hospede[10];
		System.out.println("Numero de hospedes: ");
		int numHospedes = input.nextInt();

		for (int i = 0; i < numHospedes; i++) {
			System.out.println("Nome do hoospede:");
			String nome = input.next();
			System.out.println("Email do hospede: ");
			String email = input.next();
			System.out.println("Quarto desejado: ");
			int numero = input.nextInt();

			hotel[numero] = new Hospede(nome, email, numero);
		}
		System.out.println("Quartos ocupados: ");

		for (int i = 0; i < hotel.length; i++) {

			if (hotel[i] != null) {
				System.out.printf("%n%d: %s, %s%n", hotel[i].getNumero(), hotel[i].getNome(), hotel[i].getEmail());
			}
		}

		input.close();
	}

}
