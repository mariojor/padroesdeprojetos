package criacional.abstractfactory.factory;

import java.util.Calendar;

import criacional.abstractfactory.product.PassagemOnibusInterestadual;
import criacional.abstractfactory.product.PassagemOnibusUrbano;

//F�brica
public abstract class EmpresaOnibus {

	public abstract PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida);
	public abstract PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida);
	
}
