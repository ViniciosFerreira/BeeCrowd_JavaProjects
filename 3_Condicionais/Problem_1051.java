package com.mycompany.problem_1042;
import java.util.Scanner;
public class Problem_1051 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double salario = sc.nextDouble();
    double iprf = 0;

    if(salario <= 2000.00){
        System.out.println("Isento");
    } else if (salario>=2000.01 && salario <= 3000.00) {
        salario = salario - 2000;
        iprf = salario* 0.08;
        System.out.printf("R$ %.2f\n", iprf);
    } else if (salario>=3000.01 && salario <= 4500.00){
        iprf = salario* 0.18;
        System.out.printf("R$ %.2f\n", iprf);
    } else if (salario > 4500.00){
        iprf = salario* 0.28;
        System.out.printf("R$ %.2f\n", iprf);
    }

    }
}
