

public class EventoPeriodico extends Evento {
	public DiaSemana getDiaSemana() {
		return diaSemana;
	}



	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}

	private DiaSemana diaSemana;
	
    public EventoPeriodico(String titulo, String descricao, String dataInicio, String dataFim, String localizacao, DiaSemana diaSemana) {
		super(titulo, descricao, dataInicio, dataFim, localizacao);
		 this.diaSemana = diaSemana;
		// TODO Auto-generated constructor stub
	}

    

    public void adicionarParticipante(String participante) {
        getParticipantes().add(participante);
    }

    public void removerParticipante(String participante) {
        getParticipantes().remove(participante);
    }

    public void imprimirParticipantes() {
        for (String participante : getParticipantes()) {
            System.out.println(participante);
        }
    }
    
}
