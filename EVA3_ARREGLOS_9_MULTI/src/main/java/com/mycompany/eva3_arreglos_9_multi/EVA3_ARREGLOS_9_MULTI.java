/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_arreglos_9_multi;

/**
 *
 * @author Jennifer
 */
public class EVA3_ARREGLOS_9_MULTI {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] billetes = {20, 50, 100, 200, 500, 1000};
        String[][] ciudades = {{"Aguascalientes", "Calvillo", "Jesús María"},
                               {"Ensenada", "Mexicali", "Tecate", "Tijuana"},
                               {"La Paz", "Cabo San Lucas", "San José del Cabo"}};
        
        for(int i = 0; 1 < ciudades.length; i++) {
            for(int j = 0; j < ciudades[i].length; j++) {
                System.out.println(ciudades[i][j]);
                
            }
        }
    }
}
