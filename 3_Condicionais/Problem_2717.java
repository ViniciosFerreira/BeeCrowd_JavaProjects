/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem_2717;

import java.util.Scanner;

/**
 *
 * @author Vinicios
 */
public class Problem_2717 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tempo = a+b;
        if (n >= tempo){
          System.out.println("Farei hoje!");  
        }else{
           System.out.println("Deixa para amanha!");   
        }
        
    }
}
