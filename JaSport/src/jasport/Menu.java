package jasport;

import java.util.Scanner;

import jasport.controller.Controller;
import jasport.model.Titular;
import jasport.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Controller controller = new Controller();
		Titular titular1 = new Titular(null, null, null,null);
		int opcao, planos, escolha;
		String celular, titular, cpf;
		float valor;

		while (true) {
			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND
					+ "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("                                                                       ");
			System.out.println("                                                                       ");
			System.out.println("        ##    ###     ######  ########   #######  ########  ########   ");
			System.out.println("        ##   ## ##   ##    ## ##     ## ##     ## ##     ##    ##      ");
			System.out.println("        ##  ##   ##  ##       ##      # ##     ## ##     ##    ##      ");
			System.out.println("        ## ##     ##  ######  ########  ##     ## ########     ##      ");
			System.out.println("  ##    ## #########       ## ##        ##     ## ##    ##     ##      ");
			System.out.println("  ##    ## ##     ## ##    ## ##        ##     ## ##     ##    ##      ");
			System.out.println("   ######  ##     ##  ######  ##         #######  ##      ##   ##      ");
			System.out.println("                                                                       ");
			System.out.println("                                                                       ");
			System.out.println("                        1 - Cadastrar                                  ");
			System.out.println("                        2 - Listar planos                              ");
			System.out.println("                        3 - Cancelar plano                             ");
			System.out.println("                        4 - Sobre                                      ");
			System.out.println("                        5 - Sair                                       ");
			System.out.println("                                                                       ");
			System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("                                                                       ");
			System.out.println("Entre com a opção desejada:                                            ");
			System.out.println("                                                                       ");
			System.out.println(
					"                                                                       " + Cores.TEXT_RESET);

			opcao = leia.nextInt();
		
			switch (opcao) {
			case 1:
			controller.cadastrar(null, null, null);
			controller.visualizar();
			break;
			
			case 2:

				switch (controller.listagem()) {

				case 1:
					System.out.println("Pacote Mensal Basic Todos os Esportes $60,00");
					titular1.setPlano("Plano básico");
					break;
				case 2:
					System.out.println("Pacote Mensal Premium Todos os Esportes + treinador $100,00");
					break;
				case 3:
					System.out.println("Pacote Anual Basic Todos os Esportes (desconto de 15%) $612,00");
					break;
				case 4:
					System.out.println("Pacote Anual Premium Todos os Esportes + treinador (desconto de  20%) $960,00");
					break;

				}

				break;

			case 3:
				System.out.println("Cancelar Plano ");
				System.out.println("Para cancelar um plano, vá presencialmente até a secretaria do local.");
				System.out.println("Lembre-se que, ao cancelar o plano, não será possível associar-se novamente durante um período de 6 meses.");
				System.out.println("Boa sorte!");
					
				break;
			case 4:
				sobre();
				break;
			case 5:
				leia.close();
				System.exit(0);
				break;
			default:
				System.out.println("\nOpção Invalida!\n ");

				break;
			}
		}
	}


	public static void sobre() {
		
		System.out.println("\nO Clube Jasport foi criado com a intenção de reunir os esportes mais populares em um só lugar, de modo a facilitar sua prática,"
				+ " além de manter um preço acessível a fim de incentivar práticas saudáveis para diversas pessoas");
		
		
		System.out.println(Cores.TEXT_WHITE + "\n   Projeto Criado por:");
		System.out.println(Cores.TEXT_WHITE + "\n   GitHub da equipe:");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("   Equipe desenvolvedora:                        ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("   GitHub: Ketelyn Medina                        ");
		System.out.println("   https://github.com/KetelynMM                  ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("   GitHub: Leticia Oliveira                      ");
		System.out.println("   https://github.com/intrxnce                   ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("   GitHub: Nicolle Sanches                       ");
		System.out.println("   https://github.com/nicollesanches             ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("  GitHub: Queren Neves                           ");
		System.out.println("  https://github.com/querenneves                 ");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		System.out.println("                                                 ");
		System.out.println("*************************************************");
		

	}

}
