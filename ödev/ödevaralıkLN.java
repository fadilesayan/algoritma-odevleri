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

public class ödevaralıkLN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen terim sayısını giriniz");
        int N =input.nextInt();
        int t=0;
        
        for (int k = 0; k <N-1; k++) {
            
            t=t+1/((2*k+1)*(2*k+2));
                    

            
        }
        System.out.println(t);
        
    }
    
}
