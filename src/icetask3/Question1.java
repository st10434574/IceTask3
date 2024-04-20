/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask3;

/**
 *
 * @author Kaylee
 * 
 */
import java.util.Scanner;
public class Question1 {
    
    
    
   
    public static boolean isValid(String s){
        
        int between =0 ; /*Checks what is between the opening and closing parentheses*/
        
        for(int i =0; i<s.length(); i++){
            char x = s.charAt(i);
            if (x=='(' || x=='[' || x=='{'){
              between++;
              return true;
                
            }
            else if (x==')' || x==']' || x=='}'){
                between--;
              return false;
            
            }
       
    }  

    return between==0;
}
   

 public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Please enter a combination of parentheses");
        
        String user = input.next();
        
        System.out.println( isValid(user));
        
 }
        

    }
    
     

     
     
     
     
