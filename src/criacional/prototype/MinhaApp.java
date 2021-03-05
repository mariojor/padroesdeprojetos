package criacional.prototype;

public class MinhaApp {

    public static void main(String[] args) {

        //Carregar os diferentes tipos de notas
        Partitura.carregaNotas();

        //Compor a canção
        Partitura.getNota("Do").desenha();
        Partitura.getNota("Re").desenha();
        Partitura.getNota("Mi").desenha();
        Partitura.getNota("Fa").desenha();
        Partitura.getNota("Sol").desenha();
        Partitura.getNota("La").desenha();
        Partitura.getNota("Si").desenha();


    }

}
