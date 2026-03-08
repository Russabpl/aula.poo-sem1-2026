package exe0;

public class TestaConta {
    public static void main(String args []){

        Conta obj1 = new Conta(1, 100, "Ana");
        System.out.println(obj1.toString());

        obj1.depositar(500);
        obj1.sacar(200);
        System.out.println(obj1.toString());

        Conta obj2 = new Conta(2, 200, "Lucas");

        obj2.sacar(50);
        obj1.encerrarConta();

        obj1.sacar(300);
        obj1.encerrarConta();

        System.out.println(obj2);


    }
}
