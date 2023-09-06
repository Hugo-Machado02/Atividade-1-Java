/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.questao_360;

import javax.swing.JOptionPane;
/**
 *
 * @author Hugo
 */
public class Questao_360 {

    public static void main(String[] args) {
        int ult_dia[] = new int[12], data, dia, mes;
        String signo[] = new String[12], sUlt_dia, sData, sDia, sMes;
        
        for(int x=0; x<12; x++){
            signo[x] = JOptionPane.showInputDialog("Digite o Sígno do mês "+(x+1));
            sUlt_dia = JOptionPane.showInputDialog("Digite o Ultimo dia para o signo de "+signo[x]);
            
            ult_dia[x] = Integer.parseInt(sUlt_dia);
        }
        System.out.println("========================================");
        System.out.println("----------- TABELA DE SIGNOS -----------");
        System.out.println("----------------------------------------");
        System.out.println("Mês \t Ultimo Dia \t signo");
        System.out.println("----------------------------------------");
        for(int x=0; x<12; x++){
            System.out.println((x+1)+" \t "+ult_dia[x]+" \t\t "+signo[x]);
        }
        System.out.println("========================================");
        
        sData = JOptionPane.showInputDialog("digite data no formato ddmm ou 9999 para terminar");
        data = Integer.parseInt(sData);
        
        while(data != 9999){            
        dia = data / 100;
        mes = data % 100;
        mes--;
        
        if(dia > ult_dia[mes]){
            mes = (mes+ 1) %12;
        }
        System.out.println();
        System.out.println("===============================");
        System.out.println("------------ SIGNO ------------");
        System.out.println("===============================");
        System.out.println("Signo: "+signo[mes]);
        System.out.println("===============================");
        
        sData = JOptionPane.showInputDialog("digite data no formato ddmm ou 9999 para terminar");
        data = Integer.parseInt(sData);
        }
        
        System.out.println();
        System.out.println("===============================");
        System.out.println("Fim da Aplicação");
        System.out.println("===============================");
    }
}
