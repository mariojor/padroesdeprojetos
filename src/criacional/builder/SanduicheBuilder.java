package criacional.builder;

public abstract class SanduicheBuilder {

    public abstract void abrePao();
    public abstract void insereIgredientes();
    public abstract void fechaPao();
    public abstract Sanduiche getSanduiche();
}
