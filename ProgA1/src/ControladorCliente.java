
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
		
		if (repositorioCliente.existeCliente(c.getTitular())) {
			throw new ClienteException("Cliente com cpf já existente");
		} else {
			repositorioCliente.inserirCliente(c);

		}	
	}

	public void procurarClientePeloCpf(String titular) throws ClienteException {
			repositorioCliente.procurarClientePeloCpf(titular);
	}

	public boolean removerCliente(String titular) throws ClienteException {
		
		if (repositorioCliente.removerCliente(titular)) {
			throw new ClienteException("Não existe cliente com o cpf passado");
		} else {
			repositorioCliente.removerCliente(titular);

		}	
		return false;
	}
	
	public void Compra(String titular, int pontos) {
		repositorioCliente.Compra(titular, pontos);
	}
}
