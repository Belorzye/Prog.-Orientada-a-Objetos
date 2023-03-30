package consultorio;

import java.time.LocalDate;

public class paciente {
	
	private String nome;
	private String sobreNome;
	private boolean primeiraConsulta;
	private LocalDate dateNascimento;
	private int numConsulta;
	
	public paciente(String nome, String sobreNome, LocalDate dateNascimento) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.primeiraConsulta = true;
		this.dateNascimento = dateNascimento;
		this.numConsulta = 0;
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


	public boolean isPrimeiraConsulta() {
		return primeiraConsulta;
	}


	public void setPrimeiraConsulta(boolean primeiraConsulta) {
		this.primeiraConsulta = primeiraConsulta;
	}


	public LocalDate getDateNascimento() {
		return dateNascimento;
	}


	public void setDateNascimento(LocalDate dateNascimento) {
		this.dateNascimento = dateNascimento;
	}



	public int getNumConsulta() {
		return numConsulta;
	}



	public void incrementaConsulta() {
		this.numConsulta++;
		if (this.numConsulta > 1 ) {
			setPrimeiraConsulta(false);
		}
	}
	
}
