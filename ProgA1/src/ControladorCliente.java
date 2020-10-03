
public class ControladorCliente {

	private RepositorioCliente repositorioCliente;
	private static ControladorCliente instancia;
	
	protected static ControladorCliente getInstancia(){
		if (instancia == null) {
			instancia = new ControladorCliente();
		}
		return instancia;
	}
	
	private  ControladorCliente() {
		repositorioCliente = RepositorioCliente.getInstancia();
	}

	public void inserirCliente(Cliente c) throws ClienteException {
		
		if (repositorioCliente.existeCliente(c.getCpf())) {
			throw new ClienteException("Cliente com cpf já existente");
		} else {
			repositorioCliente.inserirCliente(c);

		}	
	}

	public Cliente procurarClientePeloCpf(String cpf) throws ClienteException {
		if (repositorioCliente.procurarClientePeloCpf(cpf) == null) {
			throw new ClienteException("Não existe cliente com o cpf passado");
		} else {
			repositorioCliente.procurarClientePeloCpf(cpf);

		}	
		return null;
	}

	public boolean removerCliente(String cpf) throws ClienteException {
		
		if (repositorioCliente.removerCliente(cpf)) {
			throw new ClienteException("Não existe cliente com o cpf passado");
		} else {
			repositorioCliente.removerCliente(cpf);

		}	
		return false;
	}
}
