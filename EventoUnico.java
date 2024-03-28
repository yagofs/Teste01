package SistemaEvento;

import java.util.Date;

public class EventoUnico extends Evento {
    public EventoUnico(String titulo, String descricao, Date dataDeInicio, Date dataDeFim, String localizacao) {
        super(titulo, descricao, dataDeInicio, dataDeFim, localizacao);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
