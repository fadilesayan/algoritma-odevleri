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
public class ödevaralıkasal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı girniz");
        int n=input.nextInt();
        System.out.println(" BELİRLENEN ARALIKTAKİ ASAL SAYILAR");
        
        for (int i = 2; i <=n; i++) {               
            int s=0;

            
   
            for (int j = 2; j <i; j++) {
                
                if (i%j==0) {
                    s++;
                    
                 }   
                }
            if (s==0) {
                System.out.println(+i);
                
            }
            
            
                
            
                
            
        }
               
       
    }
}
    

