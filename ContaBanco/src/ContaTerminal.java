import java.util.*;
import java.io.IOException;
public class ContaTerminal {
    int numero;
    String agencia = "067-8";
    String titular;
    double saldo = 0;

    Scanner sc = new Scanner(System.in);

    public void criarConta() {
        System.out.println("Por favor, digite o número da Agência !");
        this.numero = sc.nextInt();
        System.out.println("=================");
        System.out.println("Por favor, digite o seu nome !");
        this.titular = sc.next();
        System.out.println("=================");
        System.out.println("Olá ".concat(titular).concat(", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia).concat(", conta " + numero + " e saldo " + "R$" + saldo + " já disponível para saque.")));
    }

    public void adicionarSaldo(double valor) {
        this.saldo += valor;
        System.out.println(valor + " Adiciona com sucesso!");
    }

}

