package builder;

public class FishBuilder extends SanduicheBuilder{

    private Sanduiche s = new FishBurger();

    public void abrePao(){
        System.out.println("Abre pão de fishBurger");
    }
    public void insereIgredientes(){
        System.out.println("Insere file de peixe");
    }
    public void fechaPao(){
        System.out.println("Fecha pao de fishBurger");
    }
    public Sanduiche getSanduiche(){
        System.out.println("FishBurger está pronto");
        return s;
    }

}
