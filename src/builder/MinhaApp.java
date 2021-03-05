package builder;

public class MinhaApp {

    public static void main(String[] args) {

        Cozinha cozinha = new Cozinha();

        SanduicheBuilder fishBuilder = new FishBuilder();
        SanduicheBuilder hamburgerBuilder = new HamburgerBuilder();


        cozinha.fazSanduiche(fishBuilder);
        fishBuilder.getSanduiche();
        cozinha.fazSanduiche(hamburgerBuilder);
        hamburgerBuilder.getSanduiche();

    }

}
