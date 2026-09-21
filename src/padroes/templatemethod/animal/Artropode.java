package padroes.templatemethod.animal;

public class Artropode extends SerVivo {

    public Artropode(int idade) {
        super(idade);
    }

    @Override
    public void nascer() {
        System.out.println("Artropode nascendo..");
    }

    @Override
    public void crescer() {
        System.out.println("Artropode crescendo..");
    }

    @Override
    public void reproduzir() {
        System.out.println("Artropode reproduzindo..");
    }

    @Override
    public void morrer() {
        System.out.println("Artropode morrendo..");
    }

    @Override
    public int getExpectativaDeVida() {
        return 2;
    }
}
