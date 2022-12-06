/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer
 */
import java.util.Scanner;

public class ödevaralıkarirmetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println(" Lütfen bir tam sayı giriniz ");
        double a=inp.nextDouble();
        int t=0;
        int s=0;
        for (int i = 0; i <=a; i++) 
            if (a%i==0) {
                t+=i;
                s+=1;
                
                
            }
        if (t%s==0) {
            System.out.println("Aritmetik sayıdır");
            
            
        }
        else{
            System.out.println("Aritmetik sayı değildir");
        }
            
        }
        
    }
    

