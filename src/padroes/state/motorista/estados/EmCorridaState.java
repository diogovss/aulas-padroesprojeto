package padroes.state.motorista.estados;

import padroes.state.motorista.MotoristaApp;
import padroes.state.motorista.MotoristaAppState;

public class EmCorridaState implements MotoristaAppState {
    @Override
    public String getDescricao() {
        return "Em Corrida";
    }

    @Override
    public void ficarDisponivel(MotoristaApp motoristaApp) {

    }

    @Override
    public void pausar(MotoristaApp motoristaApp) {

    }

    @Override
    public void aguardarPassageiro(MotoristaApp motoristaApp) {

    }

    @Override
    public void abastecer(MotoristaApp motoristaApp) {

    }

    @Override
    public void fazerManutencao(MotoristaApp motoristaApp) {

    }

    @Override
    public void iniciarCorrida(MotoristaApp motoristaApp) {

    }

    @Override
    public void finalizarCorrida(MotoristaApp motoristaApp) {

    }

    @Override
    public void suspender(MotoristaApp motoristaApp) {

    }

    @Override
    public void bloquear(MotoristaApp motoristaApp) {

    }

    @Override
    public void reativar(MotoristaApp motoristaApp) {

    }
}
