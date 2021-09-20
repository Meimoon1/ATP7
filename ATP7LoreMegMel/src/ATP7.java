import java.util.Scanner;

public class ATP7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*------------------Bem vindo ao menu de opções------------------*");
        System.out.println("\n 1-Números pares \n 2-Números Ìmpares \n 3-Números Primos \n 4-Juros Compostos \n 5-Sair ");
        int opcao = sc.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("--------------Cálculo de Números Pares-----------");
                System.out.println("Informe um número: ");
                int numero = sc.nextInt();
                for (int i = 0; i <= numero; i++) {

                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                System.out.println("---------------Cálculo de Números Ìmpares----------------");
                System.out.println("Informe um número: ");
                int numero2 = sc.nextInt();
                for (int i = 0; i <= numero2; i++) {

                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 3:
                System.out.println("---------------Cálculo de Números Ìmpares----------------");
                System.out.println("Informe um número: ");
                int numero3 = sc.nextInt();

                for (int i = 0; i <= numero3; i++) {
                    //inicia validacao do numero primo
                    boolean valido = true;
                    while (valido) {
                        //numeros menores que dois não são primos
                        if (i < 2) {
                            valido = false;
                            //o dois é o primeiro numero primo
                        } else if (i == 2) {
                            System.out.println(i);
                            valido = false;
                        } else {
                            //variavel que indica o numero primo e que permite a impressao do numero em tela
                            boolean primo = true;
                            //varredura de todos os numeros a partir de 2 ate o numero anterior ao numero testado
                            for (int cont = 2; cont < i; cont++) {
                                // se o numero for divisivel por qualquer numero, ele deixa de ser primo
                                // nega a variavel primo(que permite a impressao na tela, sai do laco for
                                // e nega a validade do numero quebrando o laco de validacao do numero
                                if (i % cont == 0) {
                                    valido = false;
                                    primo = false;
                                    break;
                                }
                            }

                            //se apos a leitura do laco 'for' nao for encontrado nenhum divisor para o numero, entao ele e primo
                            if (primo) {
                                System.out.println(i);
                                valido = false;
                            }
                        }
                    }
                }
                break;
        }
    }
}
