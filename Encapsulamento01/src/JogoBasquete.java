public class JogoBasquete {
    private String nomeTimeCasa;
    private String nomeTimeVisitante;
    private int pontosCasa;
    private int pontosVisitante;
    private int periodoQuarto;

    // Construtor
    public JogoBasquete(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    // Registrar ponto
    public void registrarPonto(String time, int tipo) {

        if (time.equals("casa")) {
            pontosCasa += tipo;
        } else if (time.equals("visitante")) {
            pontosVisitante += tipo;
        }
    }

    // Próximo quarto
    public void proximoQuarto() {

        if (periodoQuarto < 4) {
            periodoQuarto++;
        } else {
            System.out.println("O jogo terminou!");
        }
    }

    // toString
    public String toString() {

        return nomeTimeCasa + " " + pontosCasa +
                " x " +
                pontosVisitante + " " + nomeTimeVisitante +
                " - Período: " + periodoQuarto;
    }
}

