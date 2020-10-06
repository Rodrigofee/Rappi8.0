import java.util.Scanner;

public class UiClienteN {

	private static Fachada fachada = Fachada.getInstancia();	
	static Scanner s = new Scanner (System.in);
	
	public void showMenu() throws ClienteException {
		int opcao;
		
		s = new Scanner(System.in);
		
		System.out.println("Escolha uma op��o: \n1 - Cadastrar novo cliente \n2 - Cliente j� cadastrado \n3 - Sair");
		opcao = s.nextInt();

		switch (opcao) {
		case 1:
			inserirCliente();
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
			System.out.println("Op��o Inv�lida");
			break;
		}
	}

	private static void inserirCliente() throws ClienteException{
		Cliente c = new Cliente();
		System.out.println("Digite o nome");
		c.setNome(s.next());
		System.out.println("Digite o cpf");
		c.setTitular(s.next());
		
		try {
			fachada.inserirCliente(c);
		} catch (ClienteException e) {
			System.out.println(e.getMessage());
		}

	}
	}
