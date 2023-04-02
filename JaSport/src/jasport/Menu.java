package jasport;

import java.io.IOException;
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
		String celular, titular, cpf = null;
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
			System.out.println("                        2 - Ver planos                                 ");
			System.out.println("                        3 - Visualizar cadastro                        ");
			System.out.println("                        4 - Cancelar plano                             ");
			System.out.println("                        5 - Sobre                                      ");
			System.out.println("                        0 - Sair                                       ");
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
				controller.escolhaPlano();
				keyPress();
			break;
			
			case 2:
				controller.listaPlanos();
				keyPress();
			break;
			case 3:
				controller.visualizarTitular();
				keyPress();
				break;
			case 4:
				System.out.println("Digite o CPF do titular: ");
				
				controller.cancelar(cpf);
				
				
				
				
				
				//controller.deletar(cpf);
				keyPress();
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
	public static void keyPress() {
		try {
			System.out.println("Digite Enter para continuar :D");
			System.in.read();
		}catch(IOException e) {
			System.out.println("Digite Enter para continuar :D");
		}
		
		
	}
	

}
