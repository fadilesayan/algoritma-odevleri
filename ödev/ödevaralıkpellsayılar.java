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

public class ödevaralıkpellsayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Lütfen terim sayısını giriniz");
        int N=input.nextInt();
        int P1=0;
        int P2=1;
        System.out.println(P1+","+P2);
        for (int i = 1; i <=N-2; i++) {
            int P3=2*P2+P1;
            System.out.println(P3);
            P1=P2;
            P2=P3;
            
            
        }
                
        
    }
    
}
