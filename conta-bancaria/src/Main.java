import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;
        String agencia, momeDoCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Sistema Bancário DIO!");

        System.out.println("Por favor, digite o número da Agência !");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome da Agência !");
        agencia = scanner.next();

        System.out.println("Por favor, digite o saldo da Agência !");
        saldo = scanner.nextDouble();

        System.out.println("Por favor, digite o nome do Cliente !");
        momeDoCliente = scanner.next();

        System.out.println("Olá " +momeDoCliente+", obrigado por criar uma conta em nosso banco, sua agência é "
                +agencia+", conta " +numero+
                " e seu saldo "+saldo+" já está disponível para saque");

    }
}