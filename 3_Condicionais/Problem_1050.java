package com.mycompany.problem_1042;
import java.util.Scanner;

public class Problem_1050 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String num = sc.nextLine();
        if(num.equals("61")){
        System.out.println("Brasilia");
        }
        else if(num.equals("71")){
            System.out.println("Salvador");
        }
        else if(num.equals("11")){
            System.out.println("Sao Paulo");
        }
        else if(num.equals("21")){
            System.out.println("Rio de Janeiro");
        }
        else if(num.equals("32")){
            System.out.println("Juiz de Fora");
        }
        else if(num.equals("19")){
            System.out.println("Campinas");
        }
        else if(num.equals("27")){
            System.out.println("Vitoria");
        }
        else if(num.equals("31")){
            System.out.println("Belo Horizonte");
        }
        else{
            System.out.println("DDD nao cadastrado");
        }
    }
}