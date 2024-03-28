package SistemaEvento;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    private String titulo;
    private String descricao;
    private Date dataDeInicio;
    private Date dataDeFim;
    private String localizacao;
    private List<String> participantes;

    public Evento(String titulo, String descricao, Date dataDeInicio, Date dataDeFim, String localizacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataDeInicio = dataDeInicio;
        this.dataDeFim = dataDeFim;
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

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public void setDataDeFim(Date dataDeFim) {
        this.dataDeFim = dataDeFim;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataInicioFormatada = dateFormat.format(dataDeInicio);
        String dataFimFormatada = dateFormat.format(dataDeFim);

        return "Titulo: " + titulo + "\n" +
               "Descrição: " + descricao + "\n" +
               "Data de Início: " + dataInicioFormatada + "\n" +
               "Data de Fim: " + dataFimFormatada + "\n" +
               "Localização: " + localizacao + "\n" +
               "Participantes: " + participantes.toString();
    }
}


