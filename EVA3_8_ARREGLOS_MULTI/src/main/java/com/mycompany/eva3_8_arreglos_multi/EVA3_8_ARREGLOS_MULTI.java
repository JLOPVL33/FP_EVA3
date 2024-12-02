/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_arreglos_multi;

/**
 *
 * @author Jennifer
 */
public class EVA3_8_ARREGLOS_MULTI {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //LLENADO
        int[][][] cubo = new int[2][5][3];
        System.out.println(cubo.length);
        System.out.println(cubo[1].length);
        System.out.println(cubo[0][0].length);
         for(int i = 0; i < 2; i++) {//1ER DIMENSIÓN
            for (int j = 0; j < 5; j++) {//2DA DIMENSIÓN
                for (int k = 0; j < 3; k++) {//3ER DIMENSIÓN
                    cubo[i][j][k] = (int)(Math.random() * 100);
                }
            }
         }
        //IMPRIMIR LOS VALORES
        for (int i = 0; i < cubo.length; i++){
            for(int j = 0; j < cubo.length; j++){
                for(int k = 0; k < cubo[i][j].length; k++){
                    System.out.print("[" + cubo[i][j][k] + "]");
                }
            }
        }
    }
}
