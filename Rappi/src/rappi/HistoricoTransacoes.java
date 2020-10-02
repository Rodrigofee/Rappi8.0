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
public class HistoricoTransacoes implements Estado {

    public Estado showMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seu histórico de pagamento:");
        
        System.out.println("Digite 1 para fazer uma nova compra");
        
        int opcao = sc.nextInt();

        if (opcao == 1) {
            return new Pontuacao();
        } else {
            System.out.println("Opção não encontrada!");
        }
        return this;
    }
}