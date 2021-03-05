package builder;

public class Cozinha {
    public void fazSanduiche(SanduicheBuilder builder){
        builder.abrePao();
        builder.insereIgredientes();
        builder.fechaPao();
    }
}
