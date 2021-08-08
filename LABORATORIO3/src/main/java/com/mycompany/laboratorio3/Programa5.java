/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio3;

import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author Jose David
 */
public class Programa5 {
    public static void main(String[] args)
    {
        int Partic,Parcial,Parcial2,Examenfinal;
        double Pon1,Pon2,Pon3,Pon4,Total;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("INGRESE LA NOTA DE LA PARTICIPACION: ");
        Partic=Teclado.nextInt();
        System.out.println("INGRESAR LA NOTA DEL PRIMER PARCIAL: ");
        Parcial=Teclado.nextInt();
        System.out.println("INGRESAR LA NOTA DEL SEGUNDO PARCIAL: ");
        Parcial2=Teclado.nextInt();
        System.out.println("INGRESAR LA NOTA DEL TERCER PARCIAL: ");
        Examenfinal=Teclado.nextInt();
        Pon1=Partic*0.1;
        Pon2=Parcial*0.25;
        Pon3=Parcial2*0.25;
        Pon4=Examenfinal*0.4;
        Total= Pon1 + Pon2 + Pon3 + Pon4;
        System.out.println("NOTA FINAL:" + Total);
        
       
    }
}
