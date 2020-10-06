
public class Inicializacao {

private static Fachada fachada = Fachada.getInstancia();	
	
	public static void Iniciar() throws ClienteException{
	
		Cliente c2 = new Cliente();

		c2.setNome("Bianka");
		c2.setTitular("09222134586");
		c2.setNivel("Bronze");
		c2.setBeneficio("Ganhe pontos a cada compra");
		c2.setPontos(510);
		c2.setnCreditos(5);
		
		try {
			fachada.inserirCliente(c2);
		} catch (ClienteException e) {
			System.out.println(e.getMessage());
		}

		Cliente c3 = new Cliente();

		c3.setNome("Gabriel");
		c3.setTitular("030807445962");
		c3.setNivel("Silver");
		c3.setBeneficio("R$37,00 OFF em bebidas");
		c3.setPontos(1100);
		c3.setnCreditos(15);

		try {
			fachada.inserirCliente(c3);
		} catch (ClienteException e) {
			System.out.println(e.getMessage());
		}

		Cliente c4 = new Cliente();

		c4.setNome("Murilo");
		c4.setTitular("06996325418");
		c4.setNivel("Gold");
		c4.setBeneficio("R$25,00 OFF em farmácias");
		c4.setPontos(1600);
		c4.setnCreditos(30);

		try {
			fachada.inserirCliente(c4);
		} catch (ClienteException e) {
			System.out.println(e.getMessage());
		}

		Cliente c5 = new Cliente();

		c5.setNome("Zack");
		c5.setTitular("1563897457");
		c5.setNivel("Diamante");
		c5.setBeneficio("Cashback R$20,00 em lar");
		c5.setPontos(2100);
		c5.setnCreditos(50);

		try {
			fachada.inserirCliente(c5);
		} catch (ClienteException e) {
			System.out.println(e.getMessage());
		}
	}
}
