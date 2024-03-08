/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;



import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX3 TP2
public class Mavenproject2 {

    public static void main(String[] args) {
            System.out.println("entrer le nombre N (Nombre de termes) : ");
            Scanner in=new Scanner(System.in);
            int N=in.nextInt();
            int i=2;
            double sum=1.0f;
                while(i<=N){
                    sum+=1./i;
                    i++;
                }
            System.out.println("La somme est : "+sum);  
     
    }       
}
