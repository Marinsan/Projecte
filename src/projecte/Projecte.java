/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Projecte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        String model = null, nom = null;
        int carregador = 0, menu;
        double preu = 0.0;
        boolean camuflatge = false boolean omplit = false;
        char portacamuflatge = ' ';

        do {
            System.out.println("\n\nMenú de l'aplicació:");
            System.out.println("0. Sortir");
            System.out.println("1. Entrar arma");
            System.out.println("2. Llistar armes");
            System.out.println("3. Modificar arma");
            System.out.println("4. Eliminar arma");
            menu = ent.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Exit");
                    break;

                case 1:
                    if (!omplit) {
                        System.out.println("Introdueix les dades");
                        System.out.println("Model: ");
                        model = ent.skip("[\r\n]*").nextLine();
                        System.out.println("Nom: ");
                        nom = ent.skip("[\r\n]*").nextLine();
                        System.out.println("Carregador: ");
                        carregador = ent.skip("[\r\n]*").nextInt();
                        System.out.println("Preu:");
                        preu = ent.skip("[\r\n]*").nextDouble();
                        System.out.println("Camuflatge (Si/No): ");
                        do {
                            portacamuflatge = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (portacamuflatge != 'S' && portacamuflatge != 'N');
                        camuflatge = (portacamuflatge == 'S');
                        
                        omplit = true;
                    } else {
                        System.out.println("Ja has introduït dades, si vols omplir-lo esborra'l primer.");
                    }
                    break;

                case 2:
                    

                    break;
                case 3:

                    break;
                case 4:

                    break;

                default:
                    System.out.println("Opció erronea.");
            }
        } while (!(menu == 0));

    } 

}
