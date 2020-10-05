import java.util.Scanner;

public class UiClienteA {
	private static Fachada fachada = Fachada.getInstancia();
	static Scanner s = new Scanner (System.in);
	
	public void showMenu() {
		int opcao;
		
		s = new Scanner(System.in);
		
		System.out.println("Escolha uma opção: \n1 - Remover Cliente \n2 - Consultar Cliente \n3 - Sair");
		opcao = s.nextInt();
		
		switch (opcao) {
		case 1:
			String cpf;
			System.out.println("Digite o cpf");
			cpf = s.next();
			try {
				fachada.removerCliente(cpf);
			} catch (ClienteException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			String cpf2;
			System.out.println("Digite o cpf");
			cpf2 = s.next();
			try {
				fachada.procurarClientePeloCpf(cpf2);
			} catch (ClienteException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
	}
}
