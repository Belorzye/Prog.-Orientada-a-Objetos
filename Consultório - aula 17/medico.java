package consultorio;

public class medico {
	
	private String nome;
	private String sobreNome;
	private String especialidade;
	
	public medico(String nome, String sobreNome, String especialidade) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	
}
