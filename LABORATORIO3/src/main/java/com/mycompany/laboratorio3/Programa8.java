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
public class Programa8 {
    public static void main(String[] args)
    {
      double a,b,c;
      double De,Re,RDOS,GT;
      Scanner Teclado = new Scanner(System.in);
      
      System.out.println("INGRESAR EL VALOR DE A: ");
      a = Teclado.nextDouble();
      System.out.println("INGRESAR EL VALOR DE B: ");
      b = Teclado.nextDouble();
      System.out.println("INGRESAR EL VALOR DE C: ");
      c = Teclado.nextDouble();
      
      De=((Math.pow(b,2))-((4*a*c)));
      Re=((-b+Math.sqrt(Math.pow(b, 2)-((4*a*c)))));
      RDOS=((-b-(Math.sqrt(Math.pow(b, 2)-((4*a*c))))));
      GT=(-((b)/(2*a)));
      
      if(De > 0){
          System.out.println("X1 = " +Re/(2*a));
          System.out.println("X2 = " +RDOS/(2*a));
      }else if(De == 0) {
          System.out.println("X1 = " +GT);
          System.out.println("X2 = " +GT);      
      }else if(De < 0){
          System.out.println("NO HAY SOLUCION");
      }    
    }
 }
