import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do seu processo: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o valor do seu processo: ");
        num2 = scanner.nextInt();

        try{
            ImprimirNumerosDiferenca(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void ImprimirNumerosDiferenca( int num1, int num2) throws ParametrosInvalidosException{
        if(num1 > num2){
            throw new ParametrosInvalidosException();
        }

        for(int i = num1 + 13; i < num2; i++){
            System.out.println(i);
        }
    }
}
