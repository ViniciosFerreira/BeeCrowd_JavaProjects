
package com.mycompany.problem_1043;
import java.util.Scanner;

public class Problem_1043 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float A = entrada.nextFloat();
        float B = entrada.nextFloat();
        float C = entrada.nextFloat();
        float trianguloAB = Math.abs(A-B);
        float trianguloBC = Math.abs(B-C);
        float trianguloCA = Math.abs(C-A);; 
        float somaAB = A+B;
        float somaBC = B+C;
        float somaCA = C+A;
        float perimetro = A+B+C;
        float area = ((A+B)*C)/2;
        if ((A > trianguloBC && A < somaBC) || (B > trianguloCA && B < somaCA)|| (C > trianguloAB && C < somaAB)){
        System.out.printf("Perimetro = %.1f\n", perimetro);
        }else{
        System.out.printf("Area = %.1f\n", area);   
        }
    }
}
