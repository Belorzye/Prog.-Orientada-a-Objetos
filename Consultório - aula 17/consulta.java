package consultorio;

import java.time.LocalDate;
import java.time.LocalTime;

public class consulta {
	
	private LocalDate dataConsulta;
	private String especialidade;
	private LocalTime horaMinuto;
	
	public consulta(LocalDate dataConsulta, String especialidade, LocalTime horaMinuto, paciente paciente) {
		this.dataConsulta = dataConsulta;
		this.especialidade = especialidade;
		this.horaMinuto = horaMinuto;
		paciente.incrementaConsulta();
	}

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public LocalTime getHoraMinuto() {
		return horaMinuto;
	}

	public void setHoraMinuto(LocalTime horaMinuto) {
		this.horaMinuto = horaMinuto;
	}



	
	
	
}
