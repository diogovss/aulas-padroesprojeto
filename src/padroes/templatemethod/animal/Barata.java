package padroes.templatemethod.animal;

public class Barata extends Artropode {

    public Barata(int idade) {
        super(idade);
    }

    @Override
    public void morrer() {
        System.out.println("Pisaram na barata");
        super.morrer();
    }

    @Override
    public int getExpectativaDeVida() {
        return 1;
    }
}
