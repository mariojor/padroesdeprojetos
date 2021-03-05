package criacional.factorymethod.factory;

import java.util.Calendar;

import criacional.factorymethod.product.Passagem;
import criacional.factorymethod.product.PassagemOnibusInterestadual;

//F�brica concreta
public class EmpresaOnibusInterestadual extends Empresa {

	public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
		return new PassagemOnibusInterestadual(origem, destino, dataHoraPartida);
	}

}
