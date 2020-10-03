
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

	public Cliente procurarClientePeloCpf(String cpf) throws ClienteException {
		return controladorCliente.procurarClientePeloCpf(cpf);
	}

	public boolean removerCliente(String cpf) throws ClienteException {
		return controladorCliente.removerCliente(cpf);		
	}
}
