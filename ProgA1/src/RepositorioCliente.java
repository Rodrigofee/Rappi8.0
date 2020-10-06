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

	public void procurarClientePeloCpf(String titular) throws ClienteException {
		for (int i = 0; i<listaCliente.size(); i++) {
			if (listaCliente!= null && listaCliente.get(i).getTitular().equalsIgnoreCase(titular)) {
				System.out.println(listaCliente.get(i).toString());
			}
		}
	}

	public boolean removerCliente(String titular) throws ClienteException {
		for (Cliente c: listaCliente) {
			if (listaCliente!= null && 
					c.getTitular().equalsIgnoreCase(titular)){
				listaCliente.remove(c);
				return true;
		}
		}
		return false;
	}
	 public void Compra(String titular, int pontos) {
		 for (int i = 0; i<listaCliente.size(); i++) {
			 if (listaCliente!= null && listaCliente.get(i).getTitular().equalsIgnoreCase(titular)) {
				Cliente c = listaCliente.get(i);
				c.creditarPontos(pontos);
				System.out.println("Atualmente seus pontos são de " + c.getPontos());
		 }
			 }
	 }
	public boolean existeCliente(String titular) {
	for (Cliente c: listaCliente) {
		if (c.getTitular().equalsIgnoreCase(titular)){
			return true;
		}
	}

	return false;
}

}