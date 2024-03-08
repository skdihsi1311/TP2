/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;


import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX2 TP2
public class Mavenproject2 {

    public static void main(String[] args) {
            System.out.println("entrer l'entier X et l'entier n successivement tel que X^n : ");
            Scanner in=new Scanner(System.in);
            int x=in.nextInt();
            int n=in.nextInt();
            int resultat=1;
                System.out.println("X^n = "+pow(x,n));
                    for(int i=0;i<n;i++){
                        resultat=resultat*x;
                    }
                System.out.println("X^n = "+resultat);
        
       
    }       
}
