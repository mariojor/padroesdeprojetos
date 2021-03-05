package estrutural.bridge;

public class MinhaApp {

    public static void main(String[] args) {
        Professor pg = new ProfessorGraduacao(new ProfessorImplGraduacao());
        pg.op();

        Professor ppg = new ProfessorPosGraduacao(new ProfessorImplPosGraduacao());
        ppg.op();


    }

}
