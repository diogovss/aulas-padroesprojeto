package padroes.templatemethod.animal;

public class Mamifero extends SerVivo {

    public Mamifero(int idade) {
        super(idade);
    }

    public void nascer() {
        System.out.println("Mamífero nascendo.");
    }

    public void crescer() {
        System.out.println("Mamífero crescendo.");
    }

    public void reproduzir() {
        System.out.println("Mamífero reproduzindo.");
    }

    public void morrer() {
        System.out.println("Mamífero se foi.");
    }

    @Override
    public int getExpectativaDeVida() {
        return 95;
    }
}
