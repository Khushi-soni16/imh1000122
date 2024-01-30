/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q3;

import java.util.Scanner;

public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task a: 
        displayTotalArguments(1, 2, 3, 4, 5);

        // Task b: 
        int maxNumber = findMax(10, 5, 8, 15, 3);
        System.out.println("Maximum number is: " + maxNumber);

        // Task c
        int sum = calculateSum(2, 4, 6, 8, 10);
        System.out.println("Sum of numbers is: " + sum);

        // Task d: 
        checkVariableArguments(true, "Hello", 3.14, 'A');

       
    }

    // Task a
    private static void displayTotalArguments(int... numbers) {
        System.out.println("Total number of arguments: " + numbers.length);
    }

    // Task b
    private static int findMax(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Task c
    private static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
     
return sum;
    }
    

    // Task d
    private static void checkVariableArguments(Object... args) {
        System.out.println("Variable arguments can accept different types.");
    }
}

    

