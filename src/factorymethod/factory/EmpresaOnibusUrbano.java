package factorymethod.factory;

import java.util.Calendar;

import factorymethod.product.Passagem;
import factorymethod.product.PassagemOnibusUrbano;

//Fábrica concreta
public class EmpresaOnibusUrbano extends Empresa{

	public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
		return new PassagemOnibusUrbano(origem, destino, dataHoraPartida);
	}

}
