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

public class ödevaralıkmaclaurin1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen terim sayısını giriniz");
        int n=input.nextInt();
        System.out.println("Lütfen sinüs değerini giriniz");
        int x =input.nextInt();
        int T =0;
        
        for (int i = 1; i <=n; i++) {
            int F=1;
            for (int j = 1; j <2*i-1; j++) {
               F=F*j;
                
            }
            T=T+((-1)^(i-1))*(x^(2*i-1))/F;
            
        }
        System.out.println(T);
        
    }
    
}
