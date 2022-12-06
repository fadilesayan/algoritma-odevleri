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

public class öddevaralıkmükemmelsayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int s=input.nextInt();
        
        int kalan =0;
        
        for (int i = 1; i <s; i++) {
             
            if (s%i==0) {
                kalan +=i;
                
                
            
        }
        }
            if (s==kalan) {
                System.out.println("Mükemmel sayı ");
                
            }
            else{
                System.out.println("Mükemmel sayı değildir");
            }
        
                
                
                
            
            
            
            
        }
        
        

    }
    

