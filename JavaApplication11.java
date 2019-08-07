/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author ifg
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long fatorial = 1;
        for (long n = 1; n <= 20; n++) {
                fatorial = fatorial * n;
            System.out.println("Fatorial de "+n+" = "+fatorial);
 

        
    }
    
}
}