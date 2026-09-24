package padroes.strategy.autenticacao;

public class Main {
    public static void main(String[] args) {
        SistemaLogin sistema = new SistemaLogin();

        // Senha
        sistema.setMecanismo(new AutenticacaoSenha());
        sistema.realizarLogin("admin", "123456");

        System.out.println("---");

        // Biometria
        sistema.setMecanismo(new AutenticacaoBiometria());
        sistema.realizarLogin("usuario_mobile", "hash_biometrico");

        System.out.println("---");

        // Token
        sistema.setMecanismo(new AutenticacaoToken());
        sistema.realizarLogin("usuario_api", "1111-2222");
    }
}
