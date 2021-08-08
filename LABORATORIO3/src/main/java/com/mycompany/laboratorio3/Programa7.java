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
public class Programa7 {
    public static void main(String[] args)
    {
       int Totalhoras,Sem,Dias,Horas;
       Scanner Teclado= new Scanner(System.in);
       System.out.println("INGRESAR HORAS: ");
       Totalhoras = Teclado.nextInt();
       Sem = Totalhoras/(24*7);
       Dias = Totalhoras % (24*7)/24;
       Horas = Totalhoras % 24;
       System.out.println("SEMANAS: " + Sem + " DIAS: " + Dias + "  HOIRAS: " + Horas + "");
       
    }
}
