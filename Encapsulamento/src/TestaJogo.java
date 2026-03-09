public class TestaJogo {

    public static void main(String[] args){

        JogoBasquete jogo = new JogoBasquete("Lakers", "Bulls");
        jogo.registrarPonto("casa", 2);
        jogo.registrarPonto("visitante", 3);

        System.out.println(jogo);
    }
}
