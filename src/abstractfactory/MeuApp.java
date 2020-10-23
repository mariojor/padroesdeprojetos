package abstractfactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

import abstractfactory.factory.EmpresaOnibus;
import abstractfactory.product.ConcreteEmpresaOnibus;
import factorymethod.factory.Empresa;
import factorymethod.factory.EmpresaOnibusInterestadual;
import factorymethod.factory.EmpresaOnibusUrbano;
import factorymethod.product.Passagem;

public class MeuApp {

	public static void main(String[] args) {

		EmpresaOnibus empOnibus = new ConcreteEmpresaOnibus();
		
	}
}
