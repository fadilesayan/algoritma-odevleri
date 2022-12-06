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
public class ödevaralıkkök3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen terim sayısı giriniz");
        int n=input.nextInt();
        int t=1;
        for (int i = 1; i <=n-1; i++) {
            t=1+1/(2+1/t);
            
            
            
        }
        System.out.println("karekök3:"+1+(1/t));


    }
    
}
