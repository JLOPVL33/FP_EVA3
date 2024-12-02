/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_metodos;

/**
 *
 * @author Jennifer
 */
public class EVA3_4_METODOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int dia=1;
int num1=100, num2=10;
        System.out.println("Hello World!");
        System.out.println(encontrarMayor(100, 10));
        System.out.println(encontrarDiaSem(1));
}

    
    
    //VALOR MAS GRANDE ENTRE DIS NUMEROS
    public static int encontrarMayor(int num1, int num2){
        if(num1>num2){
return num1;
}else if (num1<num2){
return num2;
}else{
System.out.println("Son iguales");
return num1;
}
}
    //Metodo que regresa el día de la semana en textto.Pide el numero
    //(1-7) y regresa; Lunes, Martes, etc...
    public static int encontrarDiaSem(int dia){ 
        if (dia == 1){
            System.out.println("Lunes");
        }else if(dia==2){
            System.out.println("Martes");
        }else if(dia==3){
            System.out.println("Miercoles");
        }else if(dia==4){
            System.out.println("Jueves");
        }else if(dia==5){
            System.out.println("Viernes");
        }else if(dia==6){
            System.out.println("Sabado");
        }else if(dia==7){
            System.out.println("Domingo");
        }else{
            System.out.println("dia invalido");
        }
    return 0;
    }

    }

