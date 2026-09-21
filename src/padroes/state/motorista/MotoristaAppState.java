package padroes.state.motorista;

public interface MotoristaAppState {

    String getDescricao();
    void ficarDisponivel(MotoristaApp motoristaApp);
    void pausar(MotoristaApp motoristaApp);
    void aguardarPassageiro(MotoristaApp motoristaApp);
    void abastecer(MotoristaApp motoristaApp);
    void fazerManutencao(MotoristaApp motoristaApp);
    void iniciarCorrida(MotoristaApp motoristaApp);
    void finalizarCorrida(MotoristaApp motoristaApp);
    void suspender(MotoristaApp motoristaApp);
    void bloquear(MotoristaApp motoristaApp);
    void reativar(MotoristaApp motoristaApp);

}
