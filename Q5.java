/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q5;

import java.util.*;
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Prompt user to enter array elements
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

      
        findSumAndDisplayReverse(arr);

       
    }

    private static void findSumAndDisplayReverse(int... numbers) {
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of values: " + sum);

     
        System.out.println("Values in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
 


    
    

