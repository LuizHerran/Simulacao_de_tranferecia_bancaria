import java.util.Scanner;

public class Saldo_e_Tranferencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = 0;
        int esc = 0;
        String saida;
        Double saldo = 5000.00;

        System.out.printf("Digite seu nome: ");
        String nome = sc.nextLine();

        do {
            System.out.printf("""
                    //==================================\\\\
                    ||
                    ||\tOLá %s!
                    ||\tEscolha uma opção: 
                    ||
                    ||\t1 - Extrato da conta.
                    ||\t2 - Fazer transferencia.
                    ||\t3 - Fazer deposito.
                    ||\t4 - Sair.
                    ||
                    \\\\==================================//\n""", nome);
            esc = sc.nextInt();
            sc.nextLine();
            switch(esc){
                case 1:
                    System.out.printf("""
                                    //==================================\\\\
                                    ||
                                    ||\tSeu saldo é de: R$%.2f
                                    ||
                                    || (z) - para voltar ao Menu.
                                    \\\\==================================//
                                    """, saldo);
                    saida = sc.nextLine();
                    while(!saida.equalsIgnoreCase("z")){
                        saida = sc.nextLine();
                    }
                    break;

                case 2:
                    if(saldo <= 1){
                        System.out.printf("""
                                        //======================================\\\\
                                        ||
                                        ||\tSem saldo para fazer tranferncia!
                                        ||\tValor minimo de tranferencia R$1,00
                                        ||\tSeu saldo é de R$%.2f
                                        ||
                                        || (z) - para voltar ao Menu.
                                        \\\\====================================//""", saldo);
                        saida = sc.nextLine();
                        while(!saida.equalsIgnoreCase("z")) {
                            saida = sc.nextLine();
                        }
                        break;
                    }

                    System.out.print("""
                                    //==================================\\\\
                                    ||
                                    ||\tQuanto deseja tranferir: """);
                    Double transferir = sc.nextDouble();
                    System.out.print("""
                                    ||
                                    \\\\==================================//
                                    """);
                    if(transferir > saldo){
                        System.out.printf("""
                                    //==================================\\\\
                                    ||
                                    ||\tSaldo insuficiente!
                                    ||\tSeu saldo é de R$%.2f
                                    ||
                                    ||(z) - para voltar ao Menu.
                                    \\\\==================================//""", saldo);
                        saida = sc.nextLine();
                        while(!saida.equalsIgnoreCase("z")) {
                            saida = sc.nextLine();
                        }
                        break;
                    }
                    saldo -= transferir;
                    System.out.printf("""
                                        //========================================\\\\
                                        ||
                                        ||\tTranferencia de R$%.2f
                                        ||\trealizada com sucessso!
                                        ||
                                        ||\tSeu saldo atual é de R$%.2f
                                        ||
                                        ||(z) - para voltar para o Menu
                                        \\\\========================================//
                                        """, transferir, saldo);

                    saida = sc.nextLine();
                    while(!saida.equalsIgnoreCase("z")) {
                        saida = sc.nextLine();
                    }
                    break;

                case 3:

                   System.out.print("""
                                    //==================================\\\\
                                    ||
                                    ||\tQuanto deseja depositar: """);
                    Double deposito = sc.nextDouble();
                    System.out.print("""
                                    ||
                                    \\\\==================================//
                                    """);
                    if(deposito < 1){
                        System.out.printf("""
                                    //==================================\\\\
                                    ||
                                    ||\tValor insuficiente!
                                    ||\tDeposito minimo de R$1,00
                                    ||
                                    ||(z) - para voltar ao Menu.
                                    \\\\==================================//""", saldo);
                        saida = sc.nextLine();
                        while(!saida.equalsIgnoreCase("z")) {
                            saida = sc.nextLine();
                        }
                        break;
                    }
                    saldo += deposito;
                    System.out.printf("""
                                        //========================================\\\\
                                        ||
                                        ||\tDeposito de R$%.2f
                                        ||\trealizado com sucessso!
                                        ||
                                        ||\tSeu saldo atual é de R$%.2f
                                        ||
                                        ||(z) - para voltar para o Menu
                                        \\\\========================================//
                                        """, deposito, saldo);

                    saida = sc.nextLine();
                    while(!saida.equalsIgnoreCase("z")) {
                        saida = sc.nextLine();
                    }

                    break;

                case 4:
                    System.out.println("""
                                    //========================================\\\\
                                    ||
                                    ||\tObrigado por usar nossos serviços!
                                    ||
                                    \\\\======================================//""");
                    opc = 1;
                    break;
            }
        }while(opc == 0);
    }
}