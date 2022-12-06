


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
public class ödevaralıkbrothers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Lütfen terim saysısı giriniz");
       int n=input.nextInt();
       double toplam=0;
       
        for (int k = 0; k <=n; k++) {
        toplam+=(double)Math.pow(-1,k)/(2*k+1);//  üs alma işlemi Math.pow kulllandık5
        
        
            
            
        }
        toplam=4*toplam;
        System.out.println(toplam);
        
        
        
        
        
        
        
        
  
        
    }
    
}
