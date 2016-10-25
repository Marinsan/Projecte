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
        boolean camuflatge = false;

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
                 
                default:
                    System.out.println("Opció erronea.");
                }
           } while (!(menu==0));
        
        
        
    
        }

}
