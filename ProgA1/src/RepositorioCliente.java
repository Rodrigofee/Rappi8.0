import java.util.ArrayList;
import java.util.List;

public class RepositorioCliente {

	private List<Cliente> listaCliente;
	private static RepositorioCliente instancia;
	
	public static RepositorioCliente getInstancia() {
		if (instancia == null) {
			instancia = new RepositorioCliente();
		}
		return instancia;
	}
	
	private  RepositorioCliente() {
		listaCliente = new ArrayList<>();	
	}

	public void inserirCliente(Cliente c) throws ClienteException {
		listaCliente.add(c);
	}

	public void procurarClientePeloCpf(String cpf) throws ClienteException {
		for (int i = 0; i<listaCliente.size(); i++) {
			if (listaCliente!= null && listaCliente.get(i).getCpf().equalsIgnoreCase(cpf)) {
				System.out.println(listaCliente.get(i).toString());
			}
		}
	}

	public boolean removerCliente(String cpf) throws ClienteException {
		for (Cliente c: listaCliente) {
			if (listaCliente!= null && 
					c.getCpf().equalsIgnoreCase(cpf)){
				listaCliente.remove(c);
				return true;
		}
		}
		return false;
	}

	public boolean existeCliente(String cpf) {
	for (Cliente c: listaCliente) {
		if (c.getCpf().equalsIgnoreCase(cpf)){
			return true;
		}
	}

	return false;
}

}