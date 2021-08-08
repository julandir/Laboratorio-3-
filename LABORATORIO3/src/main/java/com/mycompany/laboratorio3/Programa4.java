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
public class Programa4 {
    public static void main(String[] args)
    {
        int cantidadCA, Monto;
        double Comision, Salario;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("INGRESAR LA CANTIDAD DE CARROS VENDIDOS: ");
        cantidadCA = Teclado.nextInt();
        System.out.println("INGRESAR EL MONTO POR EL CUAL FUERON VENDIDOS LOS CARROS: ");
        Monto = Teclado.nextInt();
        Comision = Monto * 0.05;
        Salario = 1000 + (150 * cantidadCA) + Comision;
        System.out.println("EL SALARIO TOTAL ES: " + Salario);
        
    }
}
