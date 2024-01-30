/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deletion;

import java.util.*;
public class Deletion {

   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        System.out.print("Enter the total number of elements in the array: ");
        int totalElements = scanner.nextInt();

       
        if (totalElements > arraySize) {
            System.out.println("Invalid input. Total elements cannot exceed the array size.");
            return;
        }

     
        int[] userArray = new int[arraySize];

      
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < totalElements; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            userArray[i] = scanner.nextInt();
        }

     
        System.out.println("Array elements are:");
        for (int i = 0; i < totalElements; i++) {
            System.out.print(userArray[i] + " ");
        }
        System.out.println();

        
        System.out.print("Enter the index position for deletion: ");
        int deletionIndex = scanner.nextInt();

  
        if (deletionIndex >= 1 && deletionIndex <= totalElements) {
            
            for (int i = deletionIndex - 1; i < totalElements - 1; i++) {
                userArray[i] = userArray[i + 1];
            }

         
            System.out.println("Array after deletion:");
            for (int i = 0; i < totalElements - 1; i++) {
                System.out.print(userArray[i] + " ");
            }
        } else {
            System.out.println("Invalid index position for deletion.");
        }

        
    }
}

    

