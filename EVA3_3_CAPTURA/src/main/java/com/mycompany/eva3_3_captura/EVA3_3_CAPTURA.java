/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA3_3_CAPTURA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String nombre = capturarTexto("Introduce tu nombre:");
        String apellido = capturarTexto("Introduce tu apellido:");
        int edad = capturarEnteros("Introduce tu edad:");
        double salario = capturarDoubles("Introduce tu salario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario" + salario);
    }
    //CAPTURAR TEXTO
    public static String capturarTexto(String mensaje){
        Scanner captura = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = captura.nextLine();
        return texto;
    }
    //CAPTURAR ENTEROS
    public static int capturarEnteros(String mensaje){
        Scanner captura = new Scanner(System.in);
        int valor = captura.nextInt();
        System.out.println(mensaje);
        return valor;
}
    //CAPTURAR DOUBLES
    public static int capturarDoubles(String mensaje){
        Scanner captura = new Scanner(System.in);
        System.out.println(mensaje);
        int valor = captura.nextInt();
        return valor;
    }
}
