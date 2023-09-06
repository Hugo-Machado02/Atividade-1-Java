/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_358;

import javax.swing.JOptionPane;

/**
 *
 * @author Hugo
 */
public class Questao_358 {

    public static void main(String[] args) {
        String com, ven;
        double compra[] = new double[10], venda[] = new double[10], lucro, porc_lucro;
        int lucmenor10, luc_menor_igual20, luc_maior20;
        lucmenor10 = 0;
        luc_menor_igual20 = 0;
        luc_maior20 = 0;
        
        for(int x = 0; x<10; x++){
            com = JOptionPane.showInputDialog("Valor de Compra do produto "+(x+1));
            ven = JOptionPane.showInputDialog("Valor de Venda do produto "+(x+1));
            
            compra[x] = Double.parseDouble(com);
            venda[x] = Double.parseDouble(ven);
            
            lucro =  venda[x] - compra[x];
            porc_lucro = (lucro *100)/compra[x];
            
            if(porc_lucro < 10){
                lucmenor10 += 1;
            }else{
                if(porc_lucro > 20){
                    luc_maior20 += 1;
                }else{
                    luc_menor_igual20 += 1;
                }
            }
            System.out.println();            
            System.out.println("============================");
            System.out.println("Produto "+(x+1));
            System.out.println("----------------------------");
            System.out.println("Valor de Compra: "+compra[x]);
            System.out.println("Valor de Venda: "+venda[x]);
            System.out.println("----------------------------");
            System.out.println("Porcentagem de Lucro: "+porc_lucro);
            System.out.println("============================");
        }
        
        System.out.println();        
        System.out.println("============================================================");
        System.out.println("------------------------ LUCROS (%) ------------------------");
        System.out.println("============================================================");
        System.out.println("Quantidade de produtos com lucros < 10%: "+lucmenor10);
        System.out.println("Quantidade de produtos com lucros >= 10% e <= 20%: "+luc_menor_igual20);
        System.out.println("Quantidade de produtos com lucros > 20%: "+luc_maior20);
        System.out.println("============================================================");


    }
}
