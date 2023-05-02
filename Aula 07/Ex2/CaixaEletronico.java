package Ex2;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome, cpf;
        int numAgen, numConta, i = 0;
        double saldo;
        System.out.println("Nome do Cliente");
        nome = sc.nextLine();
        System.out.println("CPF do Cliente");
        cpf = sc.nextLine();
        System.out.println("Numero da Agencia");
        numAgen = Integer.parseInt(sc.nextLine());
        System.out.println("Numero da Conta");
        numConta = Integer.parseInt(sc.nextLine());
        System.out.println("Saldo inicial");
        saldo = Integer.parseInt(sc.nextLine());
        Agencia agencia = new Agencia(nome,numAgen,numAgen);
        ContaCorrente conta = new ContaCorrente(numConta,numConta,saldo,agencia);
        Cliente cliente = new Cliente(nome,cpf,conta);
        conta.setSaldo(saldo);
        conta.setNumero(numConta);
        conta.setDigito();
        agencia.setAgencia(nome, numConta);
        agencia.setDigito();
        conta.setAgencia(agencia);
        cliente.setConta(conta);
        cliente.setCpf(cpf);
        cliente.setNome(nome);
        do{
            String s = "Qual operação deseja?" + "\n 1 - Sacar \n 2 - Depositar \n 3 - Consultar Saldo \n 4 - Imprimir \n 5 - Sair";
            System.out.println(s);
            i = Integer.parseInt(sc.nextLine());
            switch (i){
                case 1:
                    saldo = conta.getSaldo();
                    System.out.println("Qual é o valor que deseja sacar?");
                    double valor = Double.parseDouble(sc.nextLine());
                    if (valor > saldo){
                        System.out.println("Não tem saldo suficiente");
                    }else {
                        saldo = saldo - valor;
                        System.out.printf("Seu novo saldo é de : %.2f R$ ", saldo);
                    }
                break;
                case 2:
                    System.out.println("Quanto deseja depositar?");
                    valor = Double.parseDouble(sc.nextLine());
                    saldo = saldo + valor;
                    System.out.printf("Seu novo saldo é de : %.2f R$ ", saldo);
                break;
                case 3:
                        System.out.printf("Seu saldo é de : %.2f R$ ", conta.getSaldo());
                break;
                case 4:
                    String a  = "Cliente: "+ cliente.getNome() + "CPF"+ cliente.getCpf() + conta.imprimir(saldo);
                    System.out.println(a);
                break;  
            }
        }while(i != 5);
        System.out.println("Sessão finalizada");
        sc.close();
    }
}
