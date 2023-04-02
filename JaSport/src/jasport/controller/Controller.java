package jasport.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jasport.Menu;
import jasport.repository.JasportRepository;
import jasport.model.Titular;

public class Controller implements JasportRepository {
	public List<Titular> listaJaspot = new ArrayList<Titular>();

	Scanner leia = new Scanner(System.in);
	Titular cliente = new Titular(null, null, null, null);

	@Override
	public void cadastrar(String titular, String cpf, String celular) {

		leia.nextLine();
		System.out.println("Digite o nome do titular: ");
		cliente.setTitular(leia.nextLine());

		System.out.println("Digite o CPF do cliente: ");
		cliente.setCpf(leia.nextLine());

		System.out.println("Digite o celular: ");
		cliente.setCelular(leia.nextLine());

		listaJaspot.add(cliente);

	}

	@Override
	public void escolhaPlano() {

		System.out.println("Nossos planos");
		System.out.println("\n\t1- Basic Mensal \tR$  60,00");
		System.out.println("\t2- Premium Mensal\tR$ 100,00");
		System.out.println("\t3- Basic Anual  \tR$ 612,00  c/ (desconto de 15%)");
		System.out.println("\t4- Premium Anual \tR$ 960,00 c/ (desconto de  20%)");
		System.out.println("\nEscolha um plano: ");

		int escolha = leia.nextInt();

		switch (escolha) {

		case 1:
			System.out.println("Pacote Mensal Basic Todos os Esportes $60,00");
			cliente.setPlano("Plano Básico");
			break;
		case 2:
			System.out.println("Pacote Mensal Premium Todos os Esportes + treinador $100,00");
			cliente.setPlano("Plano Premium");
			break;
		case 3:
			System.out.println("Pacote Anual Basic Todos os Esportes (desconto de 15%) $612,00");
			cliente.setPlano("Plano Básico Anual");
			break;
		case 4:
			System.out.println("Pacote Anual Premium Todos os Esportes + treinador (desconto de  20%) $960,00");
			cliente.setPlano("Plano Premium Anual");
			break;

		}

	}

	public void listaPlanos() {
		System.out.println("Nossos planos");
		System.out.println("\n\tBasic Mensal \tR$  60,00");
		System.out.println("\tPremium Mensal\tR$ 100,00");
		System.out.println("\tBasic Anual  \tR$ 612,00  c/ (desconto de 15%)");
		System.out.println("\tPremium Anual \tR$ 960,00 c/ (desconto de  20%)");
	}

	@Override
	public void contratar(int planob, int planoP) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelar(String cpf1) {
		String cpf = leia.nextLine();
		for(int x=0;x<listaJaspot.size();x++) {
			if(cliente.getCpf().equals(cpf)) {
				listaJaspot.remove(x);
			}
		}

	}

	@Override
	public void listarTitular() {

	}

	public void visualizarTitular() {
		for (int x = 0; x < listaJaspot.size(); x++) {

			System.out.println("**************************************");
			System.out.println("             Dados da Conta           ");
			System.out.println("**************************************");
			System.out.println("Nome do titular: " + cliente.getTitular());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("Celular: " + cliente.getCelular());
			System.out.println("Plano: " + cliente.getPlano());
		}
	}

	@Override
	public void listagem(int escolha) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(String cpf) {
		// TODO Auto-generated method stub
		
	}

}
