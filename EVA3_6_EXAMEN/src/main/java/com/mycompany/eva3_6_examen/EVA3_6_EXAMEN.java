/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_examen;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA3_6_EXAMEN {

        public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
        
    public static final int EMPATE = 0;
    public static final int GANA = 1;
    public static final int PIERDE = 2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        int jugadaUsu;
        int jugadaC;
        int resuJugada;
        
        do{
            jugadaUsu = capturaJugada("Intoduce tu jugada (1-PIEDRA, 2-PAPEL, 3-TIJERAS, 0-SALIR):");
            jugadaC = generarJugadaComp();
            resuJugada = evaluarJugadas(jugadaUsu, jugadaComp);
        }while(jugadaUsu != 0);//mientras no quiera salir (opcion 0)
       
    }
    //PEDIR LOS DATOS AL USUARIO
    public static int capturarJugada(String mensaje){
        Scanner captu = new Scanner(System.in);
        System.out.println(mensaje);
        int resu = captu.nextInt();
        return resu;                
    }
    //GENERAR JUGADA DE LA COMPUTADORA
    public static int generarJugadaComp(){
        int resu;
        double valor = Math.random();
            double o=0;
        if((valor >= o) && (valor < 0.3))
            resu = 1; //PIERDA
        else if((valor >= 0.3) && (valor < 0.6))
            resu = 2;//PAPEL
        else
            resu = 3;//TIJERA
        return resu;
    }
    
    //EVALUAR JUGADAS: 0-EMPATE, 1-GANO, 2-PERDIO
    public static int evaluarJugadas(int jugadaU, int jugada){
        //9 POSIBLES COMBINACIONES
        int resu;
        if((jugadaU == PIEDRA) && (jugada == PIEDRA))
            resu = EMPATE;
        else if((jugadaU == PIEDRA) && (jugada == PAPEL))
            resu = PIERDE;
        else if((jugadaU == PIEDRA) && (jugada == TIJERA))
            resu = GANA;
        else if((jugadaU == PAPEL) && (jugada == PIEDRA))
            resu = GANA;
        else if((jugadaU == PAPEL) && (jugada == PAPEL))
            resu = EMPATE;
        else if((jugadaU == PAPEL) && (jugada == TIJERA))
            resu = PIERDE;
        else if((jugadaU == TIJERA) && (jugada == PIEDRA))
            resu = PIERDE;
        else if((jugadaU == TIJERA) && (jugada == PAPEL))
            resu = GANA;
        else
            resu = EMPATE;
        return resu;
    }

    private static int capturaJugada(String intoduce_tu_jugada_1PIEDRA_2PAPEL_3TIJERA) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }
