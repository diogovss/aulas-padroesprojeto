package padroes.templatemethod.animal;

public class Cachorro extends Mamifero {

    public Cachorro(int idade) {
        super(idade);
    }

    @Override
    public void crescer() {
        System.out.println("Cachorro crescendo");
    }

    @Override
    public int getExpectativaDeVida() {
        return 20;
    }
}
