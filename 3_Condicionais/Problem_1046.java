/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem_1046;
import java.util.Scanner;
/**
 *
 * @author Vinicios
 */
public class Problem_1046 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int inicio = entrada.nextInt();
        int fim = entrada.nextInt();
        int dia = 24;
         
        if (((dia-inicio)+fim)>24){
          int diferença =  ((dia-inicio)+fim)-24;
          System.out.printf("O JOGO DUROU %d HORA(S)\n",diferença);    
        }else{
          int diferença =  ((dia-inicio)+fim);
          System.out.printf("O JOGO DUROU %d HORA(S)\n",diferença);
        }
    }
}
