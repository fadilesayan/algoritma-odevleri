/*
 * To change this license header, choose License Headers in Project .
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer
 */
import java.util.Scanner;
public class ödevaralıkexN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir x değeri girniz");
        int x=input.nextInt();
        System.out.println("Lütfen terim sayısını giriniz");
        int N=input.nextInt();
        int T=1;
        int F =1;
        for (int i = 1; i <=N-1; i++) {
            F=F*i;
            T=T+x^1/F;
            
            
            
        }
        System.out.println(T);
        
        
    }
    
}
