package SistemaEvento;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            Evento evento1 = new Evento("Conferência", "Conferência sobre Java", new Date(124, 0, 15), new Date(124, 0, 17), "Centro de Convenções");
            EventoRecorrente evento2 = new EventoRecorrente("Reunião", "Reunião de Trabalho", new Date(124, 02, 12), new Date(124, 02, 19), "Escritório", 7);
            EventoPeriodico evento3 = new EventoPeriodico("Aula", "Aula de Programação", new Date(124, 01, 28), new Date(124, 04, 29), "Faculdade", DiaSemana.QUARTA);

            evento1.adicionarParticipante("Professor Nelio Alves");
            evento1.adicionarParticipante("Professor Guanabara");
            evento2.adicionarParticipante("Reunião apenas para o time de gestão e marketing");
            evento3.adicionarParticipante("Alunos da turma de POO 2");

            System.out.println(evento1.toString());
            System.out.println("\n" + evento2.toString() + "\nIntervalo: " + evento2.getIntervalo() + " dias");
            System.out.println("\n" + evento3.toString() + "\nDia da semana: " + evento3.getDiaSemana());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
