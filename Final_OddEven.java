
package com.mycompany.final_oddeven;
import java.util.Scanner;
/**
 *
 * @author Augustus
 */
public class Final_OddEven {

    public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    System.out.println("Please enter your number");
    int num1 = Input.nextInt();
    if (num1 % 2 == 0){
         System.out.println("Even");
    }else{
         System.out.println("Odd");
    
}
}
}

