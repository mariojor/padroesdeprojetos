package criacional.abstractfactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

import criacional.abstractfactory.factory.EmpresaOnibus;
import criacional.abstractfactory.product.ConcreteEmpresaOnibus;
import criacional.abstractfactory.product.PassagemOnibusInterestadual;
import criacional.abstractfactory.product.PassagemOnibusUrbano;

public class MeuApp {

	public static void main(String[] args) {

		EmpresaOnibus empOnibus = new ConcreteEmpresaOnibus();
		
		PassagemOnibusUrbano emitePassagemOnibusUrbano = empOnibus.emitePassagemOnibusUrbano("S�o Paulo", "Rio de janeiro", new GregorianCalendar(2020, Calendar.APRIL, 10, 11,0));
		PassagemOnibusInterestadual emitePassagemOnibusInterestadual = empOnibus.emitePassagemOnibusInterestadual("S�o Paulo", "Campinas", new GregorianCalendar(2020, Calendar.MARCH, 10, 11,0));
	
		emitePassagemOnibusInterestadual.exibeDetalhes();
		emitePassagemOnibusUrbano.exibeDetalhes();
	}
}
