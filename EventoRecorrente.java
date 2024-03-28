package SistemaEvento;

import java.util.Date;

public class EventoRecorrente extends Evento {
	private int intervalo;
	
    public EventoRecorrente(String titulo, String descricao, Date dataDeInicio, Date dataDeFim, String localizacao, int intervalo) {
		super(titulo, descricao, dataDeInicio, dataDeFim, localizacao);
		this.intervalo = intervalo;
	}

    public void definirIntervalo(int intervalo) {
        this.intervalo = intervalo;
    }

    public int getIntervalo() {
        return intervalo;
    }

	@Override
	public String toString() {
		return super.toString();
	}
}
