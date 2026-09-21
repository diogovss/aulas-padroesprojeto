package padroes.state.motorista;

public class TesteMotoristaState {
    public static void main(String[] args) {
        MotoristaApp glaucon = new MotoristaApp("Glaucon", "BMW 320i");

        System.out.println(glaucon.getStatus().getDescricao());
        glaucon.getStatus().ficarDisponivel(glaucon);
        System.out.println(glaucon.getStatus().getDescricao());
        glaucon.getStatus().iniciarCorrida(glaucon);
    }
}
