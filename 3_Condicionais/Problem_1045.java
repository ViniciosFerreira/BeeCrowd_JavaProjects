package com.mycompany.problem_1042;
import java.util.Scanner;
public class Problem_1045 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double A = 0;
    double B = 0;
    double C = 0;
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double x = Math.pow(B,2) +Math.pow(C,2);
    //Define a ordem dos lados (Apenas o maior lado realmente importa
    if ((a>b && b>c) ||(a>c && c>b)){
    //A é o maior lado
    A = a;
    B = b;
    C = c;
    }
    if ((b>a && a>c) ||(b>c && c>a)){
    //B é o maior lado
    A = b;
    B = a;
    C = c;
    }
    if ((c>a && a>b) ||(c>b && b>a)){
    //C é o maior lado
    A = c;
    B = a;
    C = b;
    }

    if( A >= (B + C) ){
        System.out.println("NAO FORMA TRIANGULO");

    }else {
        if (Math.pow(A, 2) == x) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if (Math.pow(A, 2) > x) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (Math.pow(A, 2) < x) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == B && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((A == B || B == C || A == C) && !(A == B && B == C)) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
}
