package criacional.factorymethod.factory;

import java.util.Calendar;

import criacional.factorymethod.product.Passagem;

//F�brica
public abstract class Empresa {

	public abstract Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida);
	
}
