package core.aplicacao;

public class EntidadeAplicacao {
	
	private String user;
	private String senha;
	
	public boolean verificarAutenticacao() {
		return true;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
