/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_arreglos_multi;

/**
 *
 * @author Jennifer
 */
public class EVA3_10_ARREGLOS_MULTI {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int quintos [][][][][]= new int [1][3][2][5][2];
       
     
        
        for (int i = 0; i < quintos.length; i++) {
            for (int j = 0; j < quintos[i].length; j++) {
                for (int k = 0; k < quintos[i][j].length; k++) {
                    for (int l = 0; l < quintos[i][j][k].length; l++) {
                        for (int m = 0; l < quintos[i][j][k][l].length; l++) {
                       
                         
                          quintos[i][j][k][l][m]=(int)(Math.random()*10);
                            System.out.print("["+ quintos [i][j][k][l][m] + "]");
                         
                        }
                    }
                         
                }
            }
        }
        
    }
}
