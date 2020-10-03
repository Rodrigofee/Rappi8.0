
public class Inicializacao {

private static Fachada fachada = Fachada.getInstancia();	
	
	public static void Iniciar() throws ClienteException{
	
		Cliente c2 = new Cliente();

		c2.setNome("Bianka");
		c2.setCpf("09222134586");
		c2.setNivel("Bronze");
		c2.setBeneficio("Ganhe pontos a cada compra");

		try {
			fachada.inserirCliente(c2);
		} catch (ClienteException e) {
			System.out.println(e.getMessage());
		}

		Cliente c3 = new Cliente();

		c3.setNome("Gabriel");
		c3.setCpf("030807445962");
		c3.setNivel("Silver");
		c3.setBeneficio("R$37,00 OFF em bebidas");

		try {
			fachada.inserirCliente(c3);
		} catch (ClienteException e) {
			System.out.println(e.getMessage());
		}

		Cliente c4 = new Cliente();

		c4.setNome("Murilo");
		c4.setCpf("06996325418");
		c4.setNivel("Gold");
		c4.setBeneficio("R$25,00 OFF em farmácias");

		try {
			fachada.inserirCliente(c4);
		} catch (ClienteException e) {
			System.out.println(e.getMessage());
		}

		Cliente c5 = new Cliente();

		c5.setNome("Zack");
		c5.setCpf("1563897457");
		c5.setNivel("Diamante");
		c5.setBeneficio("Cashback R$20,00 em lar");

		try {
			fachada.inserirCliente(c5);
		} catch (ClienteException e) {
			System.out.println(e.getMessage());
		}
	}
}
