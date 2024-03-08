/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;



import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX4 TP2
public class Mavenproject2 {

    public static void main(String[] args) {
            System.out.println("Entrer le nombre de ligne: ");    
            Scanner in=new Scanner(System.in);
            int N=in.nextInt();
                for(int i=0;i<N;i++){
                    for(int j=0;j<=i;j++){
                        System.out.print("*");
                
                }
                    System.out.println("\n");
                }
     
    }       
}
