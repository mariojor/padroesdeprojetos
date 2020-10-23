package abstractfactory.product;

import java.util.Calendar;

import abstractfactory.factory.EmpresaOnibus;

public class ConcreteEmpresaOnibus extends EmpresaOnibus {

	@Override
	public PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem, String destino,
			Calendar dataHoraPartida) {
		// TODO Auto-generated method stub
		return null;
	}

}
