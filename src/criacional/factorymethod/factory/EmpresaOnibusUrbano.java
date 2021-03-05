package criacional.factorymethod.factory;

import java.util.Calendar;

import criacional.factorymethod.product.Passagem;
import criacional.factorymethod.product.PassagemOnibusUrbano;

//F�brica concreta
public class EmpresaOnibusUrbano extends Empresa{

	public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
		return new PassagemOnibusUrbano(origem, destino, dataHoraPartida);
	}

}
