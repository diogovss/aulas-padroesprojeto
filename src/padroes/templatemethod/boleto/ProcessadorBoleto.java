package padroes.templatemethod.boleto;

abstract class ProcessadorBoleto {

    // O Template Method
    public final void emitirBoleto() {
        validarDados();
        calcularValorTotal();
        aplicarJurosEDescontos(); // Passo que varia
        gerarCodigoBarras();
        finalizarEmissao();
    }

    private void validarDados() {
        System.out.println("1. Validando dados do cliente...");
    }

    private void calcularValorTotal() {
        System.out.println("2. Calculando valor total...");
    }

    private void gerarCodigoBarras() {
        System.out.println("4. Gerando linha digitável e código de barras...");
    }

    private void finalizarEmissao() {
        System.out.println("5. Boleto emitido com sucesso!");
    }

    protected abstract void aplicarJurosEDescontos();
}