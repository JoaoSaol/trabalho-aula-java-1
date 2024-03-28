
import java.util.HashSet;
import java.util.Set;

public class EventoRecorrente extends Evento {

	private Set<String> diasSemanas;
	
    public EventoRecorrente(String titulo, String descricao, String dataInicio, String dataFim, String localizacao) {
		super(titulo, descricao, dataInicio, dataFim, localizacao);
		this.diasSemanas = new HashSet<>();
		// TODO Auto-generated constructor stub
	}
    
    public void adicionarDiasDaSemana(String diasSemana) {
    	diasSemanas.add(diasSemana);
    }

    public void removerDiasDaSemana(String diasSemana) {
    	diasSemanas.remove(diasSemana);
    }

    public void imprimirDiasDaSemana() {
        for (String diasSemana : diasSemanas) {
            System.out.println(diasSemana);
        }
    }
    
}
