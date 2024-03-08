/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;


import java.util.Scanner;

/**
 *
 * @author pro
 */

//EX1 TP2
public class Mavenproject2 {

    public static void main(String[] args) {
 
        
        System.out.println("Entrer le nombre des entiers : "); 
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int [] num=new int[N];
        int sum=0;
        int prod=1;
            //boucle for
            for(int i=0;i<N;i++){
                System.out.println("Entrer le nombre : "+(i+1));
                num[i]=in.nextInt();
                sum+=num[i];
                prod*=num[i];
            }
            System.out.println("La somme est : "+sum+"        Le produit est : "+prod+"           La moyenne est : "+(sum/N));    
            //boucle while
            int i=0;      
            while (i<N){
            System.out.println("Entrer le nombre : "+(i+1));
            num[i]=in.nextInt();
            sum+=num[i];
            prod*=num[i];
            i++;
            } 
            System.out.println("La somme est : "+sum+"        Le produit est : "+prod+"           La moyenne est : "+(sum/N));    
            
            //boucle do while L
            do{
                System.out.println("Entrer le nombre : "+(i+1));
                num[i]=in.nextInt();
                sum+=num[i];
                prod*=num[i];
                i++;
            }
            while(i<N);
            System.out.println("La somme est : "+sum+"        Le produit est : "+prod+"           La moyenne est : "+(sum/N)); 
    
    }       
}
