public class Programa {
    public static void main(String[] args) {
    	
        EventoUnico evento1 = new EventoUnico("Anivers�rio", "Festa de anivers�rio", "2024-04-15", "2024-04-15", "Casa");
        EventoRecorrente evento2 = new EventoRecorrente("Reuni�o de equipe", "Reuni�o semanal", "2024-04-01", "2024-12-31", "Escrit�rio");
        EventoPeriodico evento3 = new EventoPeriodico("Aula de Yoga", "Aula semanal de yoga", "2024-04-01", "2024-12-31", "Academia", DiaSemana.SEGUNDA);

        evento1.adicionarParticipante("Jo�o");
        evento1.adicionarParticipante("Maria");

        evento2.adicionarParticipante("Pedro");
        evento2.adicionarParticipante("Ana");

        evento3.adicionarParticipante("Carlos");
        evento3.adicionarParticipante("Mariana");

        System.out.println("Evento 1:");
        System.out.println("T�tulo: " + evento1.getTitulo());
        System.out.println("Descri��o: " + evento1.getDescricao());
        System.out.println("Data de in�cio: " + evento1.getDataInicio());
        System.out.println("Data de fim: " + evento1.getDataFim());
        System.out.println("Localiza��o: " + evento1.getLocalizacao());
        System.out.println("Participantes:");
        evento1.imprimirParticipantes();

        System.out.println("\nEvento 2:");
        System.out.println("T�tulo: " + evento2.getTitulo());
        System.out.println("Descri��o: " + evento2.getDescricao());
        System.out.println("Data de in�cio: " + evento2.getDataInicio());
        System.out.println("Data de fim: " + evento2.getDataFim());
        System.out.println("Localiza��o: " + evento2.getLocalizacao());
        System.out.println("Participantes:");
        evento2.imprimirParticipantes();

        System.out.println("\nEvento 3:");
        System.out.println("T�tulo: " + evento3.getTitulo());
        System.out.println("Descri��o: " + evento3.getDescricao());
        System.out.println("Data de in�cio: " + evento3.getDataInicio());
        System.out.println("Data de fim: " + evento3.getDataFim());
        System.out.println("Localiza��o: " + evento3.getLocalizacao());
        System.out.println("Dia da semana: " + evento3.getDiaSemana());
        System.out.println("Participantes:");
        evento3.imprimirParticipantes();
    }
}