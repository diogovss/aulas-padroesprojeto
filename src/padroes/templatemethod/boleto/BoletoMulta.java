package padroes.templatemethod.boleto;

class BoletoMulta extends ProcessadorBoleto {
    @Override
    protected void aplicarJurosEDescontos() {
        System.out.println("3. Aplicando JUROS de 2% por quebra de contrato.");
    }
}