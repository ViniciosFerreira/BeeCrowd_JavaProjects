/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem_1044;
import java.util.Scanner;
/**
 *
 * @author Vinicios
 */
public class Problem_1044 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        
        if((A>B) && A%B == 0){
           System.out.printf("Sao Multiplos\n");
        }else if((B>A) && B%A == 0){
            System.out.printf("Sao Multiplos\n");
        } 
        else{
           System.out.printf("Nao sao Multiplos\n"); 
        }
    }
}
