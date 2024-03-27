
public class EventoUnico extends Evento {
    public EventoUnico(String titulo, String descricao, String dataInicio, String dataFim, String localizacao) {
		super(titulo, descricao, dataInicio, dataFim, localizacao);
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
