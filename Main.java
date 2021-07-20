import java.util.Scanner;
public class Main {

    public static void main(String [] args) {

        int inicio;
        double valorDaVenda;
        String nomeDoCliente;

        Scanner in = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de vendas.");

        System.out.println("Para iniciar uma venda, digite 1. Para sair, digite 0.");
        inicio = in.nextInt();

        if(inicio==0){
            System.out.println("Tenha um bom dia!");
        } else if(inicio==1){

            System.out.println("Digite uma placa (3 Letras, 4 Números): ");
            String placaEntrada = in.next();
            Carro carro1 = new Carro (placaEntrada);

            System.out.println("Digite o nome do cliente: ");
            nomeDoCliente = in.next();
            Cliente cliente1 = new Cliente(nomeDoCliente);

            System.out.println("Digite o valor da venda: ");
            valorDaVenda = in.nextDouble();



            Venda venda1 = new Venda(valorDaVenda, nomeDoCliente, placaEntrada);

            System.out.println("Nome do Cliente: " + cliente1.getNome() + " Carro: " + carro1.getPlaca());
            System.out.println("Valor da Venda:"+ venda1.getValor());


        } else {
            System.out.println("Valor inválido!");
        }
        

    }

}
