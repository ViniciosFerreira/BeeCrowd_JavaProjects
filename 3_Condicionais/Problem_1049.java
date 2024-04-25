/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem_1042;
import java.util.Scanner;

/**
 *
 * @author Vinicios
 */
public class Problem_1049 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       String carac1 = entrada.nextLine();
       String carac2 = entrada.nextLine();
       String carac3 = entrada.nextLine();

       if (carac1.equals("vertebrado") && carac2.equals("ave") && carac3.equals("carnivoro")){
           System.out.println("aguia");   
       }
       if (carac1.equals("vertebrado") && carac2.equals("ave") && carac3.equals("onivoro")){
           System.out.println("pomba");
       }
       if (carac1.equals("vertebrado") && carac2.equals("mamifero") && carac3.equals("onivoro")){
           System.out.println("homem");
       }
       if (carac1.equals("vertebrado") && carac2.equals("mamifero") && carac3.equals("herbivoro")){
           System.out.println("vaca");
       }

       if (carac1.equals("invertebrado") && carac2.equals("inseto") && carac3.equals("hematofago")){
            System.out.println("pulga");
       }
       if (carac1.equals("invertebrado") && carac2.equals("inseto") && carac3.equals("herbivoro")){
           System.out.println("lagarta");
       }
       if (carac1.equals("invertebrado") && carac2.equals("anelideo") && carac3.equals("hematofago")){
           System.out.println("sanguessuga");
       }
       if (carac1.equals("invertebrado") && carac2.equals("anelideo") && carac3.equals("onivoro")){
           System.out.println("minhoca");
       }
    }
}
