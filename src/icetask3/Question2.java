/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask3;

import java.util.Scanner;

/**
 *
 * @author Kaylee
 */
public class Question2 {

    public static int sumOfOddSquares(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (2 * i - 1) * (2 * i - 1);

        }
        return sum;
    }

    public static void main(String[] args) {
        {

            Scanner input = new Scanner(System.in);

            int n = input.nextInt();

            System.out.println("The sum of the square of the first n odd numbers are " + sumOfOddSquares(n));
        }

    }
}
