/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem_2235;

import java.util.Scanner;

/**
 *
 * @author Vinicios
 */
public class Problem_2235 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int teste1 = A+B-C;
        int teste2 = A+C-B;
        int teste3 = B+C-A;
        int teste4 = A-B;
        int teste5 = A-C;
        int teste6 = B-C;
       
        
        if (teste1==0 || teste2==0 || teste3==0|| teste4==0|| teste5==0|| teste6==0){
        System.out.println("S"); 
        }else{
        System.out.println("N");    
        }
            
        
    }
}
