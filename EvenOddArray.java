/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package even.odd.array;
import java.util.*;
public class EvenOddArray {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

     
        int[]arr = new int[arraySize];

        
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        
        int[] evenArray = new int[arraySize];
        int[] oddArray = new int[arraySize];

       
        int evenCount = 0;
        int oddCount = 0;

        
        for (int i = 0; i < arraySize; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[evenCount++] = arr[i];
            } else {
                oddArray[oddCount++] = arr[i];
            }
        }

        
        System.out.println("Original array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Display the array of even elements
        System.out.println("Array of even elements:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        
        System.out.println("Array of odd elements:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }

       
    }
}

    
    
