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
public class ödevaralıkjohnwails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int n=input.nextInt();
        double c=1;
       
        for (int i = 1; i <n; i++) {
            double c1=4*i*i;
            c=c*c1/(c1-1);
            
            
        }
        System.out.println(2*c);
        
    }
    
}
