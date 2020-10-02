package rappi;

import java.util.Scanner;

public class Niveis implements Estado {

    public Estado showMenu() {
        System.out.println("Nivés:");
        System.out.println("Bronze");
        System.out.println("Silver");
        System.out.println("Golder");
        System.out.println("Diamante\n");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 1 para continuar");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            return new Periodos();
        }
        return this;

    }
}
