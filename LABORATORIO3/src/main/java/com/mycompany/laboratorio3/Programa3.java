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
public class Programa3 {
    public static void main (String[] args)
    {
        int Ro,An,Es,Total;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("INGRESAR LA CANTIDAD DE DOLARES QUE TIENE RODRIGO: ");
        Ro =Teclado.nextInt();
        An = Ro/2;
        Es = (Ro + An)/2;
        Total = Ro + An +Es;
        System.out.println("RODRIGO TIENE: " + Ro + "$");
        System.out.println("ANDREA TIENE: " + An + "$");
        System.out.println("ESTEBAN TIENE: " + Es + "$");
        System.out.println("TOTAL " + Total + "$");
        
    }
}
