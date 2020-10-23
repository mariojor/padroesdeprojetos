package factorymethod;

import java.util.Calendar;

//Produto Concreto
public class PassagemOnibusUrbano extends Passagem {

	public PassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
		super(origem, destino, dataHoraPartida);
	}

	public void exibeDetalhes() {
		System.out.println("Passagem de �nibus urbana:" + this.getOrigem() + " para " + this.getDestino() + ", Data/Hora"
				+ super.df.format(this.getDataHoraPartida().getTime()));
	}

}
