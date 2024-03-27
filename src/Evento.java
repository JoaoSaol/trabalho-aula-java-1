import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String titulo;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String localizacao;
    private List<String> participantes;

    public Evento(String titulo, String descricao, String dataInicio, String dataFim, String localizacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.localizacao = localizacao;
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante(String participante) {
        participantes.add(participante);
    }

    public void removerParticipante(String participante) {
        participantes.remove(participante);
    }

    public void imprimirParticipantes() {
        for (String participante : participantes) {
            System.out.println(participante);
        }
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public List<String> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<String> participantes) {
		this.participantes = participantes;
	}
    
    
}
