package padroes.templatemethod.animal;

public abstract class SerVivo {

    int idade;

    public SerVivo(int idade) {
        this.idade = idade;
    }

    public void inicializar() {
        nascer();
        crescer();
        reproduzir();
        if (idade > getExpectativaDeVida()){
            morrer();
            System.out.println("Se tornando anjo...");
        }
    }

    public abstract void nascer();
    public abstract void crescer();
    public abstract void reproduzir();
    public abstract void morrer();
    public abstract int getExpectativaDeVida();

}
