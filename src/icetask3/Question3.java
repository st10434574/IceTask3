/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask3;

/**
 *
 * @author Kaylee
 */



public class Question3 {
    
    
    

    
    public static void main(String[]args){
        
        
        int a= 10;
        int b= 5;
        int gcd =0;
    
        for(int i=1; i<=a && i<= b;i++){
            if(a%i==0 && b%i==0){
            gcd =i;
        }
     }
        System.out.println("The value of the greatest common denominator of value a and value b is"+ " " +gcd );
     
    }
}
