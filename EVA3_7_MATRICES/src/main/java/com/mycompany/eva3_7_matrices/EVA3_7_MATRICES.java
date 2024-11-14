/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_matrices;

/**
 *
 * @author Jennifer
 */
public class EVA3_7_MATRICES {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] arreglo = new int[5];//Arreglo de una sola dimensión
        int[][] matriz = new int[3][3];//Hoja de Excel
        matriz[0][0] = 100; //Primer Posición
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900; //Ultima posición
        
        for(int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + matriz[i][j] +" ]");
            }
        System.out.println("");
    }
}
