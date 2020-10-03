import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) throws ClienteException{
		
		Inicializacao.Iniciar();
		Fachada fachada = Fachada.getInstancia();	
		Scanner s = new Scanner (System.in);
		
			int opcao;
			
			s = new Scanner(System.in);
			
			System.out.println("Escolha uma opção: \n1 - Cadastrar novo cliente \n2 - Remover Cliente \n3 - Consultar Cliente \n4 - Sair");
			opcao = s.nextInt();

			switch (opcao) {
			case 1:
				Cliente c = new Cliente();
				System.out.println("Digite o nome");
				c.setNome(s.next());
				System.out.println("Digite o cpf");
				c.setCpf(s.next());
				
				try {
					fachada.inserirCliente(c);
				} catch (ClienteException e) {
					System.out.println(e.getMessage());
				}
			break;
			case 2:
				String cpf;
				System.out.println("Digite o cpf");
				cpf = s.next();
				try {
					fachada.removerCliente(cpf);
				} catch (ClienteException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				String cpf2;
				System.out.println("Digite o cpf");
				cpf2 = s.next();
				try {
					fachada.procurarClientePeloCpf(cpf2);
				} catch (ClienteException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		}
		
		}