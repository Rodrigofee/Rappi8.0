/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rappi;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Transacao implements Estado {

    public Estado showMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da compra:");
        float valor = sc.nextFloat();

        System.out.println("Informe o tipo de pagamento:");
        int tipoPagamento = sc.nextInt();
        System.out.println("Digite 1 para CONFIRMAR");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            return new HistoricoTransacoes();
        } else {
            System.out.println("Opção não encontrada!");
        }
        return this;
    }

}
