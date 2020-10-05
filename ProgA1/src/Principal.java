import java.util.Scanner;

public class Principal {
	
	static Scanner s = new Scanner (System.in);
	public static void main(String[] args) throws ClienteException{	
		
		Inicializacao.Iniciar();	
		s = new Scanner (System.in);
		
		int opcao;
			
			System.out.println("Escolha uma opção: \n1 - Quer ser cliente \n2 - Já é Cliente \n3 - Sair");
			opcao = s.nextInt();
			do {
			switch (opcao) {
			case 1:
				UiClienteN UiClienteN = new UiClienteN();
				UiClienteN.showMenu();
			break;
			case 2:
				UiClienteA UiClienteA = new UiClienteA();
				UiClienteA.showMenu();
			break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
			}while (opcao !=3);
		}
		
		}