import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
            Scanner scanner = new Scanner(System.in);
        
            System.out.println("Digite o nome do cliente: ");
            String NomeCliente = scanner.nextLine();
        
            System.out.println("Digite o numero de sua Agencia: ");
            String Agencia = scanner.nextLine();
        
            System.out.println("Digite o numero de sua Conta: ");
            int NumeroConta = scanner.nextInt();
        
            System.out.println("Digite o saldo de susa Conta: ");
            double SaldoConta = scanner.nextDouble();
        
            System.err.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + NumeroConta + " e seu saldo R$ " + SaldoConta + " já está disponível para saque.");
        
            scanner.close();              
        
          }
        }
        

