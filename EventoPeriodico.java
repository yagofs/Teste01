package SistemaEvento;

import java.util.Date;

public class EventoPeriodico extends Evento {
    private DiaSemana diaSemana;

    public EventoPeriodico(String titulo, String descricao, Date dataDeInicio, Date dataDeFim, String localizacao, DiaSemana diaSemana) {
        super(titulo, descricao, dataDeInicio, dataDeFim, localizacao);
        this.diaSemana = diaSemana;
    }

    public void definirDiaSemana(DiaSemana dia) {
        this.diaSemana = dia;
    }

    public String getDiaSemana() {
        switch (diaSemana) {
            case DOMINGO:
                return "Domingo";
            case SEGUNDA:
                return "Segunda-feira";
            case TERÇA:
                return "Terça-feira";
            case QUARTA:
                return "Quarta-feira";
            case QUINTA:
                return "Quinta-feira";
            case SEXTA:
                return "Sexta-feira";
            case SABADO:
                return "Sábado";
            default:
                return "Dia inválido";
        }
    }
}
