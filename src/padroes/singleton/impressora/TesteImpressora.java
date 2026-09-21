package padroes.singleton.impressora;

public class TesteImpressora {
    public static void main(String[] args) {
        String documentoParaImprimir = "Boletim de aluno";
        String documentoParaCopiar = "Prova de Padrões de Projeto";

        Impressora impressoraIfma1 = Impressora.getInstance();
        impressoraIfma1.imprimir(documentoParaImprimir);

        Impressora impressoraIfma2 = Impressora.getInstance();
        impressoraIfma2.copiar(documentoParaCopiar);
    }
}
