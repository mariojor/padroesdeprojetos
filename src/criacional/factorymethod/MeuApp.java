package criacional.factorymethod;

import java.util.Calendar;
import java.util.GregorianCalendar;

import criacional.factorymethod.factory.Empresa;
import criacional.factorymethod.factory.EmpresaOnibusInterestadual;
import criacional.factorymethod.factory.EmpresaOnibusUrbano;
import criacional.factorymethod.product.Passagem;

public class MeuApp {

	public static void main(String[] args) {

		Empresa viacaiABCLocal = new EmpresaOnibusUrbano();
		Empresa viacaiABCInter = new EmpresaOnibusInterestadual();
		
		Passagem pU = viacaiABCLocal.emitePassagem("S�o Paulo", "Campinas", new GregorianCalendar(2020, Calendar.MARCH, 10, 11,0));
		Passagem pI = viacaiABCInter.emitePassagem("S�o Paulo", "Rio de janeiro", new GregorianCalendar(2020, Calendar.APRIL, 10, 11,0));
		
		pU.exibeDetalhes();
		pI.exibeDetalhes();
		
	}
}
