package src;

public class ContaBanco {
    
       private int numero;
       private String agencia;
       private String nomeCliente;
       private double saldo; 

       public ContaBanco(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
       }

       public void exibirMensagem() {
        System.out.println("olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + "e seu saldo " + saldo + "já está disponível para saque.");
       }

}
