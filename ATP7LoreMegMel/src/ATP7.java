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
                for (int i = 0; i <= numero ; i++) {

                    if ( i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                System.out.println("---------------Cálculo de Números Ìmpares----------------");
                System.out.println("Informe um número: ");
                int numero2 = sc.nextInt();
                for (int i = 0; i <= numero2 ; i++) {

                    if ( i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < 150; i++) {
                    boolean primo = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            primo = false;
                        }

                    }
                    if (primo) {
                        System.out.println(i);
                    }
                }

        }
    }
}
