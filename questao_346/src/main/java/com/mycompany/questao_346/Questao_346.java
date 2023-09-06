/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_346;

import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 */
public class Questao_346 {

    public static void main(String[] args) {
        int op;
        String frase, operacao;
        
        frase = JOptionPane.showInputDialog("Digite a Frase");
        
        System.out.println("============================================");
        System.out.println("Frase Digitada: "+ frase);
        System.out.println("============================================");
        
        do{
            operacao = JOptionPane.showInputDialog("Digite a Operação [1- comprimento da frase; 2- 2 Primeiros e 2 ultimos caracteres; 3 - Espelhar Frase; 4 -Fim");
            op = Integer.parseInt(operacao);
            switch(op){
                case 1: int valor = frase.length();
                    System.out.println("Tamanho da Frase: "+ valor);
                break;

                case 2: int contagem = frase.length();
                        String pt1 = frase.substring(0, 2);
                        String pt2 = frase.substring(contagem-2, contagem);
                        System.out.println(pt1+" || "+pt2);
                break;

                case 3: String inverter = new StringBuilder(frase).reverse().toString();
                        System.out.println("Frase Invertida: "+ inverter);
                break;

                case 4: System.out.println("Fim do Programa");
                break;

                default: System.out.println("Operador não reconhecido, Tente Novamente!");
            }
            System.out.println("============================================");
        }
        while(op != 4);
    }
}
