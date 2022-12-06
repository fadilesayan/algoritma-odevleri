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

public class ödevaralıkbinom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir x değerini girniz");
        double x=input.nextDouble();
        System.out.println("Lütfen bir n değerini girniz");
        double n=input.nextDouble();
        double sonuç=Math.pow(1+x/n, n);
        System.out.println("Sonuç:"+sonuç);
        
        
        
        

    }
    
}
