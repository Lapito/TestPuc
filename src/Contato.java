
public class Contato {

	private String nome;
	private String email;
	private String numero;
	
	public Contato(String nome, String email, String numero) {
		super();
		this.nome = nome;
		this.email = email;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nEmail: " + email + "\nNumero: " + numero + "\n";
	}
	
}
