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
public class aralıködevkök5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen terim saysısını giriniz");
        int n=input.nextInt();
        int t=1; 
        for (int i = 0; i < n; i++) {
            t=4+(1/t);
            
            
        }
        System.out.println("karekök5:"+2+(1/t));
        
        
        
    }
    
}
