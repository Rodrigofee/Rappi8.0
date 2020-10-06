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
			String titular;
			System.out.println("Digite o cpf");
			titular = s.next();
			try {
				fachada.removerCliente(titular);
			} catch (ClienteException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			String titular2;
			int pontos;
			System.out.println("Digite o cpf");
			titular2 = s.next();
			System.out.println("Digite o valor da sua compra");
			pontos = s.nextInt();
			
			try {
				fachada.Compra(titular2, pontos);
				fachada.procurarClientePeloCpf(titular2);
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
