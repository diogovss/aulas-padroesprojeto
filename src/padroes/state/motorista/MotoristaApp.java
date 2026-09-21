package padroes.state.motorista;

import padroes.state.motorista.estados.OfflineState;

public class MotoristaApp {

    private String nomeMotorista;
    private String modeloCarro;
    private MotoristaAppState status;

    public MotoristaApp(String nomeMotorista, String modeloCarro) {
        this.nomeMotorista = nomeMotorista;
        this.modeloCarro = modeloCarro;
        status = new OfflineState();
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public MotoristaAppState getStatus() {
        return status;
    }

    public void setStatus(MotoristaAppState status) {
        this.status = status;
    }
}
