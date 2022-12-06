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
public class ödevaralıkmaclaurincos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen terim sayısını girniz");
        int n=input.nextInt();
        System.out.println("Lütfen cosinüs değerini girniz");
        double x =input.nextInt();
        x=Math.toRadians(x);
         double T=1;
         
         for (int i = 1; i <n; i++) {
             int F=1;
             for (int j = 1; j <=2*i; j++) {
                 F=F*j;
                 
                 
              
             }
             T+=Math.pow(-1,i)*Math.pow(x, 2*i)/F;
             
        
    }
                      System.out.println(T);

    
}
}
