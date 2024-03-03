/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem_1042;
import java.util.Scanner;
/**
 *
 * @author Vinicios
 */
public class Problem_1042 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        if (A<B && B<C){
        System.out.printf("%d\n", A);
        System.out.printf("%d\n", B);
        System.out.printf("%d\n", C);
        }else if(A<C && C<B){
        System.out.printf("%d\n", A);
        System.out.printf("%d\n", C);
        System.out.printf("%d\n", B);
        }else if(B<A && A<C){
        System.out.printf("%d\n", B);
        System.out.printf("%d\n", A);
        System.out.printf("%d\n", C);
        }else if(B<C && C<A){
        System.out.printf("%d\n", B);
        System.out.printf("%d\n", C);
        System.out.printf("%d\n", A);
        }else if(C<A && A<B){
        System.out.printf("%d\n", C);
        System.out.printf("%d\n", A);
        System.out.printf("%d\n", B);
        }else if(C<B && B<A){
        System.out.printf("%d\n", C);
        System.out.printf("%d\n", B);
        System.out.printf("%d\n", A);
        }
        System.out.println("");
        System.out.printf("%d\n",A);
        System.out.printf("%d\n",B);
        System.out.printf("%d\n",C);
        
    }
}
