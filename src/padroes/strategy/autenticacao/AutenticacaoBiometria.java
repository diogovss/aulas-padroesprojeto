package padroes.strategy.autenticacao;

class AutenticacaoBiometria implements MecanismoAutenticacao {
    public boolean validar(String usuario, String credencial) {
        System.out.println("Validando usuário " + usuario + " via Digital/FaceID...");
        return true; // Simulação de sucesso
    }
}