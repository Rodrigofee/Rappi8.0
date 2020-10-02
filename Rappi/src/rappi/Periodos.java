package rappi;

import java.util.Scanner;

public class Periodos implements Estado {

    public Estado showMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu cpf:");

        int cpf = sc.nextInt();

        if (cpf != 0) {
           
        }
        System.out.println("Perídos:");
        System.out.println("10/01/2020 - 01/12/2020\n");
        System.out.println("Silver        4.000 Pontos\n");

        System.out.println("Digite 1 para prosseguir");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            return new Transacao();
        }

        return this;

    }

}
