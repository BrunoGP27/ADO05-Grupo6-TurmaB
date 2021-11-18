/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.ado5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class ADO5_Parte3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();{
        int n1, n2;
        n1 = gerador.nextInt(101);
        System.out.println(n1);
        System.out.println("Digite um numero");
        n2 = input.nextInt();

        if (n2 == n1)
            System.out.println("Voce ganhou o jogo!!");
        else
            for (int i = 0; i < 5; ) {
                n2 = input.nextInt();
            if (n2 == n1)
                System.out.println("Voce ganhou o jogo!!");
            if (n2 < n1){

                System.out.println("Esta Frio");}
            if (n2 > n1){
                i++;
                System.out.println("quente");}
            else {
                    i++;
                System.out.println("Numero incorreto");}
            if(i == 4)
                    break;



            }
        }System.out.println("Game over");
    }
}