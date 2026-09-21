package padroes.strategy.autenticacao;

class AutenticacaoToken implements MecanismoAutenticacao {
    public boolean validar(String usuario, String credencial) {
        System.out.println("Validando usuário " + usuario + " via Token SMS/Email...");
        return "999-000".equals(credencial);
    }
}