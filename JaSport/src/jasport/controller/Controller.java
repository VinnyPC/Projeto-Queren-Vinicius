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
	Titular cliente = new Titular(null, null, null,null);
	@Override
	public void cadastrar(String titular, String cpf, String celular) {
		
		
		System.out.println("Digite do titular: ");
		cliente.setTitular(leia.nextLine());
		
		System.out.println("Digite o CPF do cliente: ");
		cliente.setCelular(leia.nextLine());
		
		System.out.println("Digite o celular: ");
		cliente.setCelular(leia.nextLine());
		
		System.out.println("Digite o plano que deseja contratar: ");
		
		listaJaspot.add(cliente);
		
	}

	@Override
	public Integer listagem() {
		
		System.out.println("Nossos planos");
		System.out.println("\n\t1- Basic Mensal \tR$  60,00");
		System.out.println("\t2- Premium Mensal\tR$ 100,00");
		System.out.println("\t3- Basic Anual  \tR$ 612,00  c/ (desconto de 15%)");
		System.out.println("\t4- Premium Anual \tR$ 960,00 c/ (desconto de  20%)");
		System.out.println("\nEscolha um plano: ");
		int escolha = leia.nextInt();
		return escolha;
		
	}

	@Override
	public void contratar(int planob, int planoP) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelar(String titular, String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTitular() {
		for(int x=0; x<listaJaspot.size();x++) {
			System.out.println(listaJaspot.get(x));
		}
		
	}
	public void visualizar() {
		
		System.out.println("**************************************");
		System.out.println("             Dados da Conta           ");
		System.out.println("**************************************");
		System.out.println("Nome do titular: " + cliente.getTitular());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Celular: " + cliente.getCelular());
		System.out.println("Plano: " + cliente.getPlano());
	}

	@Override
	public void listagem(int escolha) {
		// TODO Auto-generated method stub
		
	}

	

	

	
}
