public class Streaming {

    private String usuario;
    private String plano;
    private float mensalidade;
    private boolean ativo;
    private String ultimoFilmeAssistido;

    // Construtor
    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;

        if (plano.equals("Básico")) {
            this.mensalidade = 25.90f;
        } else if (plano.equals("Premium")) {
            this.mensalidade = 45.90f;
        } else if (plano.equals("Família")) {
            this.mensalidade = 60.90f;
        }

        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    // Método para assistir filme
    public void assistirFilme(String nomeFilme) {
        if (ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta suspensa. Pague a fatura.");
        }
    }

    // Cancelar assinatura
    public void cancelarAssinatura() {
        this.ativo = false;
    }

    // toString
    public String toString() {

        String status;

        if (ativo) {
            status = "Ativo";
        } else {
            status = "Suspenso";
        }

        return "Usuário: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: " + mensalidade +
                "\nStatus: " + status +
                "\nÚltimo filme assistido: " + ultimoFilmeAssistido;
    }
}
