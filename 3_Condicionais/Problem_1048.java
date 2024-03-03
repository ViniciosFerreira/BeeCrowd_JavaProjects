/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem_1048;

import java.util.Scanner;

/**
 *
 * @author Vinicios
 */
public class Problem_1048 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float salario = entrada.nextFloat();
    if (salario > 0 && salario <= 400.00){
        double ganho = salario*0.15; 
        double salario_novo = ganho+salario;
        System.out.printf("Novo salario: %.2f\n", salario_novo);
        System.out.printf("Reajuste ganho: %.2f\n", ganho);
        System.out.println("Em percentual: 15 %");
    }else if ((salario > 400.00 && salario <= 800.00)){ 
        double ganho = salario*0.12; 
        double salario_novo = ganho+salario;  
        System.out.printf("Novo salario: %.2f\n", salario_novo);
        System.out.printf("Reajuste ganho: %.2f\n", ganho);
        System.out.println("Em percentual: 12 %");
    }else if ((salario > 800.00 && salario <= 1200.00)){ 
        double ganho = salario*0.10; 
        double salario_novo = ganho+salario;            
        System.out.printf("Novo salario: %.2f\n", salario_novo);
        System.out.printf("Reajuste ganho: %.2f\n", ganho);
        System.out.println("Em percentual: 10 %");
    }else if ((salario > 1200.00 && salario <= 2000.00)){ 
        double ganho = salario*0.07; 
        double salario_novo = ganho+salario;            
        System.out.printf("Novo salario: %.2f\n", salario_novo);
        System.out.printf("Reajuste ganho: %.2f\n", ganho);
        System.out.println("Em percentual: 7 %");
    }else { 
        double ganho = salario*0.04; 
        double salario_novo = ganho+salario; 
        System.out.printf("Novo salario: %.2f\n", salario_novo);
        System.out.printf("Reajuste ganho: %.2f\n", ganho);
        System.out.println("Em percentual: 4 %");
    }
    
    }
}
