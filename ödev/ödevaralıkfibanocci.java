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
public class ödevaralıkfibanocci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı girniz");
        int sayi=input.nextInt();
        int s1=0;
        int s2=1;
        int toplam;
        for (int i = 1; i <=sayi; i++) {       
            toplam=s1+s2;
            s1=s2;
            s2=toplam;
            System.out.print(s1+",");

        }
        System.out.println("fibonaci dizisi");
        
        
    }
    
}
