/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_351;

import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 */
public class Questao_351 {

    public static void main(String[] args) {
        String nome[] = new String[5];
        String numero;
        int num;
        
        for(int x = 0; x<5; x++){
            nome[x] = JOptionPane.showInputDialog("Digite o nome "+(x+1));
        }
        
        do{
            numero = JOptionPane.showInputDialog("Buscar Nome[1 a 5- Selecionar o nome; 0 - Fim do Programa");
            num = Integer.parseInt(numero);
            
            if(num != 0){
                if(num > 5){
                    System.out.println("Parâmetro incorreto, tente Novamente!");
                } else{
                    System.out.println("Nome: "+nome[num-1]);
                }
            }else{
                System.out.println("\n==========================");
                System.out.println("Fim do programa!");
                System.out.println("==========================");
            }
        }
        while(num != 0);
    }
}
