package vetoresEmatrizes;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import entities.Funcionario;

public class exercicioLista {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("numero de funcionarios: ");
		int entrada = input.nextInt();

		List<Funcionario> list = new ArrayList<>();

		for (int i = 0; i < entrada; i++) {
			System.out.println("ID do funcionario:");
			int id = input.nextInt();
			System.out.println("Nome do funcionario:");
			String nome = input.next();
			System.out.println("Salario do funcionario: ");
			double salario = input.nextDouble();
			Funcionario dados = new Funcionario(id, nome, salario);
			list.add(new Funcionario(id,nome,salario));

		}
		System.out.println(list);

		System.out.println("Aumentar salario? (0/1)");
		int resposta = input.nextInt();
		if (resposta == 0) {
			System.out.println("Id do funcionario: ");
			int id = input.nextInt();
			Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			System.out.println("informe a procentagem de aumento: ");
			double porcentagem = input.nextDouble();
			func.almentaSalario(porcentagem);

			}
		for(Funcionario obj : list) {
			System.out.println(obj);
		}
		}
	

	}


