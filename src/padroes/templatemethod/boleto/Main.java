package padroes.templatemethod.boleto;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- EMITINDO MENSALIDADE ---");
        ProcessadorBoleto mensalidade = new BoletoMensalidade();
        mensalidade.emitirBoleto();

        System.out.println("\n--- EMITINDO MULTA ---");
        ProcessadorBoleto multa = new BoletoMulta();
        multa.emitirBoleto();
    }
}