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

public class ödevaralıkeksiksayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println(" Lütfen bir tam sayı girniz");
        int s=input.nextInt();
        int t=0;
        for (int i = 1; i <=s; i++) {
            if (s%i==0) {
                t+=i;
                
                
            }
            
        }
        if (t<2*s) {
            System.out.println("Eksik sayısıdr ve eksiklik miktarı="+(2*s-t));
            
        }
        else {
            System.out.println("Eksik sayı değildir");
        }
        
        
    }
    
}
