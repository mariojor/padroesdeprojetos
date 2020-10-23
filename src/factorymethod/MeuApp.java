package factorymethod;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MeuApp {

	public static void main(String[] args) {

		Empresa viacaiABCLocal = new EmpresaOnibusUrbano();
		Empresa viacaiABCInter = new EmpresaOnibusInterestadual();
		
		Passagem pU = viacaiABCLocal.emitePassagem("São Paulo", "Campinas", new GregorianCalendar(2020, Calendar.MARCH, 10, 11,0));
		Passagem pI = viacaiABCInter.emitePassagem("São Paulo", "Rio de janeiro", new GregorianCalendar(2020, Calendar.APRIL, 10, 11,0));
		
		pU.exibeDetalhes();
		pI.exibeDetalhes();
		
	}
}
