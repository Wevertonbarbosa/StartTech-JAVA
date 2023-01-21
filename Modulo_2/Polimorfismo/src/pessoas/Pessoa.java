package pessoas;

import java.util.Scanner;

public abstract class Pessoa {

    protected Scanner scanner = new Scanner(System.in);
    protected String nome;
    protected String email;
    protected double deposito;

    public Pessoa() {
        this.nome = nome;
        this.email = email;
        this.deposito = deposito;
    }

}
