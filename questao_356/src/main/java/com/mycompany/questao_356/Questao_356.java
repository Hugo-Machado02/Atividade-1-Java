/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_356;

import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Hugo
 */
public class Questao_356 {

    public static void main(String[] args) {
        String nome[] = new String[15], sit[] = new String[15];
        String sPr1, sPr2;
        double valor, pr1[] = new double[15], pr2[] = new double[15], media[] = new double[15];
        
        for(int x = 0; x<15; x++){
            nome[x] = JOptionPane.showInputDialog("Nome do Aluno "+(x+1));
            sPr1 = JOptionPane.showInputDialog("Digite a PR1 de "+nome[x]);
            sPr2 = JOptionPane.showInputDialog("Digite a PR2 de "+nome[x]);
            
            pr1[x] = Double.parseDouble(sPr1);
            pr2[x] = Double.parseDouble(sPr2);
            media[x] = Math.round((pr1[x] + pr2[x]) /2);
            
            if(media[x] >= 6){
                sit[x] = "AP";
            } else{
                sit[x] = "RP";
            }
        }
        
        System.out.println("=================================================");
        System.out.println("=====================BOLETIM=====================");
        System.out.println("=================================================");
        System.out.println("Aluno \tPR1 \tPR2 \tMedia \tSituacao");        
        for(int x = 0; x<15; x++){
            System.out.println(nome[x]+"\t"+pr1[x]+"\t"+pr2[x]+"\t"+media[x]+"\t"+sit[x]+"\t");
        }
        System.out.println("=================================================");
    }
}
