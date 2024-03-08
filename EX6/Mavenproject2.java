/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;



import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX6 TP2
public class Mavenproject2 {

    public static void main(String[] args) {
                System.out.println("Entrer un nombre entier : ");
                Scanner in=new Scanner(System.in);
                int n=in.nextInt();
                int a=0;
                    for(int i=2;i<n;i++){
                        if(n%i==0)
                            a=1;
                    }
               if(a==0)
                   System.out.println("Le nombre est premier\n");
               else
                   System.out.println("Le nombre n'est pas premier\n");
        for(int i=2;i<=n;i++){
            for(int j=2;j<i/2;j++){
                 a=0;
                        if(i%j == 0){
                            a=1;
                            break;}
                    }
               if(a==0)
                   System.out.println("Le nombre "+i+" est premier");
               else{
                   System.out.println("Le nombre "+i+" n'est pas premier");
                  
               }
        }
        }       
}
