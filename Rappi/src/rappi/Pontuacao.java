package rappi;

import java.util.Scanner;

public class Pontuacao implements Estado {

    public Estado showMenu() {

        System.out.println("INFORMAÇÕES \n\nPontos:");
        System.out.println("Cartão                       +1.5X");
        System.out.println("Prime                        +2.0X");
        System.out.println("Rappi Pay                    +1.5X");
        System.out.println("QRcode em loja Pappi Pay     +2.0X\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para prosseguir");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            return new Niveis();
        } else {
            System.out.println("Opção não encontrada!");
        }
        return this;
    }

}
