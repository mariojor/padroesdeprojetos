package criacional.factorymethod.product;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author m.albuquerque Factory Method Inten��o: definir uma interface para
 *         criar um objeto, mas deixar as subclasses decidirem que classe
 *         instanciar. Criar uma instancia de varias classes derivadas.
 */

//Produto
public abstract class Passagem {

	private String origem;
	private String destino;
	private Calendar dataHoraPartida;

	protected SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	public Passagem(String origem, String destino, Calendar dataHoraPartida) {
		this.origem = origem;
		this.destino = destino;
		this.dataHoraPartida = dataHoraPartida;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getDataHoraPartida() {
		return dataHoraPartida;
	}

	public void setDataHoraPartida(Calendar dataHoraPartida) {
		this.dataHoraPartida = dataHoraPartida;
	}
	
	public abstract void exibeDetalhes();
}