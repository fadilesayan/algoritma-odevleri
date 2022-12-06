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
public class ödevaralıkex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("LÜTFEN bir n sayısı giriniz");
        int n=input.nextInt();
        System.out.println("Lütfen bir x değeri giriniz");
        int x=input.nextInt();
        int sonuç;
        sonuç=(1+x/n)^n;
        System.out.println("sonuç:"+sonuç);
    }
    
}
