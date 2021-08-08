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
public class Programa1 {
    public static void main(String[] args)
    {
        int nota1,nota2,nota3,Suma,Total;
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("INGRESE LA PRIMER NOTA: ");
        nota1=Teclado.nextInt();
        System.out.println("INGRESE LA SEGUNDA NOTA: ");
        nota2=Teclado.nextInt();
        System.out.println("INGRESE LA TECER NOTA: ");
        nota3=Teclado.nextInt();
        Suma = nota1 + nota2 +nota3;
        Total = Suma/3;
        System.out.println("El promedio es de: " + Total);   
       
    }
}
