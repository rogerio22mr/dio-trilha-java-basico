import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite o numero da Conta!");
        numero = sc.nextInt();
        sc.nextLine();
        sc.next();

        System.out.println("Por favor digite a agencia da Conta!");
        agencia = sc.nextLine();

        System.out.println("Por favor digite o nome do Cliente!");
        nomeCliente = sc.nextLine();
        
        System.out.println("Por favor digite o Saldo da Conta!");
        saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrgiado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}