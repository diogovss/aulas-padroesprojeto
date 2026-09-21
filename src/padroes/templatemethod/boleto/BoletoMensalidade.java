package padroes.templatemethod.boleto;

class BoletoMensalidade extends ProcessadorBoleto {
    @Override
    protected void aplicarJurosEDescontos() {
        System.out.println("3. Aplicando DESCONTO de 10% para pagamento antecipado de mensalidade.");
    }
}