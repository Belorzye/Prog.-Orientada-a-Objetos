package consultorio;

import java.time.LocalDate;

public class publico extends paciente {
	
	private int carteiraSus;

	public publico(String nome, String sobreNome, LocalDate dateNascimento, int carteiraSus) {
		super(nome, sobreNome, dateNascimento);
		this.carteiraSus = carteiraSus;
	}

	
	
	
	
}
