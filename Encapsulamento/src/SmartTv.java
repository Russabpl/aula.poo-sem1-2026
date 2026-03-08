public class SmartTv {

    private String marca, modelo;
    private int volume;
    private boolean conectadoNET;

    //construtor sem parametro

    public SmartTv() {
        this.volume = 0;
        this.marca = "Indefinido";
        this.modelo = "Indefinido";
        this.conectadoNET = false;
    }

    //construtor com parametro
    public SmartTv(String marca, String modelo, int volume) {
        this.marca = marca;
        this.modelo = modelo;
        this.setVolume(volume);
        this.conectadoNET = false;
    }

    //altera o valor do volume
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else System.out.println("Volume inválido.");
    }


    //obter o valor do volume
    public int getVolume() {
        return this.volume;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    //aumentar o volume
    public void aumentarVolume(int x) {
        this.setVolume(this.volume + x);
    }

    public void diminuiVolume(int x) {
        this.setVolume(this.volume - x);
    }

    //metodo publico para entrar no YouTube
    public void entrarYouTube() {
        if (this.conectadoNET) {
            System.out.println("Abrindo YouTube...");
        } else {
            System.out.println("Internet não encontrada...");
        }
    }


    //metodo privado que liga a internet
    public void LigarInternet(){
        System.out.println("Buscando sinal de Wi-Fi");
        System.out.println("Verificando as credenciais");
        System.out.println("Autenticando IP");

        //liga a SmartTV na internet
        int ramdomico = (int) (Math.random() * 10); //gera um número entre 0 e 9
        System.out.println(ramdomico);
        if (ramdomico< 5){
            this.conectadoNET = true;
            return;
        }
        else {
            this.conectadoNET = false;
            return;
        }

    }

    public String toString(){
        return "Marca: " + this.marca +
                "Modelo: " + this.modelo +
                "Volume: " + this.volume;
    }
}

