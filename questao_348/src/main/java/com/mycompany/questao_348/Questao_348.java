/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_348;

/**
 *
 * @author Hugo
 */

import javax.swing.JOptionPane;
public class Questao_348 {

    public static void main(String[] args) {
        String nome[] = new String[5];
        String not1, not2;
        double n1[] = new double[5];
        double n2[] = new double[5];
        double media[] = new double[5];

        
        for(int x = 0; x<5; x++){
            nome[x] = JOptionPane.showInputDialog("Nome do "+(x+1)+"º Aluno");
            not1 = JOptionPane.showInputDialog("Nota 1");
            not2 = JOptionPane.showInputDialog("Nota 2");
            
            n1[x] = Double.parseDouble(not1);
            n2[x] = Double.parseDouble(not2);
            media[x] = (n1[x] + n2[x]) /2;
        }
        
        for(int x = 0; x<5; x++){
            System.out.println("-------------------------------------");
            System.out.println("Nome do Aluno: "+nome[x]);
            System.out.println("-------------------------------------");
            System.out.println("Nota 1: "+n1[x]);
            System.out.println("Nota 2: "+n2[x]);
            System.out.println("Media: "+ media[x]);
            System.out.println("-------------------------------------");
            System.out.println();
        }
        
    }
}
