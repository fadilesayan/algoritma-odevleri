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

public class ödevaralıktribonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen  terim sayısını giriniz");
        int N=inp.nextInt();
        int T1=1;
        int T2=1;
        int T3=2;
        System.out.println(T1+","+T2+","+T3);
        for (int i = 1; i <N-3; i++) {
            int T4=T1+T2+T3;
            System.out.println ( T4);
            T1=T2;
            T2=T3;
            T3=T4;
            
        }
        
        
        
    }
    
}
