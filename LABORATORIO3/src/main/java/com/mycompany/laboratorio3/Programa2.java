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
public class Programa2 {
    public static void main(String[] args)
    {
       int horastra, sueldo, Total;
       Scanner Teclado = new Scanner(System.in);
       
       System.out.println("INGRESAR HORAS TRABAJADAS DURANTE LA SEMANA: ");
       horastra = Teclado.nextInt();
       System.out.println("INGRESAR SUELDO POR HORA: ");
       sueldo = Teclado.nextInt();
       Total = horastra*sueldo;
       System.out.println("SUELDO TOTAL: " + Total);
       
      
    }
}
