/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_u3;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Examen_U3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner captura = new Scanner(System.in);
       
    }
    // Método para obtener la calificación mayor y menor
    public static int[] encontrarMayorYMenor(int[] calificaciones){
        int mayor = calificaciones[0];
        int menor = calificaciones[0];

        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] > mayor) {
                mayor = calificaciones[i];
            }
            if (calificaciones[i] < menor) {
                menor = calificaciones[i];
            }
        }

        return new int[]{mayor, menor};
    }

    // Método para calcular el promedio de las calificaciones
    public static int calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int calif : calificaciones) {
            suma+= calif;
        }
        return suma / calificaciones.length;
    }

    // Método para obtener calificaciones mayores o iguales al promedio
    public static void calificacionesMayoresOIgualesAlPromedio(int[] calificaciones, int promedio) {
        System.out.println("Calificaciones mayores o iguales al promedio:");
        for (int calif : calificaciones) {
            if (calif >= promedio) {
                System.out.println(calif);
            }
        }
    }

    public static void numEst(String[] args) {
        Scanner captura = new Scanner(System.in);
        int numEstudiantes, ciclo = 1;

        System.out.println("Ingrese el número de estudiantes:");
        numEstudiantes = captura.nextInt();

        // Verificamos que el número de estudiantes sea mayor que 0
        if (numEstudiantes <= 0) {
            System.out.println("El número de estudiantes debe ser mayor a 0");
            return;
        }

        int[] calificaciones = new int[numEstudiantes];

        // Recolectamos las calificaciones de los estudiantes
        while (ciclo <= numEstudiantes) {
            System.out.println("Ingrese la calificación número " + ciclo + ":");
            int calif = captura.nextInt();

            if (calif >= 0 && calif <= 10) {
                calificaciones[ciclo - 1] = calif;
                ciclo++;
            } else {
                System.out.println("Ingrese una calificación válida entre 0 y 10.");
            }
        }

        // Calculamos el promedio de las calificaciones
        int promedio = calcularPromedio(calificaciones);
        System.out.println("El promedio de las calificaciones es: " + promedio);

        // Obtenemos la calificación mayor y menor
        int[] mayorYMenor = encontrarMayorYMenor(calificaciones);
        System.out.println("La calificación mayor es: " + mayorYMenor[0]);
        System.out.println("La calificación menor es: " + mayorYMenor[1]);

        // Mostramos las calificaciones mayores o iguales al promedio
        calificacionesMayoresOIgualesAlPromedio(calificaciones, promedio);
        System.out.println("La calificación mayor es: " + mayorYMenor[0]);
        System.out.println("La calificación menor es: " + mayorYMenor[1]);
        calificacionesMayoresOIgualesAlPromedio(calificaciones, promedio);
    }
}




