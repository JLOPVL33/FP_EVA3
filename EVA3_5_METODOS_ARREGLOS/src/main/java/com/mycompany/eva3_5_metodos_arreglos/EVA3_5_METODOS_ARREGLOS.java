/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_metodos_arreglos;

/**
 *
 * @author Jennifer
 */
public class EVA3_5_METODOS_ARREGLOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String díasSemana[] = {"Lunes", "Martes", "Miercoles",
                           "Jueves", "Viernes", "Sabado", "Domingo"};
        imprimirArreglo(díasSemana);
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
                           "Junio", "Julio", "Agosto", "Septiembre",
                           "Octubre", "Noviembre", "Diciembre"};
        imprimirArreglo(meses);
         int billetes[] = {20, 50, 100, 200, 500, 1000};
        imprimirBilletes(billetes);
        }
    
    //Imprimir arreglo de cadenas
    public static void imprimirArreglo(String[] arreglo){
        for(int í = 0; í < arreglo.length; í++)
            System.out.println(arreglo[í]);
    }
    public static void imprimirBilletes(int[] arreglo){
        for(int í = 0; í < arreglo.length; í++)
            System.out.println(arreglo[í]);
    }
}
