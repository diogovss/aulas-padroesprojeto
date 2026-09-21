package padroes.state.motorista.estados;

import padroes.state.motorista.MotoristaApp;
import padroes.state.motorista.MotoristaAppState;

public class OfflineState implements MotoristaAppState {
    @Override
    public String getDescricao() {
        return "Offline";
    }

    @Override
    public void ficarDisponivel(MotoristaApp motoristaApp) {
        System.out.println("Disponibilizando o carro para passageiro");
        motoristaApp.setStatus(new DisponivelState());
    }

    @Override
    public void pausar(MotoristaApp motoristaApp) {
        System.out.println("OPERAÇÃO NÃO PERMITIDA PELA MÁQUINA DE ESTADOS!!!");
    }

    @Override
    public void aguardarPassageiro(MotoristaApp motoristaApp) {
        System.out.println("OPERAÇÃO NÃO PERMITIDA PELA MÁQUINA DE ESTADOS!!!");
    }

    @Override
    public void abastecer(MotoristaApp motoristaApp) {
        System.out.println("OPERAÇÃO NÃO PERMITIDA PELA MÁQUINA DE ESTADOS!!!");
    }

    @Override
    public void fazerManutencao(MotoristaApp motoristaApp) {
        System.out.println("OPERAÇÃO NÃO PERMITIDA PELA MÁQUINA DE ESTADOS!!!");
    }

    @Override
    public void iniciarCorrida(MotoristaApp motoristaApp) {
        System.out.println("OPERAÇÃO NÃO PERMITIDA PELA MÁQUINA DE ESTADOS!!!");
    }

    @Override
    public void finalizarCorrida(MotoristaApp motoristaApp) {
        System.out.println("OPERAÇÃO NÃO PERMITIDA PELA MÁQUINA DE ESTADOS!!!");
    }

    @Override
    public void suspender(MotoristaApp motoristaApp) {
        System.out.println("Denúncia realizada por passageiros. Motorista suspenso!!!");
        motoristaApp.setStatus(new SuspensoState());
    }

    @Override
    public void bloquear(MotoristaApp motoristaApp) {
        System.out.println("OPERAÇÃO NÃO PERMITIDA PELA MÁQUINA DE ESTADOS!!!");
    }

    @Override
    public void reativar(MotoristaApp motoristaApp) {
        System.out.println("OPERAÇÃO NÃO PERMITIDA PELA MÁQUINA DE ESTADOS!!!");
    }
}
