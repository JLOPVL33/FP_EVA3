/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_m;

/**
 *
 * @author Jennifer
 */
public class EVA3_2_VALOR_RETORNO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Necesitamos recuperar el valor para poderlo usar
        int resultado;
        resultado = sumarDosNumeros(5, 10);
        System.out.println("Resultado = "  + resultado);
        System.out.println("resultado = " + sumarDosNumeros (100,200));
        
        sumarDosNumeros(100, 200);
          
    }
    public static int sumarDosNumeros(int num1, int num2){
        int suma;
        suma = num1 + num2;
        return suma;
    }
}
