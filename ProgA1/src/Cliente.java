
public class Cliente {

	private String nome;
	private String titular;
	private String nivel;
	private String beneficio;
	private int pontos;
	private int nCreditos;
	
	public Cliente() {}
	
	public Cliente (String cpf) { 
		titular = cpf;
		pontos = 0;
		nCreditos = 0;
		}
	
	public Cliente (String cpf, int pts) {
		titular = cpf;
		pontos = pts;
		nCreditos = 0; 
		}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}	
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getnCreditos() {
		return nCreditos;
	}
	public void setnCreditos(int nCreditos) {
		this.nCreditos = nCreditos;
	}
	public void creditarPontos(int pontos) {
		this.pontos += pontos;
		nCreditos += 1;   
		}
	public String toString() {
		return "Nome: " + this.nome + ", CPF: " + this.titular + 
				", Nivel: " + this.nivel + ", Beneficio: " + this.beneficio + ", Pontos: " + this.pontos + 
				", Numero de compras: " + nCreditos;
	}
	}
