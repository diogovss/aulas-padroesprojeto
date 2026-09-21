package padroes.strategy.autenticacao;

class AutenticacaoSenha implements MecanismoAutenticacao {
    public boolean validar(String usuario, String credencial) {
        System.out.println("Validando usuário " + usuario + " via Senha...");
        return "123456".equals(credencial);
    }
}