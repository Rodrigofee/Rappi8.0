
public class Fachada{

	private ControladorCliente controladorCliente;
private static Fachada instancia;
	
	public static Fachada getInstancia(){
		if (instancia == null) {
			instancia = new Fachada();
		}
		
		return instancia;
	}
	
	private Fachada(){
		controladorCliente = ControladorCliente.getInstancia();
	}
	
	public void inserirCliente(Cliente c) throws ClienteException {
		controladorCliente.inserirCliente(c);
		}

	public void procurarClientePeloCpf(String titular) throws ClienteException {
		controladorCliente.procurarClientePeloCpf(titular);
	}

	public boolean removerCliente(String titular) throws ClienteException {
		return controladorCliente.removerCliente(titular);		
	}
	
	public void Compra(String titular, int pontos) {
		controladorCliente.Compra(titular, pontos);
	}
}
