package abstractfactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

import abstractfactory.factory.EmpresaOnibus;
import abstractfactory.product.ConcreteEmpresaOnibus;
import abstractfactory.product.PassagemOnibusInterestadual;
import abstractfactory.product.PassagemOnibusUrbano;

public class MeuApp {

	public static void main(String[] args) {

		EmpresaOnibus empOnibus = new ConcreteEmpresaOnibus();
		
		PassagemOnibusUrbano emitePassagemOnibusUrbano = empOnibus.emitePassagemOnibusUrbano("São Paulo", "Rio de janeiro", new GregorianCalendar(2020, Calendar.APRIL, 10, 11,0));
		PassagemOnibusInterestadual emitePassagemOnibusInterestadual = empOnibus.emitePassagemOnibusInterestadual("São Paulo", "Campinas", new GregorianCalendar(2020, Calendar.MARCH, 10, 11,0));
	
		emitePassagemOnibusInterestadual.exibeDetalhes();
		emitePassagemOnibusUrbano.exibeDetalhes();
	}
}
