package br.com.flexait.nfse.model;

public class Contato {

	private String Telefone;

	private String Email;

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [Email=" + Email + ", Telefone=" + Telefone + "]";
	}
	
}
