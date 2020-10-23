package factorymethod.factory;

import java.util.Calendar;

import factorymethod.product.Passagem;
import factorymethod.product.PassagemOnibusInterestadual;

//Fábrica concreta
public class EmpresaOnibusInterestadual extends Empresa {

	public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
		return new PassagemOnibusInterestadual(origem, destino, dataHoraPartida);
	}

}
