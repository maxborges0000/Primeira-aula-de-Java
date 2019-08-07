/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author ifg
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 int numconta = 0;
 int saldo = 0;
 int despesas = 0;
 int credito = 0;
 int limite = 0;
 double limitefinal = 0;
 
 
 
        Scanner entrada = new Scanner(System.in);
 
        
        System.out.printf("\tNúmero da conta:\n",
 		numconta);
        numconta = entrada.nextInt();
        System.out.printf("\n Saldo disponivel: \n",
 		saldo);
        saldo = entrada.nextInt();
        
        
        System.out.printf("\n Quanto gastou: \n",
 		despesas);
        despesas = entrada.nextInt();
        
        
        System.out.printf("\n Crédito aplicado: \n",
 		credito);
        credito = entrada.nextInt();
    System.out.printf("\n limite de cŕedito aprovado: \n",
 		limitefinal);
   
    limitefinal = entrada.nextInt();
    
    limitefinal = saldo + despesas - credito;
    
    if(limitefinal > limite){
        System.out.printf("\nLimite de credito excedido");
        
    }
    else{
        System.out.printf("\tAINDA HÁ LIMITE!\n");
    }
    }

    }

        // TODO code application logic here
    
    

