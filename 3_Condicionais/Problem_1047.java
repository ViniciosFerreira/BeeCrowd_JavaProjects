package com.mycompany.problem_1042;
// Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo.
// A seguir calcule a duração do jogo.
// Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

import java.util.Scanner;

    public class Problem_1047 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int hI = sc.nextInt();
            int mI = sc.nextInt();
            int hF = sc.nextInt();
            int mF = sc.nextInt();

            int duracao_horas = hF - hI;
            int resto_minutos = mF - mI;

            if(duracao_horas == 0 && resto_minutos == 0){
                duracao_horas = duracao_horas + 24;
            }
            // Bloco destinado a mudança no valor de horas ou minutos devido a uma interferência externa
            if(resto_minutos<0){
                duracao_horas = duracao_horas - 1;
                resto_minutos = 60 + resto_minutos;
                if(duracao_horas < 0){
                    duracao_horas = 24 + duracao_horas;
                }
            }

            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", duracao_horas, resto_minutos);

        }
    }