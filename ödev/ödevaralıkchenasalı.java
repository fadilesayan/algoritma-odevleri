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
public class ödevaralıkchenasalı {
    public static boolean asalmi(int x){
        {
            
            
        
            
            for (int i = 2; i <x; i++) {
                if (x%i==0) {
                    return false;
                    
                }
                
            }
            return true;
        }
        
    }
        
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir n sayısı giriniz");
        int n=input.nextInt();
        if (asalmi(n)) {
            System.out.println("ASALDIR");
            
        }
        if (asalmi(n+2)) {
            System.out.println("CHEN ASALIDIR");
            
        }
           else {
            System.out.println("CHEN ASALI DEĞİLDİR");
        }
       
    }
    
}
