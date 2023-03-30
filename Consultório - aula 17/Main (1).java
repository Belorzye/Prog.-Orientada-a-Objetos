package consultorio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		
		
		
		paciente pacientePublico = new publico("Lucas", "Santos Pereira",LocalDate.of(1997,8,19), 123);

		System.out.println("Paciente publico " + pacientePublico.getNome());
		consulta consulta1 = new consulta(LocalDate.of(2023, 3, 22), "Urgência",LocalTime.of(20, 30), pacientePublico);
		consulta consulta2 = new consulta(LocalDate.of(2023, 3, 30), "Cirurgia",LocalTime.of(20, 00), pacientePublico);
		System.out.println("Números consultas: " + pacientePublico.getNumConsulta());
		System.out.println("Primeira Consulta " + pacientePublico.isPrimeiraConsulta());
		paciente pacientePublico2 = new publico("Gustavo", "Silva",LocalDate.of(2000,1,1), 124);
		
		consulta consulta3 = new consulta(LocalDate.of(2023, 3, 22), "Urgência",LocalTime.of(20, 30), pacientePublico);
		

		
	}

}
