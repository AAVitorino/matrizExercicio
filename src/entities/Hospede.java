package entities;

public class Hospede {
	private String nome;
	private int numero;
	private String email;
	

	public Hospede(String nome, String email, int numero) {
		this.nome = nome;
		this.email = email;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
