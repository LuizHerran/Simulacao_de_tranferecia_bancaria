import java.util.Scanner;

public class Saldo_e_Tranferencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opc = 0;
        int esc = 0;
        String saida;

        Double saldo = 5000.00;
        do {
            System.out.println("""
                    //==================================\\\\
                    ||
                    ||\tFala lindão!
                    ||\tOq c manda pra hj meu rei???
                    ||
                    ||\t1 - Extrato da conta.
                    ||\t2 - Fazer transferencia.
                    ||\t3 - Sair.
                    ||
                    \\\\==================================//""");
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
                                    //========================================\\\\
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
                                        ||\tTranferencia realizada com sucessso!
                                        ||
                                        ||\tSeu saldo atual é de R$%.2f
                                        ||
                                        ||(z) - para voltar para o Menu
                                        \\\\========================================//
                                        """, saldo);

                    saida = sc.nextLine();
                    while(!saida.equalsIgnoreCase("z")) {
                        saida = sc.nextLine();
                    }
                    break;

                case 3:
                    System.out.print("""
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