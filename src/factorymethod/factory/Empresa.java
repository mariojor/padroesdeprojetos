package factorymethod.factory;

import java.util.Calendar;

import factorymethod.product.Passagem;

//Fábrica
public abstract class Empresa {

	public abstract Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida);
	
}
