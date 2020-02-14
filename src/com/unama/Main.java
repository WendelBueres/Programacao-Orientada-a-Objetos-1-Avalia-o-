package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadenumeros;
        quantidadenumeros = 0;
        double medianumeros;
        medianumeros = 0;
        double menornumero;
        menornumero = 999999999;
        double maiornumero;
        maiornumero = 0;
        System.out.println("(Para finalizar informe 0) \nInforme o número: ");
        double numero = sc.nextDouble();
        while (numero >= 0.1) {
            quantidadenumeros = (quantidadenumeros + 1);
            medianumeros = (medianumeros + numero);
            if (maiornumero < numero) {
                maiornumero = numero;
            }
            if (menornumero > numero) {
                menornumero = numero;
            }
            System.out.println("Informe o numero: ");
            numero = sc.nextDouble();
        }
        if (numero == 0) {
            System.out.println("Quantidade de números: " + quantidadenumeros);
            System.out.println("Média: " + (medianumeros / quantidadenumeros));
            System.out.println("Maior número: " + maiornumero);
            System.out.println("Menor número: " + menornumero);
        }
    }
}

