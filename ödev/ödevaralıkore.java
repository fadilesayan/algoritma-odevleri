/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer
 */
import  java.util.Scanner;
public class ödevaralıkore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Lütfen birr tam sayı giriniz");
        int n=input.nextInt();
        int s=0;
        int toplam=0;
        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                s+=1;
                toplam+=(1/(double)i);
                
                
            }
            
        }
        if (s%toplam==0) {
            System.out.println("ore");
            
        }
        else{
            System.out.println(" ore değildir");
        }
        
    }
    
}
