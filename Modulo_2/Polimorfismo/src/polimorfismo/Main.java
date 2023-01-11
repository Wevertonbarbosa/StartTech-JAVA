package polimorfismo;

public class Main {
    public static void main(String[] args) {

        Conta c = new Conta("Weverto", "wwevert", 1321, 13143,1000);
        c.contaJuridica();
        c.contaFisica();

    }
}