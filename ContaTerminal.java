import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


    //TODO:"Conhecer e importar a classe Scanner"
        // TODO:Exibir msg para o usuario
        //TODO:Obter pelo scanner os valores digitados no terminal
        //TODO:Exibir msg conta criada

        System.out.println("Digite seu nome e sobrenome.");
        String nomeCliente = scanner.next();

        System.out.println("Por favor digite o numero da conta.");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor digite o seu deposito inicial:");
        Double saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente.concat(", obrigado por criar uma conta em nosso banco, sua agência é ") + agencia.concat("conta: ") + conta + " Pe o seu saldo já está disponível para saque.");


    }
}
