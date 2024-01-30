/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peak.element;

import java.util.*;
public class PeakElement {

    /**
     * @param args the command line arguments
     */
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

       
        int peakElementIndex = findPeakElement(arr);
        int peakElement =arr[peakElementIndex];

        System.out.println("Peak element in the array: " + peakElement);

        
    }

   
    private static int findPeakElement(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            
            if (array[mid] > array[mid + 1]) {
              
                right = mid;
            } else {
                
                left = mid + 1;
            }
        }

       
        return left;
    }
}

    
    

