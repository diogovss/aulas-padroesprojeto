package padroes.singleton.impressora;

public class Impressora {

    private static Impressora instance;

    private Impressora() {
        System.out.println("instanciando...");
    }

    public static Impressora getInstance() {
        if (instance == null) {
            instance = new Impressora();
        }
        return instance;
    }

    public void imprimir(String documento) {
        System.out.println("Imprimindo: " + documento);
    }

    public void copiar(String documento) {
        System.out.println("Copiando: " + documento);
    }
}
