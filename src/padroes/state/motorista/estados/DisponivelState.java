package padroes.state.motorista.estados;

import padroes.state.motorista.MotoristaApp;
import padroes.state.motorista.MotoristaAppState;

public class DisponivelState implements MotoristaAppState {
    @Override
    public String getDescricao() {
        return "Disponivel";
    }
    @Override
    public void ficarDisponivel(MotoristaApp motoristaApp) {
        System.out.println("OPERAÇÃO NÃO PERMITIDA PELA MÁQUINA DE ESTADOS!!!");
    }

    @Override
    public void pausar(MotoristaApp motoristaApp) {
        System.out.println("Pausando motorista.");
        motoristaApp.setStatus(new PausadoState());
    }

    @Override
    public void aguardarPassageiro(MotoristaApp motoristaApp) {
        System.out.println("Aguardando passageiro");
        motoristaApp.setStatus(new AguardandoPassageiroState());
    }

    @Override
    public void abastecer(MotoristaApp motoristaApp) {
        motoristaApp.setStatus(new EmAbastecimentoState());
    }

    @Override
    public void fazerManutencao(MotoristaApp motoristaApp) {
        System.out.println("Veículo indo para manutenção");
        motoristaApp.setStatus(new EmManutencaoState());
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
        System.out.println("Motorista denunciado. Suspensão aplicada.");
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
