package SistemaEvento;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            Evento evento1 = new Evento("Confer�ncia", "Confer�ncia sobre Java", new Date(124, 0, 15), new Date(124, 0, 17), "Centro de Conven��es");
            EventoRecorrente evento2 = new EventoRecorrente("Reuni�o", "Reuni�o de Trabalho", new Date(124, 02, 12), new Date(124, 02, 19), "Escrit�rio", 7);
            EventoPeriodico evento3 = new EventoPeriodico("Aula", "Aula de Programa��o", new Date(124, 01, 28), new Date(124, 04, 29), "Faculdade", DiaSemana.QUARTA);

            evento1.adicionarParticipante("Professor Nelio Alves");
            evento1.adicionarParticipante("Professor Guanabara");
            evento2.adicionarParticipante("Reuni�o apenas para o time de gest�o e marketing");
            evento3.adicionarParticipante("Alunos da turma de POO 2");

            System.out.println(evento1.toString());
            System.out.println("\n" + evento2.toString() + "\nIntervalo: " + evento2.getIntervalo() + " dias");
            System.out.println("\n" + evento3.toString() + "\nDia da semana: " + evento3.getDiaSemana());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
