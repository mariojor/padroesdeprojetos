package abstractfactory.product;

import java.util.Calendar;

import abstractfactory.factory.EmpresaOnibus;

public class ConcreteEmpresaOnibus extends EmpresaOnibus {

	public PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
		return new ConcretePassagemOnibusUrbano(origem, destino, dataHoraPartida);
	}

	public PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem, String destino,
			Calendar dataHoraPartida) {
		return new ConcretePassagemOnibusInterestadual(origem, destino, dataHoraPartida);
	}

}
