package padroes.strategy.autenticacao;

interface MecanismoAutenticacao {
    boolean validar(String usuario, String credencial);
}