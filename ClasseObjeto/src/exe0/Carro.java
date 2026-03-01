package exe0;
public class Carro {
    //criando variáveis com visibilidade pública
    //qualquer outra calsse pode acessar e alterar essas variáveis
    public String marca, modelo, cor, placa;
    public float potencia, velocidade;
    public int ano;
    public boolean motor;


     //metodo construtor
    public Carro(String marca, String modelo, float potencia, int ano, String placa, String cor){
        this.marca =  marca; this.modelo = modelo;
        this.potencia = potencia; this.ano = ano;
        this.placa = placa; this.cor = cor;
        this.motor = false; this.velocidade = 0;
    }
        //ligar carro
        public void ligar(){
        if (!this.motor){
            this.motor = true;
            System.out.println("Motor foi ligado");
        }
    }


    //desliga carro
    public void desligar(){
        if (this.motor ){
            this.motor = false;
            System.out.println("Motor foi desligado");
            this.velocidade = 0;
        }
    }


        //acelerar o carro de x unidades
    public void acelerar (float x){
        if (this.motor){
            this.velocidade = this.velocidade + x;
            System.out.println("Carro acelerado, valor atual " + this.velocidade);
        }
    }
    //frear
   public void frear (float x){
        if (this.motor && this.velocidade - x >= 0){
            this.velocidade -=x;
            System.out.println("Carro freado, valor atual " +this.velocidade);
        }
        else System.out.println("Não foi possivel frear.");
   }




    //converte o objeto em String
    public String toString(){

        // this representa o objeto que chama o metodo
        return  "\nMarca: " +this.marca +
                "\nModelo: "+this.modelo +
                "\nPlaca: "+this.placa +
                "\nPotencia" +this.potencia+
                "\nAno: "+this.ano +
                "\nMotor: " + (this.motor ? "Ligado" : "Desligado" )+
                "\nVelocidade: "+ this.velocidade;// operador ternario





    }
}
