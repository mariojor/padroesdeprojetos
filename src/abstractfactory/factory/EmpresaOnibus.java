package abstractfactory.factory;

import java.util.Calendar;

import abstractfactory.product.PassagemOnibusInterestadual;
import abstractfactory.product.PassagemOnibusUrbano;

//F�brica
public abstract class EmpresaOnibus {

	public abstract PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida);
	public abstract PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida);
	
}
