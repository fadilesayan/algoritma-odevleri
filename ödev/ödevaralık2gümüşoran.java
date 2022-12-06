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
public class ödevaralık2gümüşoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir uzunluk giriniz");
      double u=input.nextDouble();
                
        double b;
        double a;
        b=u/(2+Math.pow(2, 5)   );
        a=u-b;
        System.out.println(a+" ,  "+b);
        
    }
    
}
