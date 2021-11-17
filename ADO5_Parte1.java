/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.ado5;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ADO5_Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String  resposta = "a";
        
        System.out.println("Escolha a alternativa que represente o valor binario de 97? \n A)1100001 \n B)1100011 \n C)01100110 \n D)110110 \n E)1110111 ");
        
        String alternativa;
        int cont = 2;
        
        for(int i=1; i<=3; i++){
            System.out.println(" Resposta: ");
            alternativa = input.next();

            
            if(alternativa.equals(resposta)){
                System.out.println("Alternativa correta");
                break;
            }else{
                System.out.println("Resposta incorreta, tente novamente. \nEscolha a alternativa que represente o valor binario de 97? \n A)1100001 \n B)1100011 \n C)01100110 \n D)110110 \n E)1110111 \n");
                System.out.println(" Você tem " + cont -- + " chances");
            }
        }
    }
}
