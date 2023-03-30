package consultorio;

import java.time.LocalDate;

public class privado extends paciente {
	
	protected String rg;
	protected double valorConsulta;
	
	
	public privado(String nome, String sobreNome, LocalDate dateNascimento, String rg,
			double valorConsulta) {
		super(nome, sobreNome,dateNascimento);
		this.rg = rg;
		this.valorConsulta = valorConsulta;
	}
	
	
	
	
}
