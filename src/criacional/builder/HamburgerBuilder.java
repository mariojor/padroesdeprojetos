package criacional.builder;

public class HamburgerBuilder extends SanduicheBuilder{

    private Sanduiche s = new Hamburger();

    public void abrePao(){
        System.out.println("Abre pão de Hamburger");
    }
    public void insereIgredientes(){
        System.out.println("Insere carne e queijo");
    }
    public void fechaPao(){
        System.out.println("Fecha pao de Hamburger");
    }
    public Sanduiche getSanduiche(){
        System.out.println("Hamburger está pronto");
        return s;
    }
}
