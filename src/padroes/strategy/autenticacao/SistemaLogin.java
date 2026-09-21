package padroes.strategy.autenticacao;

class SistemaLogin {
    private MecanismoAutenticacao mecanismo;

    public void setMecanismo(MecanismoAutenticacao mecanismo) {
        this.mecanismo = mecanismo;
    }

    public void realizarLogin(String usuario, String credencial) {
        if (mecanismo == null) {
            System.out.println("Erro: Nenhum método de autenticação selecionado.");
            return;
        }

        if (mecanismo.validar(usuario, credencial)) {
            System.out.println("Acesso concedido para: " + usuario);
        } else {
            System.out.println("Acesso negado.");
        }
    }
}