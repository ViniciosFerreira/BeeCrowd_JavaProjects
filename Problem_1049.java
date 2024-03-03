/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problem_1049;
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
       if(carac1 == "vertebrado" && carac2 == "ave" && carac3 == "carnivoro"){
           System.out.println("aguia");   
       }else if (carac1 == "vertebrado" && carac2 == "ave" && carac3 == "onivoro"){
           System.out.println("pomba");
       }else if (carac1 == "vertebrado" && carac2 == "mamifero" && carac3 == "onivoro"){
           System.out.println("homem");
       }if (carac1 == "vertebrado" && carac2 == "ave" && carac3 == "carnivoro"){
           System.out.println("");    
    }
    }    
}
